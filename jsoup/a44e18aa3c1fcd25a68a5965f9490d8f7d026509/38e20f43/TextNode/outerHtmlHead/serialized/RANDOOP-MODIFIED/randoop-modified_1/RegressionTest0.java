import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode414();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3" + "'", str4, "3");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        boolean boolean3 = outputSettings0.prettyPrint;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder120();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument68();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>there</p>\n<p>now</p>\n<p>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument62();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder88();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>Hello</p>\n <div>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode250();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument204();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument213();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode2();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument325();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder227();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument93();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode256();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode129();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode319();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode166();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder120();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder364();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode218();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>there</p>\n<p>now</p>\n<p>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "now" + "'", str5, "now");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<table>\n <caption>\n  A caption\n </caption>\n <tbody>\n  <tr>\n   <td>One</td>\n   <td>");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder227();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder291();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />FourFive ");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString135();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "& \" \256\u0438\ud559" + "'", str5, "& \" \256\u0438\ud559");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings5.getcharsetEncoder();
        outputSettings0.setcharsetEncoder(charsetEncoder6);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode322();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder365();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table>");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder335();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p><b class=\"one\">One <i>Two <b>Three</b></i></b></p>\n<p><b class=\"one\"><i><b>");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString104();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString85();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Term" + "'", str5, "Term");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode360();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder227();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument93();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode95();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setprettyPrint(false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder120();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode172();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>there</p>\n<p>now</p>\n<p>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "now" + "'", str5, "now");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument225();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument270();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        outputSettings9.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings9.charsetEncoder;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <p><b>");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder70();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder307();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<h1>Hello \n <div>\n  There\n </div> now</h1> \n<h2>More </h2>\n<h3>");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument383();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument108();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode45();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode297();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument332();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode78();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument23();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument273();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        outputSettings9.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.prettyPrint(false);
        java.nio.charset.Charset charset21 = outputSettings20.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings15.charset(charset21);
        outputSettings12.setcharset(charset21);
        outputSettings9.charset = charset21;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        outputSettings0.indentAmount = 7;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument29();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder314();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode429();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode190();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode339();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a>Hello \n <div>");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNull(textNode9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder87();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode2();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode356();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode116();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument29();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder314();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode429();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode16();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a>Hello \n <div>");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder403();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode4();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder385();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode271();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col />");
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode129();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument226();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode196();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder328();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " three" + "'", str4, " three");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<b>1</b>\n<p><b>2</b>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder186();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n One Two \n <b>");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder270();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder220();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString135();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument99();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "& \" \256\u0438\ud559" + "'", str5, "& \" \256\u0438\ud559");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder182();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "One <span>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString111();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString33();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Else" + "'", str5, "Else");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype test" + "'", str6, "Doctype test");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode349();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder126();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>Hello</p>\n   </div>\n   <p>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument293();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument363();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument11();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder270();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument59();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("Doctype test");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype test" + "'", str1, "Doctype test");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder167();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder60();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html><head></head><body><div>   \n<p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <script>one</script>\n  <noscript></noscript>\n </head>\n <body>\n  <p>");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder4();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><i><b>This</b></i> is <i><b>");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument193();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder287();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  One");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder48();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode134();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder221();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>Hello <em>there</em> <em>");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">\n Text 1 updated\n <p>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        java.nio.charset.Charset charset9 = outputSettings8.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings3.charset(charset9);
        outputSettings0.setcharset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(false);
        java.nio.charset.Charset charset15 = outputSettings14.charset;
        outputSettings0.setcharset(charset15);
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings0.encoder();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charsetEncoder17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder156();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode71();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>");
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        outputSettings8.setcharset(charset17);
        outputSettings7.setcharset(charset17);
        boolean boolean21 = outputSettings7.getprettyPrint();
        boolean boolean22 = outputSettings7.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder385();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument129();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument152();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col />");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument362();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument108();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument96();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode307();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ital" + "'", str5, "Ital");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument244();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString31();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode273();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053" + "'", str2, "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder48();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode235();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument274();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>Hello <em>there</em> <em>");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode13();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder347();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ital" + "'", str5, "Ital");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head></head>\n <body>\n  pre \n  <script>inner</script>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder120();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString71();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>there</p>\n<p>now</p>\n<p>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Text 1 updated" + "'", str5, "Text 1 updated");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument108();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode45();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument4();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString64();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode379();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " POW!" + "'", str4, " POW!");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode78();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode159();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder188();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder185();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument275();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n One ");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode52();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder54();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " three" + "'", str4, " three");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<title>");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument108();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode45();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument384();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode404();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode241();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode278();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode107();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder314();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode156();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<a>Hello \n <div>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode322();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode183();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument211();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        boolean boolean10 = outputSettings9.prettyPrint();
        int int11 = outputSettings9.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode349();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode133();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode250();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode73();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo" + "'", str3, "foo");
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder48();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode235();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode325();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>Hello <em>there</em> <em>");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.jsoup.nodes.TextNode.lastCharIsWhitespace(stringBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder314();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument16();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<a>Hello \n <div>");
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode307();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ital" + "'", str5, "Ital");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        outputSettings9.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings9.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings9.charsetEncoder;
        boolean boolean14 = outputSettings9.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder12);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode250();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument385();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument397();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument60();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode425();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder172();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode112();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p>");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        java.nio.charset.Charset charset9 = outputSettings8.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings3.charset(charset9);
        outputSettings0.setcharset(charset9);
        boolean boolean12 = outputSettings0.getprettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        outputSettings8.setcharset(charset17);
        outputSettings7.setcharset(charset17);
        boolean boolean21 = outputSettings7.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode;
        outputSettings7.escapeMode = escapeMode23;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        outputSettings7.escapeMode = escapeMode26;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument193();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<textarea>");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument95();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        java.nio.charset.Charset charset3 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        int int7 = outputSettings2.indentAmount;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode2();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode356();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument204();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode7();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode349();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString56();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument22();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Good." + "'", str4, "Good.");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        outputSettings2.setindentAmount(4);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings2.getcharsetEncoder();
        outputSettings2.setprettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode250();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument385();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument397();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument60();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode425();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder172();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode358();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p>");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument226();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode354();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode;
        outputSettings5.escapeMode = escapeMode8;
        outputSettings2.setescapeMode(escapeMode8);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode78();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder338();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode43();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder379();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument19();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        java.nio.charset.Charset charset3 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings2.setindentAmount((int) (byte) 1);
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings2.charsetEncoder;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode2();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode356();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument204();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString130();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "X\n" + "'", str8, "X\n");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument357();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode144();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument234();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ital" + "'", str5, "Ital");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.prettyPrint(false);
        java.nio.charset.Charset charset7 = outputSettings6.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings1.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.charset(charset7);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode165();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        outputSettings8.setcharset(charset17);
        outputSettings7.setcharset(charset17);
        boolean boolean21 = outputSettings7.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument193();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode235();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument282();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        boolean boolean10 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        java.nio.charset.Charset charset28 = outputSettings27.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings22.charset(charset28);
        outputSettings19.setcharset(charset28);
        outputSettings18.setcharset(charset28);
        boolean boolean32 = outputSettings18.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        outputSettings18.escapeMode = escapeMode34;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings9.escapeMode(escapeMode34);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode360();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder326();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode144();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<b>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.prettyPrint(true);
        boolean boolean10 = outputSettings9.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        java.nio.charset.Charset charset28 = outputSettings27.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings22.charset(charset28);
        outputSettings19.setcharset(charset28);
        outputSettings18.setcharset(charset28);
        boolean boolean32 = outputSettings18.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode;
        outputSettings18.escapeMode = escapeMode34;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings9.escapeMode(escapeMode34);
        outputSettings9.prettyPrint = true;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        java.nio.charset.Charset charset9 = outputSettings8.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings3.charset(charset9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.prettyPrint(false);
        java.nio.charset.Charset charset20 = outputSettings19.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.charset(charset20);
        outputSettings11.setcharset(charset20);
        outputSettings10.setcharset(charset20);
        boolean boolean24 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode;
        outputSettings10.escapeMode = escapeMode26;
        outputSettings2.escapeMode = escapeMode26;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder188();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode165();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder377();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "five" + "'", str4, "five");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p =a=\"\">One<a <p=\"\">");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode377();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode2();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode356();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder34();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p><b>This</b> is <b>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset17 = outputSettings16.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        outputSettings8.setcharset(charset17);
        outputSettings7.setcharset(charset17);
        boolean boolean21 = outputSettings7.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        java.nio.charset.Charset charset28 = outputSettings27.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings22.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings22.prettyPrint(true);
        boolean boolean32 = outputSettings31.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.prettyPrint(false);
        java.nio.charset.Charset charset39 = outputSettings38.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings33.charset(charset39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.prettyPrint(false);
        java.nio.charset.Charset charset50 = outputSettings49.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings44.charset(charset50);
        outputSettings41.setcharset(charset50);
        outputSettings40.setcharset(charset50);
        boolean boolean54 = outputSettings40.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode;
        outputSettings40.escapeMode = escapeMode56;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings31.escapeMode(escapeMode56);
        outputSettings7.escapeMode = escapeMode56;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings7.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder271();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode65();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode148();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode406();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString119();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<br />");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " Percentage of net sales " + "'", str7, " Percentage of net sales ");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" $ 3,761 ", "Another");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument227();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode404();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode349();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder84();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode245();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument379();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode120();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode420();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder31();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><span>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode414();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument417();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode286();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>One <b>two</b><em>four</em>");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode19();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode292();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder120();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode319();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>there</p>\n<p>now</p>\n<p>");
        org.junit.Assert.assertNull(textNode5);
    }
}
