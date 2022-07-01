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
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementName("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementListName("\"hi!\"");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.loadTemplates();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python2Target0.getImplicitTokenLabel("\"\"hi!\"\"");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.getTemplates();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("_\"i\"");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\\1");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getListLabel("i");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getElementListName("\\0");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementName("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("\"\\\\\\\"i\"");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\\\"i");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\"_\"i\"\"");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\\\"i");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\"\"hi!\"\"Context");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getListLabel("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getListLabel("\"\"hi!\"\"Context");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.getTemplates();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getListLabel("\"\"");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementListName(" ");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitRuleLabel("\"_\"i\"\"");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("\"_\"i\"\"");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getImplicitSetLabel("");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementName("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitTokenLabel("\"hi!\"");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getElementListName("\"\\\"i\"");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\" \"");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\" \"");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\\\"i");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getImplicitSetLabel("\"\\12Context\"");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\\\"i");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("4.5.2.1");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getElementListName("\" \"");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getElementName("\\\"i\\\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("\"_\"i\"\"");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target0.getTemplates();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"\"hi!\"\"");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.getTemplates();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python2Target0.getAltLabelContextStructName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.loadTemplates();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getAltLabelContextStructName("\"\\12Context\"Context");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("\"\\12Context\"Context");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getElementListName("\\1");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementListName("\"\"\\12Context\"\"");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getAltLabelContextStructName("\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        java.lang.String str14 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getAltLabelContextStructName("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitSetLabel("\"0\"");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        python2Target4.language = "hi!";
        java.lang.String str10 = python2Target4.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet11 = python2Target4.badWords;
        python2Target0.badWords = strSet11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementName("\"\"\"\\12Context\"Context\"\"");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.encodeIntAsCharEscape((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getAltLabelContextStructName("\"hi!\"");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        int int16 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getAltLabelContextStructName("\"\"\"i\"\"\"");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("\\12");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\" \"Context", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getImplicitRuleLabel("i");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\"\"i\"\"");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("_\\1");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"12Context\"");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\"\\\"0\\\"Context\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementListName("_\"\\\\\\\"i\"");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String str13 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("i");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementName("");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        java.lang.String str7 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitTokenLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitRuleLabel("\"\\\"0\\\"Context\"");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.getTemplates();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        boolean boolean17 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python2Target0.getListLabel("\"\"\\12\"\"");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target0.getTemplates();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.language = "\"\"\\12Context\"Context\"";
        java.lang.String str3 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getImplicitSetLabel("\"\"\\\"i\"\"");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementListName("Python2");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.getTemplates();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = python2Target0.getImplicitSetLabel("_\\1");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target0.loadTemplates();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getAltLabelContextStructName("\"\"\\\"#\\\"\"\"");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = python2Target0.getElementName("\"_\\\"i\"");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String str4 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitTokenLabel("\"\"\"\\12Context\"\"\"");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitTokenLabel("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitSetLabel("tset\\\"\\\\\\\"i");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        boolean boolean6 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getListLabel("\"#\"");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitTokenLabel("\"\\12Context\"Context");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        java.lang.String str5 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"\\\"i\\\"\"");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        int int16 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.getTemplates();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getListLabel("\"\\12\"Context");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.lang.String str14 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getElementName("\"\"\\\"i\"\"");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getListLabel("d");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target0.encodeIntAsCharEscape(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.getTemplates();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitTokenLabel("\"hi!\"");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        python2Target0.language = "\\\"\\\"#\\\"\\\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getElementName("\"\\\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.loadTemplates();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        python2Target4.language = "hi!";
        java.lang.String str10 = python2Target4.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet11 = python2Target4.badWords;
        python2Target0.badWords = strSet11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target0.loadTemplates();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        boolean boolean17 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.getTemplates();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet10 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getListLabel("_tset");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.getTemplates();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        java.lang.String[] strArray17 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        python2Target0.targetCharValueEscape = strArray17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python2Target0.getImplicitRuleLabel("_\"\"\"hi!\"\"\"");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        boolean boolean7 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitRuleLabel("\"\"\"\\12Context\"Context\"\"");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        java.lang.String str15 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getListLabel("_\"\\\\\\\"i\"");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitTokenLabel("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        int int7 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getListLabel("_\"\\\"\\\\\\\"i\\\"\"");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitTokenLabel("64Contex");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.getCodeGenerator();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.getTemplates();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = python2Target0.getImplicitTokenLabel("_\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("_\\0");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        boolean boolean8 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("\\\"hi!\\\"\\\"Contex");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        boolean boolean14 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getImplicitSetLabel("\"_\\\"i\"");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementListName("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        int int13 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        java.lang.String str14 = python2Target0.getVersion();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getElementListName("\"\"\\\"i\"\"");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getAltLabelContextStructName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.getTemplates();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12\"\"Context", false);
        boolean boolean10 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        int int5 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getAltLabelContextStructName("\\\\12");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target0.loadTemplates();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.getTemplates();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitRuleLabel("\"12\\\"Contex\"");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"\\\"i\"");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        python2Target0.addBadWords();
        boolean boolean8 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("12\\\"Contex");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        boolean boolean17 = python2Target0.templatesExist();
        boolean boolean18 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getImplicitSetLabel("");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        boolean boolean14 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        java.lang.String str16 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getAltLabelContextStructName("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str5 = python2Target0.getLanguage();
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"\\\"hi!\\\"\\\"Contex\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("_tset\\12");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("\\12Context");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"\\\"0\\\"Context\"Context");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getElementListName("\"_\\\"i\"");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        java.lang.String str10 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementName("\\\"hi!\\\"\\\"Contex");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getListLabel("\"_\\\"i\"");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("\"\"hi!\"\"");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.util.Set<java.lang.String> strSet5 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getAltLabelContextStructName("_tset_\\1");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str11 = python2Target0.getLanguage();
        boolean boolean12 = python2Target0.templatesExist();
        python2Target0.language = "\\64Context";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getImplicitRuleLabel("\\\"\\\"\\\"hi!\\\"\\\"Context");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitTokenLabel("\"\"\\12Context\"Context\"");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        java.lang.String str7 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitRuleLabel("\"\"i\"\"");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\" \"Context", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementName("_tset\\12");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementName("\"\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"\"");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.getTemplates();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str5 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("_tset\"_tset\"\"\"");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        java.lang.String[] strArray7 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitSetLabel("\"\"_\\\\0\"\"");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getListLabel("\"\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"\"");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        boolean boolean7 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitRuleLabel("\"\\\"\\\"hi!\\\"\\\"Context\"");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = python2Target0.getAltLabelContextStructName("\"\\\"\\\"0\\\"Context\\\"Context\"");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = python2Target0.getImplicitRuleLabel("\"\\\"\\\"hi!\\\"\\\"Context\"Context");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.getTemplates();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        java.util.Set<java.lang.String> strSet9 = python2Target0.badWords;
        boolean boolean10 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementName(" \\\"Contex");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("\"\\12Context\"");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\"_tset\\0\"");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.templates;
        boolean boolean18 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getAltLabelContextStructName("_tset\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        int int7 = python2Target0.getInlineTestSetWordSize();
        boolean boolean8 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getElementListName("\\\"\\\\\\\\\\\\\\\"i\\\"");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        python2Target0.language = "\\\"\\\"#\\\"\\\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.loadTemplates();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getAltLabelContextStructName("\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getAltLabelContextStructName("1");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getElementName("\"\"\"\\\"hi!\\\"\\\"Contex\"\"\"");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        java.lang.String str9 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getElementName("\"\"hi!\"\"Context");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        boolean boolean5 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getListLabel("");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.getCodeGenerator();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\\\"\\\\\\\\\\\\\\\"i\\\"");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        boolean boolean9 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitTokenLabel("\\\"\\\\\\\\\\\\\\\"i\\\"");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getElementListName("\"\"tset\\\"\\\\\\\"i\"\"");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        boolean boolean17 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python2Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\\12\\\"\\\"Context\\\"\"");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementName("\\\"hi!\\\"\\\"ContexContext");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String str13 = python2Target0.language;
        python2Target0.language = "\"\\12Context\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target0.getTemplates();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getListLabel("hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getAltLabelContextStructName("\"\"\"\\12Context\"\"\"");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        java.lang.String str5 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"\\\"\"");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape((int) (short) 100);
        java.util.Set<java.lang.String> strSet6 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.getTemplates();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = python2Target0.getImplicitSetLabel("\"_tsetd\"");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        int int7 = python2Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet8 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementName("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getImplicitRuleLabel("\"\\\"12\\\"\"Context");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        int int7 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitSetLabel("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        boolean boolean14 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        java.lang.String str16 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getAltLabelContextStructName("\"\\\"i\"");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitTokenLabel("_tset\\\\12");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getAltLabelContextStructName("\\\"i\\\"");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = python2Target0.getAltLabelContextStructName("ython");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.loadTemplates();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementListName("\"\"0\"Context\"");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.getCodeGenerator();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.getTemplates();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        int int16 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getElementListName("\"\"i\"\"");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        boolean boolean16 = python2Target0.wantsBaseListener();
        java.lang.String str18 = python2Target0.encodeIntAsCharEscape((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getElementListName("\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getListLabel("_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python2Target0.getImplicitTokenLabel("\\\"\\\"\\\"hi!\\\"\\\"Context");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getElementName("\"\\\"\\\"i\\\"\\\"\"");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        python2Target0.language = "_\\1";
        int int10 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getListLabel("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python2Target0.getImplicitRuleLabel("\"_tsetd\"");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String str13 = python2Target0.language;
        boolean boolean14 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getImplicitTokenLabel("_\"\\\"\\\\\\\"i\\\"\"");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitTokenLabel("\"\\\"\\\"hi!\\\"\\\"Context\"");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        int int8 = python2Target0.getInlineTestSetWordSize();
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitTokenLabel("_\"\"");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementListName("_tset\" \"");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String str4 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\"\"\\\"i\"\"");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        java.lang.String str8 = python2Target0.getLanguage();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getAltLabelContextStructName("\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("\"\\12\"", true);
        java.util.Set<java.lang.String> strSet8 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getElementListName("");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str10 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitTokenLabel("\"\"\" \"Context\"\"");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        python2Target0.language = "\\\"\\\"#\\\"\\\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitSetLabel(" ");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getImplicitTokenLabel("_tset\"\"\\\"\\\"0\\\"Context\\\"Context\"\"");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getAltLabelContextStructName("\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        java.util.Set<java.lang.String> strSet9 = python2Target0.getBadWords();
        boolean boolean10 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.loadTemplates();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        java.lang.String str9 = python2Target0.language;
        int int10 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.loadTemplates();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        python2Target0.addBadWords();
        boolean boolean7 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.getTemplates();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        boolean boolean17 = python2Target0.wantsBaseListener();
        int int18 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getImplicitRuleLabel("\"Python2Context\"");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        boolean boolean8 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitRuleLabel("_tsetd");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"Context\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python2Target0.getListLabel("\"i\"");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("\"\"\"Python2\"\"\"");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python2Target0.getImplicitRuleLabel("_tset\"\"\"hi!\"\"\"");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        java.lang.String str14 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getListLabel("__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitSetLabel("\"\\\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        java.lang.String str5 = python2Target0.getLanguage();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray7 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.getTemplates();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        java.util.Set<java.lang.String> strSet9 = python2Target0.badWords;
        python2Target0.language = "1";
        python2Target0.language = "\" \"Context";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getAltLabelContextStructName("___\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str11 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("_\\64Context");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        boolean boolean17 = python2Target0.wantsBaseListener();
        java.lang.String str18 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getElementListName("\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getListLabel("_tset_\\1");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.loadTemplates();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        boolean boolean7 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitRuleLabel("\"12Context\"");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitTokenLabel("\"\"Python2\"\"");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python2Target0.getElementListName("\"\\\"0\\\"ContextContext\"");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        boolean boolean11 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getElementListName("\"\\12Context\"Context");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.getTemplates();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        boolean boolean13 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getElementListName("\"_tset\\0\"Context");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitTokenLabel("_\"\\\"\\\\\\\"i\\\"\"");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        int int13 = python2Target0.getSerializedATNSegmentLimit();
        boolean boolean14 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getElementListName("\" \\\"Conte\"");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"_ \\\"Contex\"");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        int int11 = python2Target0.getInlineTestSetWordSize();
        boolean boolean12 = python2Target0.wantsBaseListener();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"\"");
        java.lang.String[] strArray15 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getImplicitSetLabel("\\\\\\\"");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        python2Target0.language = "_\\1";
        boolean boolean10 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitTokenLabel("\"_ \\\"Contex\"");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.util.Set<java.lang.String> strSet5 = python2Target0.getBadWords();
        java.lang.String str6 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getAltLabelContextStructName("_tset\"\\\\\\\"i\"");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        boolean boolean12 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getListLabel("\"\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"\"");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        boolean boolean6 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getElementName("_tset\\\"\\\\\\\\\\\\\\\"i\\\"");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        boolean boolean4 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.loadTemplates();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String str13 = python2Target0.language;
        python2Target0.language = "\"\\12Context\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python2Target0.getAltLabelContextStructName("_tset\"\"\\\"\\\"0\\\"Context\\\"Context\"\"");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("_tset\\0");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.getTemplates();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str5 = python2Target0.getLanguage();
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"\\\"hi!\\\"\\\"Contex\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python2Target0.getImplicitSetLabel("_\\\"\\\"\\\\\\\"i\\\\\\\"\\\"\\\"");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"0\"Context");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("tset");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getAltLabelContextStructName("\"__tset\\\"\\\\\\\\\\\\\\\"i\\\"\"");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"\\\"0\\\"Context\"Context");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getImplicitSetLabel("\"\\\"\\\"#\\\"\\\"\"");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        boolean boolean10 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitSetLabel("\"\"\\\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromString("\"\\\"\\\"hi!\\\"\\\"Context\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python2Target0.getListLabel("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.util.Set<java.lang.String> strSet5 = python2Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        boolean boolean12 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getAltLabelContextStructName("\"\\\"0\\\"Context\"Context");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        int int23 = python2Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = python2Target0.getImplicitRuleLabel("_tset\"\"\"hi!\"\"Context\"");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        boolean boolean6 = python2Target0.templatesExist();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementListName("\"_tset\\0\"");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        int int23 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.gen;
        java.lang.String str25 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = python2Target0.getElementListName("d");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python2Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitTokenLabel("\"\"\"\\\"#\\\"\"\"\"");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12\"\"Context", false);
        java.lang.String str10 = python2Target0.getLanguage();
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitTokenLabel("\\\"\\\"\\\"hi!\\\"\\\"Contex\\\"\\\"");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        int int7 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getListLabel("\"\"tset\\\"\\\\\\\"i\"\"");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementListName("\"\\\"\\\"\\\"hi!\\\"\\\"Context\\\"\"");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        python2Target0.addBadWords();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\\0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.loadTemplates();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getElementListName("\"\"\\\"\\\"\\\\12Context\\\"\\\"\"\"Context");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        java.util.Set<java.lang.String> strSet15 = python2Target0.badWords;
        int int16 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str17 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python2Target0.getElementListName("_\\64Context");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getImplicitRuleLabel("_tset\"\"\"hi!\"\"\"");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        java.lang.String str19 = python2Target0.getTargetStringLiteralFromString("\"0\"Context");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target0.getTemplates();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        boolean boolean8 = python2Target0.templatesExist();
        java.util.Set<java.lang.String> strSet9 = python2Target0.getBadWords();
        boolean boolean10 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.loadTemplates();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        int int7 = python2Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getAltLabelContextStructName("\"4.5.2.1\"");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        boolean boolean7 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("Python2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python2Target0.getImplicitTokenLabel("\"\"hi!\"\"");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python2Target0.getImplicitRuleLabel("5.2");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        java.lang.String[] strArray19 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target0.loadTemplates();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target0.gen;
        int int11 = python2Target0.getInlineTestSetWordSize();
        boolean boolean12 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python2Target0.getImplicitSetLabel("_tset_tset\" \"");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        boolean boolean4 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("tset\\\" \\\"Conte");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        boolean boolean10 = python2Target0.supportsOverloadedMethods();
        boolean boolean11 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python2Target0.getImplicitRuleLabel("_\"\"\\\"\\\"\\\\12Context\\\"\\\"\"\"");
    }
}

