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
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder172();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <p>");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument50();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "This " + "'", str4, "This ");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString113();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2007 " + "'", str2, "2007 ");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder244();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode93();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString42();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder28();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p><b>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument186();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode352();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("one");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "one" + "'", str1, "one");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode24();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument89();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString131();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "X" + "'", str6, "X");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder237();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<img />");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString79();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "link" + "'", str9, "link");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode361();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder208();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<span>");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.jsoup.nodes.TextNode.TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text" + "'", str0, "text");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder390();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument100();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument381();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument22();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        boolean boolean3 = org.jsoup.nodes.TextNode.lastCharIsWhitespace(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode382();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode196();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder76();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 12.3% " + "'", str4, " 12.3% ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gone" + "'", str5, "Gone");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder183();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "One <span>two &amp;</span>");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode221();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder53();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<title>");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode171();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p><i><b>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode234();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode257();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument98();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode221();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument4();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode116();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument344();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument373();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode262();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.after(" 11.6% ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode283();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode58();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument38();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder186();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n One Two \n <b>");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument300();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder57();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder405();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode306();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\">");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder287();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder258();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  One");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument102();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument266();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument320();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode378();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.before("More");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder187();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n One Two \n <b>Three</b>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder70();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 12.3% " + "'", str4, " 12.3% ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder110();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table>\n <tbody>\n  <tr>\n   <td>2</td>\n  </tr>\n  <tr>\n   <td>");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument186();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode357();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode413();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode333();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument169();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode72();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode152();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder213();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "One <em>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.before(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder106();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder275();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder270();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n   <p>there</p>\n   <p class=\"second\">");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<abc_def id=\"1\">\n Hello\n</abc_def> \n<abc-def>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument412();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument177();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument51();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter3 = textNode2.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument329();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode405();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument9();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode312();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode222();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument393();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument338();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder370();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode248();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument174();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder401();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode119();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder401();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument295();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder394();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\">");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode155();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument359();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString102();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder380();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<table> \n <colgroup>");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode167();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder167();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html><head></head><body><div>   \n<p>");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("Hello");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl(" $ 712 ");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.encoder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charsetEncoder3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument240();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder205();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p>One <b>two</b><i>five</i><em>four</em>");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument100();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder26();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument355();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p><i><b>");
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString78();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Link" + "'", str3, "Link");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder407();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode345();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument93();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode426();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument167();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder223();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">\n Text 1 updated\n <p>One</p> Text 2 \n <p>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString55();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode36();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "users" + "'", str7, "users");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode326();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<textarea>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument96();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString77();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Test" + "'", str4, "Test");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder330();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<b></b>\n<b>bbb</b>\n<table>\n <tbody>\n  <tr>\n   <td>");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument76();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str9 = textNode8.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode11 = textNode8.splitText((int) (byte) 1);
        java.lang.String str13 = textNode8.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "text" + "'", str9, "text");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument170();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder421();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode23();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder240();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p><i><b>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p class=\"foo\">");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument276();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode114();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder97();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p><span>Two</span><span>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode254();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder318();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode53();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<font>Hello \n <div>");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        boolean boolean3 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString86();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode33();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode164();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Def" + "'", str3, "Def");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument89();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument57();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode370();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument313();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder323();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>1<b>2<i>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("Format test");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Format test" + "'", str1, "Format test");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder273();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<abc_def id=\"1\">");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode283();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode23();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument25();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument146();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument291();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument155();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder353();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr>");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode79();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder254();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument26();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode207();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode54();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument229();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder427();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder360();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode382();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder139();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument199();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode196();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder253();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument319();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument56();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode221();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument247();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder35();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument304();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder289();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder370();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode248();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder315();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<a>Hello \n <div>\n  there\n </div>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument170();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument34();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument177();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument26();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode78();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        boolean boolean3 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode28();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode326();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p><b>");
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder365();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " is " + "'", str3, " is ");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder287();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder115();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument162();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  One");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder147();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument291();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text \n <p>One</p>");
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder159();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder118();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument64();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        int int3 = outputSettings0.getindentAmount();
        outputSettings0.setindentAmount(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString108();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode202();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument223();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\tOne\n\tTwo\n\tThree\n" + "'", str6, "\n\tOne\n\tTwo\n\tThree\n");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder72();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode95();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder328();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<b>1</b>\n<p><b>2</b>");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode27();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        int int12 = outputSettings11.indentAmount();
        boolean boolean13 = outputSettings11.getprettyPrint();
        boolean boolean14 = outputSettings11.getprettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder9, 9, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode28();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder191();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<p>One <em>four</em><b>two</b>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder316();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<a>Hello \n <div>\n  there\n </div> <span>");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument355();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument178();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument311();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument11();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode293();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode343();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString34();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder294();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "< > & \" ' \327" + "'", str4, "< > & \" ' \327");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head></head>\n <body class=\"name\">\n  <font face=\"Arial\">\n   <div>");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder370();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode60();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument328();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode233();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString58();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "   \n" + "'", str6, "   \n");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument328();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode233();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder248();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument139();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<h1>Head</h1>\n<table>\n <tbody>\n  <tr>\n   <td>One</td>\n   <td>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument386();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode283();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode370();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode370();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder131();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder21();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n<head>\n<title>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <a>is</a><span>foo</span> <a>");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument46();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode77();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder263();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString86();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode339();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Def" + "'", str3, "Def");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument155();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument384();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("Five ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Five " + "'", str1, "Five ");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument89();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder211();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n One ");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument329();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder235();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a href=\"http://example.com/foo\" rel=\"nofollow\">");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode403();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument415();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode182();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode116();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode85();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder234();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument404();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument430();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument242();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString49();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Text " + "'", str8, "Text ");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode254();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder318();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode423();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<font>Hello \n <div>");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder49();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode268();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode296();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode51();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder396();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td>");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode119();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder117();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Check" + "'", str4, "Check");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>Hello</p>\n<p>there</p>\n<p>");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString55();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument55();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode102();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "users" + "'", str7, "users");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<div>\n <p>");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument40();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument265();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("Foo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Foo" + "'", str1, "Foo");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString23();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Four" + "'", str2, " Four");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fix " + "'", str3, "Fix ");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder372();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString68();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table>\n <tbody>\n  <tr>\n   <td>One</td>\n   <td>\n    <table>\n     <tbody>\n      <tr>\n       <td>Two</td>\n      </tr>\n     </tbody>\n    </table></td>\n   <td>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "five" + "'", str3, "five");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode293();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode343();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString34();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument243();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "< > & \" ' \327" + "'", str4, "< > & \" ' \327");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings4.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings4.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings9.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        outputSettings8.setescapeMode(escapeMode12);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument93();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString112();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument39();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2008 " + "'", str7, "2008 ");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument46();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder216();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div id=\"1\">\n Text 1 \n <p>");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument211();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode48();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument215();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument383();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder213();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "One <em>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder287();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString42();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  One");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("Two");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Two" + "'", str1, "Two");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument46();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder224();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder151();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">\n Text 1 updated\n <p>One</p> Text 2 \n <p>Two</p>\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<pre><code>");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder141();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\"></div>\n<div id=\"2\">");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder339();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<b>Two <p>");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument156();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder205();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument55();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>One <b>two</b><i>five</i><em>four</em>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument170();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode13();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder381();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode263();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<table> \n <colgroup> \n  <col />");
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument276();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument353();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder126();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode213();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>Hello</p>\n   </div>\n   <p>");
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode79();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder67();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode336();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello</title>");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode234();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder215();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div id=\"1\">");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument282();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument29();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder4();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<p><i><b>This</b></i> is <i><b>");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder140();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode179();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument26();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument30();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument81();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder126();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString124();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>Hello</p>\n   </div>\n   <p>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " $ 3,761 " + "'", str4, " $ 3,761 ");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument188();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder114();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nthere &amp; now &gt; \n<p>");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument3();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode181();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument214();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder209();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument162();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Four" + "'", str2, " Four");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<span>two</span>");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode109();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str6 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument26();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument378();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode323();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode78();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString108();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode260();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\tOne\n\tTwo\n\tThree\n" + "'", str6, "\n\tOne\n\tTwo\n\tThree\n");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder126();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ital" + "'", str8, "Ital");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>Hello</p>\n   </div>\n   <p>");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument393();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder83();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div>\n  one\n </div>\n <div>");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        int int6 = textNode5.childNodeSize();
        int int7 = textNode5.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode56();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder254();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder249();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<textarea>");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument268();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode123();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode119();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString48();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument97();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Check" + "'", str4, "Check");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        int int3 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings0.escapeMode();
        boolean boolean5 = outputSettings0.getprettyPrint();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument15();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString18();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode144();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gone" + "'", str9, "Gone");
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder109();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode187();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument233();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        java.nio.charset.Charset charset3 = null;
        outputSettings0.charset = charset3;
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode395();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument116();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder148();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder106();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString61();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n   <p>there</p>\n   <p class=\"second\">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Another" + "'", str4, "Another");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder370();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder357();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode341();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table>\n <tbody>\n  <tr>\n   <td>1</td>\n  </tr> \n  <tr>\n   <td>2</td>\n  </tr> \n  <tr>\n   <td> \n    <table>\n     <tbody>\n      <tr>\n       <td>3</td> \n       <td>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString101();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder280();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder379();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bbb" + "'", str2, "bbb");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<foo:bar id=\"1\" />\n<abc:def id=\"2\">\n Foo\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table>");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode353();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode389();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument428();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder72();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode95();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument87();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString51();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument209();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "One cloned" + "'", str4, "One cloned");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument300();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder345();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div> \n <a name=\"top\"></a>\n <p id=\"1\">");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode54();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString114();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument324();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2006 " + "'", str9, "2006 ");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder49();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode50();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode423();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument78();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument77();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument430();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode79();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument426();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument26();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument230();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument15();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode177();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument406();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder344();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<div>");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder407();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode263();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td>");
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode400();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString81();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        org.jsoup.nodes.Document document12 = serializedObjectSupporter0.deserializeObjectDocument120();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p><b>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u043f\u0440\u0438\u0432\u0435\u0442" + "'", str10, "\u043f\u0440\u0438\u0432\u0435\u0442");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument211();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder23();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder251();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder249();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder150();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder338();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a href=\"/foo\" rel=\"nofollow\">Link</a>\n<img src=\"/bar\" />");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>One cloned</p>\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<b>");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter10 = textNode9.serializedObjectSupporter;
        textNode9.text = "";
        java.lang.String str13 = textNode9.nodeName();
        java.lang.String str14 = textNode9.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.before((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument300();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder57();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder338();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString27();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<!DOCTYPE html>\n<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<b>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "now" + "'", str8, "now");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder310();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode96();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<span>Hello \n <div>\n  there\n </div>");
        org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument300();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument58();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString75();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Nice" + "'", str7, "Nice");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount(8);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings4.clone();
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument343();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder225();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument376();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p><b>");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument369();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString84();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder313();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Foo" + "'", str8, "Foo");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<a>");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode179();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument26();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument236();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder373();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument429();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString31();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument166();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053" + "'", str5, "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder47();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode255();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder90();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>Hello <em>there</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p>Hello</p>\n <div>\n  one\n </div>\n <div>\n  two\n </div>\n <p>");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument303();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString53();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument171();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Format test" + "'", str9, "Format test");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument93();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument277();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        boolean boolean6 = outputSettings4.getprettyPrint();
        boolean boolean7 = outputSettings4.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.indentAmount((int) (byte) 10);
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings4.encoder();
        outputSettings0.setcharsetEncoder(charsetEncoder10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.clone();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.getprettyPrint();
        boolean boolean3 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder126();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument270();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>Hello</p>\n   </div>\n   <p>");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode395();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode334();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder163();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString116();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " $ 1,109 " + "'", str3, " $ 1,109 ");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(true);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString72();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\271\262\263\274\275\276" + "'", str4, "\271\262\263\274\275\276");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter9 = textNode8.serializedObjectSupporter;
        textNode8.text = "";
        java.lang.String str12 = textNode8.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode5.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument327();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode56();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder254();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder249();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode318();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings4.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings4.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        boolean boolean9 = outputSettings8.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(true);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument170();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode70();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument133();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Def" + "'", str5, "Def");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Def" + "'", str7, "Def");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter3 = textNode2.serializedObjectSupporter;
        textNode2.text = "";
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument303();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument205();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument15();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode177();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument415();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("Five");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: Five");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount(8);
        outputSettings4.prettyPrint = false;
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument238();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.settext("Hello there");
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument328();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode233();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder248();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument298();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<h1>Head</h1>\n<table>\n <tbody>\n  <tr>\n   <td>One</td>\n   <td>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument300();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString132();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Five" + "'", str7, "Five");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder109();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument132();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table>\n <tbody>\n  <tr>\n   <td>");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder228();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder12();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder312();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder221();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "\nHello \n<b>there</b>");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<p>This <span>foo</span><a>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<html>\n <head>\n  <noscript></noscript>\n </head>\n <body>\n  <img src=\"foo\" />\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">\n Text 1 updated\n <p>");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument16();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString106();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument143();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString64();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pre " + "'", str6, "pre ");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " POW!" + "'", str8, " POW!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString108();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode241();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode196();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\tOne\n\tTwo\n\tThree\n" + "'", str6, "\n\tOne\n\tTwo\n\tThree\n");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument430();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder400();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode7();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument418();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument268();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<textarea>");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument211();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode48();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument215();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument370();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument132();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument97();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode382();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder139();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument403();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument155();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode414();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument249();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.before(" Text ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument430();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument318();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode306();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.getprettyPrint();
        boolean boolean3 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) (byte) 10);
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings7.setindentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings7.getcharsetEncoder();
        outputSettings0.charsetEncoder = charsetEncoder10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder209();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument84();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder400();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Four" + "'", str2, " Four");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<span>two</span>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td>");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode28();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder136();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<html>\n<head>\n<title>Check</title>");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode137();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString55();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder45();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder169();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "users" + "'", str7, "users");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<div>\n <p>");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<title>");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        boolean boolean6 = outputSettings4.getprettyPrint();
        boolean boolean7 = outputSettings4.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.indentAmount((int) (byte) 10);
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings4.encoder();
        outputSettings0.setcharsetEncoder(charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text(" there & now >");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Blah \000" + "'", str7, "Blah \000");
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.getescapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.getcharsetEncoder();
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder426();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head></head>\n <body>\n  <ol>\n   <li>One</li>\n  </ol>\n  <p>");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder49();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument384();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument365();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument53();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode234();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode395();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument68();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace(" aft");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aft" + "'", str1, "aft");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument365();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument53();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode32();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument352();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.getprettyPrint();
        boolean boolean3 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) (byte) 10);
        outputSettings0.prettyPrint = false;
        boolean boolean8 = outputSettings0.getprettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString81();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder272();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p><b>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u043f\u0440\u0438\u0432\u0435\u0442" + "'", str10, "\u043f\u0440\u0438\u0432\u0435\u0442");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<br>");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument276();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument73();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode53();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder43();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument328();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode233();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode45();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode254();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a>One</a> Two Three \n<i>Four</i> ");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString86();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder2();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode104();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Def" + "'", str3, "Def");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p><i><b>");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode136();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder174();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString36();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>\n <p>Hello</p>\n <p>there</p>\n</div>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "four" + "'", str5, "four");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder251();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument261();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<a href=\"/foo\" rel=\"nofollow\">Link</a>\n<img src=\"/bar\" />");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode201();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode391();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument16();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument86();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        org.jsoup.nodes.Node node5 = textNode2.attr(" Selling, general, and administrative ", " ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("Five");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument276();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument166();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode370();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode360();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode3();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder138();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder72();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument301();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<html>\n <head>\n  <title>Hello there</title> \n </head>\n <body>\n  <p id=\"1\">");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode155();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString38();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder237();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument355();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello there" + "'", str2, "Hello there");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<img />");
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder287();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder115();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument326();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder257();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  One");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ccc", ".");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode254();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString82();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument17();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode85();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder65();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head" + "'", str7, "Head");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<p title=\"&pi;\">");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument393();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode400();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder199();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>One <b>two</b><em>");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode382();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode281();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode167();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder140();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder401();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder266();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder389();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode242();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString65();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Two " + "'", str6, "Two ");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Blah \000" + "'", str7, "Blah \000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument282();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument29();
        org.jsoup.nodes.Document document10 = serializedObjectSupporter0.deserializeObjectDocument149();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode410();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument398();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode164();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode293();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode343();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument193();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode85();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode330();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument245();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode359();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder124();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div class=\"head\">\n  <p>Hello</p>\n </div>\n <p>");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString21();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Three " + "'", str3, " Three ");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode353();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p><b>Bold</b>");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder159();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode354();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>");
        org.junit.Assert.assertNull(textNode3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr(" three");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode96();
        org.jsoup.nodes.Node node6 = textNode5.previousSibling();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 12.3% " + "'", str4, " 12.3% ");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode196();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder220();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument408();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString86();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode171();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode240();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Def" + "'", str3, "Def");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Def" + "'", str5, "Def");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Def" + "'", str8, "Def");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument255();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder411();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument75();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder115();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td> $ 2,963 </td>\n   <td> $ 2,433 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument114();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder302();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<h1>");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode155();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument359();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n<head>\n<title>Check</title>");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode56();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode274();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument75();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<textarea>");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<html>\n<head>\n<title>Check</title>");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder314();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<a>Hello \n <div>");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode395();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder125();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder236();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <div class=\"head\">\n  <div>\n   <div class=\"foo\">\n    <p>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a rel=\"nofollow\">");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument232();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument170();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder149();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode13();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode329();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>\n<div id=\"2\">\n <p>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        outputSettings0.setprettyPrint(true);
        int int5 = outputSettings0.getindentAmount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode254();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString82();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument17();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode85();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString108();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Head" + "'", str7, "Head");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\tOne\n\tTwo\n\tThree\n" + "'", str10, "\n\tOne\n\tTwo\n\tThree\n");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder427();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString132();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument366();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Five" + "'", str7, "Five");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder29();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument329();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument31();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>Bold</b>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder243();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<div><p>");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString86();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument314();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode33();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode259();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Def" + "'", str3, "Def");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode3();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertNull(textNode2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument211();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode48();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument215();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument370();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder171();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<div>\n <p>Hello</p>\n <p>");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode119();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString135();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertNull(textNode3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "& \" \256\u0438\ud559" + "'", str4, "& \" \256\u0438\ud559");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode179();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode20();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode84();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode409();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder99();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode420();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p>One</p>\n <p><span>");
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString53();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument257();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument217();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Format test" + "'", str4, "Format test");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter3 = textNode2.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder265();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<textarea>");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<doc>\n <val>\n  One\n  <val>");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode28();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode416();
        org.jsoup.nodes.TextNode textNode10 = serializedObjectSupporter0.deserializeObjectTextNode84();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNull(textNode8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNull(textNode10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode196();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode216();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument276();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div>\n <p><b>");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode166();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString101();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument298();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder423();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument47();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bbb" + "'", str2, "bbb");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n   </tr>\n  </tbody>\n </table> <p>");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString125();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode293();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode343();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString34();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder144();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " $ 2,963 " + "'", str1, " $ 2,963 ");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "< > & \" ' \327" + "'", str4, "< > & \" ' \327");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p> Text \n <p>");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        boolean boolean2 = outputSettings0.getprettyPrint();
        boolean boolean3 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings6.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings6.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        boolean boolean12 = outputSettings10.getprettyPrint();
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.indentAmount((int) (byte) 10);
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings10.encoder();
        outputSettings6.setcharsetEncoder(charsetEncoder16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings6.clone();
        java.nio.charset.Charset charset19 = outputSettings18.charset;
        outputSettings0.charset = charset19;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode159();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder315();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument269();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<a>Hello \n <div>\n  there\n </div>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode(" $ 712 ", "\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      ");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        textNode2.setBaseUri("Two ");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " $ 712 " + "'", str4, " $ 712 ");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode12();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument224();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode85();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder234();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument285();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument17();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument319();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder420();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>One</b></p>\n<b> \n <table>\n  <tbody>\n   <tr>\n    <td><p><i>");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 1);
        outputSettings0.setprettyPrint(true);
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        java.lang.StringBuilder stringBuilder7 = serializedObjectSupporter0.deserializeObjectStringBuilder69();
        java.lang.StringBuilder stringBuilder8 = serializedObjectSupporter0.deserializeObjectStringBuilder300();
        org.jsoup.nodes.Document document9 = serializedObjectSupporter0.deserializeObjectDocument59();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<html>\n <head>\n  <title>Hello</title> \n </head>\n <body>\n  <p>One</p>\n  <p>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<h1>Hello </h1>\n<h2>There \n <hgroup>\n  <h1>Another</h1>\n  <h2>headline</h2>\n </hgroup> \n <hgroup>\n  <h1>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder47();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder427();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>Hello <em>there</em>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode196();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder220();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode49();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder37();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument72();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>Two</p>\n <p>Three</p>\n</div>\n<div id=\"2\">");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p><b>This</b> is <b>jsoup</b>.</p>\n</div> \n<div>\n <p>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings6.setindentAmount((int) (short) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings6.getescapeMode();
        outputSettings5.setescapeMode(escapeMode9);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr(" 11.6% ");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode57();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder74();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode370();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode173();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<html>\n <head>\n  <title>");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.Document document2 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode30();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument107();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString107();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder27();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument76();
        org.jsoup.nodes.TextNode textNode8 = serializedObjectSupporter0.deserializeObjectTextNode139();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " aft" + "'", str5, " aft");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(textNode8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder197();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder349();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument365();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder18();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString19();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<p>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p><b>One</b></p>\n<b>");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<textarea>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<p>This <a>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "How do you like it?" + "'", str7, "How do you like it?");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder268();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument211();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode160();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode127();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<doc>\n <val>\n  One\n  <val>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder38();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<a>");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder132();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder65();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<html>\n<head>\n<title>Check</title>");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p title=\"&pi;\">");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder276();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString53();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument257();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode144();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>\n <cust>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Format test" + "'", str4, "Format test");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(textNode6);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument167();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder49();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument76();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Two" + "'", str4, "Two");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode40();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument141();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode410();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder392();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody>");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode64();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument269();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder419();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<p><b>One</b></p>\n<b>");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.Document document1 = serializedObjectSupporter0.deserializeObjectDocument27();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode234();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString76();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder278();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XSS" + "'", str3, "XSS");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<body>\n <!-- comment -->\n <p><a href=\"foo\">");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode145();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder113();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode192();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument32();
        java.lang.StringBuilder stringBuilder9 = serializedObjectSupporter0.deserializeObjectStringBuilder32();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString81();
        java.lang.StringBuilder stringBuilder11 = serializedObjectSupporter0.deserializeObjectStringBuilder231();
        org.jsoup.nodes.TextNode textNode12 = serializedObjectSupporter0.deserializeObjectTextNode308();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<div>\n <p><b>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u043f\u0440\u0438\u0432\u0435\u0442" + "'", str10, "\u043f\u0440\u0438\u0432\u0435\u0442");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">");
        org.junit.Assert.assertNull(textNode12);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder1();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument316();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder278();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder303();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<div>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<body>\n <!-- comment -->\n <p><a href=\"foo\">");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<h1>Hello \n <div>");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder198();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString112();
        org.jsoup.nodes.TextNode textNode4 = serializedObjectSupporter0.deserializeObjectTextNode72();
        org.jsoup.nodes.TextNode textNode5 = serializedObjectSupporter0.deserializeObjectTextNode387();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder407();
        org.jsoup.nodes.Document document7 = serializedObjectSupporter0.deserializeObjectDocument269();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<p>One <b>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " three" + "'", str2, " three");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2008 " + "'", str3, "2008 ");
        org.junit.Assert.assertNull(textNode4);
        org.junit.Assert.assertNull(textNode5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td> 3.4% </td>\n   <td> 3.3% </td>\n   <td> 3.7% </td>\n  </tr>\n </tbody>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Selling, general, and administrative </th>\n   <td> $ 3,761 </td>\n   <td>");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings0.setindentAmount((int) (short) 10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.escapeMode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.charset("Foo ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Foo ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("One cloned", "Term");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("Def", "Blah \000");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.before("aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        org.jsoup.nodes.TextNode textNode1 = serializedObjectSupporter0.deserializeObjectTextNode378();
        java.lang.StringBuilder stringBuilder2 = serializedObjectSupporter0.deserializeObjectStringBuilder327();
        org.jsoup.nodes.Document document3 = serializedObjectSupporter0.deserializeObjectDocument420();
        java.lang.StringBuilder stringBuilder4 = serializedObjectSupporter0.deserializeObjectStringBuilder290();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder200();
        org.jsoup.nodes.TextNode textNode6 = serializedObjectSupporter0.deserializeObjectTextNode44();
        org.jsoup.nodes.TextNode textNode7 = serializedObjectSupporter0.deserializeObjectTextNode321();
        org.jsoup.nodes.Document document8 = serializedObjectSupporter0.deserializeObjectDocument15();
        org.jsoup.nodes.TextNode textNode9 = serializedObjectSupporter0.deserializeObjectTextNode177();
        java.lang.StringBuilder stringBuilder10 = serializedObjectSupporter0.deserializeObjectStringBuilder279();
        org.jsoup.nodes.Document document11 = serializedObjectSupporter0.deserializeObjectDocument65();
        java.lang.StringBuilder stringBuilder12 = serializedObjectSupporter0.deserializeObjectStringBuilder30();
        org.junit.Assert.assertNull(textNode1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "<b>1</b>\n<p><b>");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "<!DOCTYPE html>\n<html>\n <head></head>\n <body>\n  OneTwoThree\n  <link />Four");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<p>One <b>two</b><em>four</em>");
        org.junit.Assert.assertNull(textNode6);
        org.junit.Assert.assertNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(textNode9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<foo:bar id=\"1\" />\n<abc:def id=\"2\">");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<p><b>Bold</b>Two<i>");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        java.lang.StringBuilder stringBuilder3 = serializedObjectSupporter0.deserializeObjectStringBuilder154();
        org.jsoup.nodes.Document document4 = serializedObjectSupporter0.deserializeObjectDocument430();
        java.lang.StringBuilder stringBuilder5 = serializedObjectSupporter0.deserializeObjectStringBuilder400();
        java.lang.StringBuilder stringBuilder6 = serializedObjectSupporter0.deserializeObjectStringBuilder242();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "<p>");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "<table> \n <colgroup> \n  <col /> \n </colgroup>\n <colgroup> \n  <col /> \n  <col /> \n  <col /> \n </colgroup>\n <thead> \n  <tr> \n   <th> </th>\n   <th>2008 </th>\n   <th>2007 </th>\n   <th>2006 </th>\n  </tr>\n </thead>\n <tbody> \n  <tr> \n   <th scope=\"rowgroup\"> Research and development </th>\n   <td> $ 1,109 </td>\n   <td> $ 782 </td>\n   <td> $ 712 </td>\n  </tr>\n  <tr> \n   <th scope=\"row\"> Percentage of net sales </th>\n   <td>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "<div>\n <p>");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jsoup.nodes.SerializedObjectSupporter serializedObjectSupporter0 = new org.jsoup.nodes.SerializedObjectSupporter();
        java.lang.StringBuilder stringBuilder1 = serializedObjectSupporter0.deserializeObjectStringBuilder218();
        org.jsoup.nodes.TextNode textNode2 = serializedObjectSupporter0.deserializeObjectTextNode189();
        org.jsoup.nodes.TextNode textNode3 = serializedObjectSupporter0.deserializeObjectTextNode383();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString128();
        org.jsoup.nodes.Document document5 = serializedObjectSupporter0.deserializeObjectDocument249();
        org.jsoup.nodes.Document document6 = serializedObjectSupporter0.deserializeObjectDocument265();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "<div id=\"1\">\n Text 1 \n <p>One</p> Text 2 \n <p>");
        org.junit.Assert.assertNull(textNode2);
        org.junit.Assert.assertNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 12.3% " + "'", str4, " 12.3% ");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }
}
