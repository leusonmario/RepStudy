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
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.prettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        outputSettings7.setcharset(charset14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        outputSettings17.prettyPrint = false;
        int int20 = outputSettings17.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        int int23 = outputSettings21.indentAmount;
        int int24 = outputSettings21.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        int int28 = outputSettings27.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.clone();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings27.encoder();
        outputSettings21.setcharsetEncoder(charsetEncoder30);
        boolean boolean32 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings21.clone();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings21.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings21.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings17.escapeMode(escapeMode36);
        int int38 = outputSettings17.getindentAmount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.Charset charset3 = null;
        outputSettings2.setcharset(charset3);
        boolean boolean5 = outputSettings2.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings2.charsetEncoder;
        boolean boolean7 = outputSettings2.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount(32);
        java.nio.charset.Charset charset10 = outputSettings2.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings2.indentAmount(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "t");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str15 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("h");
        int int17 = textNode16.siblingIndex();
        java.lang.String str18 = textNode16.outerHtml();
        java.lang.String str19 = textNode16.baseUri();
        org.jsoup.nodes.TextNode textNode21 = textNode16.text("#text");
        textNode21.ensureAttributes();
        org.jsoup.nodes.Document document23 = textNode21.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.baseUri();
        java.lang.String str14 = textNode10.attr("text");
        java.lang.String str15 = textNode10.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node17 = textNode10.nextSibling();
        org.jsoup.nodes.Node node20 = textNode10.attr("hi!", "");
        textNode10.setBaseUri("h");
        java.lang.String str24 = textNode10.attr("i!");
        java.lang.String str25 = textNode10.text();
        java.lang.String str26 = textNode10.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes27 = textNode10.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "text" + "'", str26, "text");
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.gettext();
        int int9 = textNode2.siblingIndex();
        int int10 = textNode2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str13 = textNode12.baseUri();
        java.lang.String str14 = textNode12.text;
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node18 = textNode17.parent();
        boolean boolean19 = textNode12.equals((java.lang.Object) textNode17);
        boolean boolean20 = textNode17.isBlank();
        java.lang.String str21 = textNode17.nodeName();
        org.jsoup.nodes.Node node24 = textNode17.attr("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.childNodesCopy();
        org.jsoup.nodes.Node node26 = textNode17.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        java.nio.charset.Charset charset2 = null;
        outputSettings1.charset = charset2;
        java.nio.charset.Charset charset4 = outputSettings1.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        int int6 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.clone();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings7.getcharsetEncoder();
        outputSettings1.charsetEncoder = charsetEncoder8;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings1.indentAmount((int) ' ');
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        java.nio.charset.Charset charset15 = null;
        outputSettings14.charset = charset15;
        outputSettings14.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings14.prettyPrint(true);
        java.nio.charset.Charset charset21 = null;
        outputSettings14.setcharset(charset21);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings14.escapeMode;
        boolean boolean24 = outputSettings14.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings14.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(10);
        java.nio.charset.Charset charset31 = outputSettings30.getcharset();
        outputSettings14.setcharset(charset31);
        outputSettings11.charset = charset31;
        int int34 = outputSettings11.indentAmount();
        java.nio.charset.Charset charset35 = outputSettings11.charset;
        int int36 = outputSettings11.getindentAmount();
        outputSettings11.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount(1);
        boolean boolean42 = outputSettings39.prettyPrint;
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNull(charset4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        textNode2.text = "text";
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str15 = textNode2.text();
        java.lang.String str17 = textNode2.absUrl("text");
        java.lang.String str18 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.String str12 = textNode7.getTEXT_KEY();
        java.lang.String str13 = textNode7.nodeName();
        java.lang.String str14 = textNode7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "text" + "'", str12, "text");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.encoder();
        java.nio.charset.Charset charset7 = outputSettings0.getcharset();
        boolean boolean8 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.clone();
        outputSettings9.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings9.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings9.encoder();
        java.nio.charset.Charset charset16 = outputSettings9.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        java.nio.charset.Charset charset26 = outputSettings25.getcharset();
        outputSettings19.setcharset(charset26);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        outputSettings19.setcharsetEncoder(charsetEncoder28);
        boolean boolean30 = outputSettings19.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings19.escapeMode;
        outputSettings9.escapeMode = escapeMode31;
        outputSettings0.escapeMode = escapeMode31;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        int int36 = outputSettings34.indentAmount;
        int int37 = outputSettings34.indentAmount;
        java.nio.charset.Charset charset38 = null;
        outputSettings34.charset = charset38;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings34.escapeMode(escapeMode40);
        java.nio.charset.Charset charset42 = null;
        outputSettings41.charset = charset42;
        java.nio.charset.Charset charset44 = outputSettings41.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings41.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        int int48 = outputSettings47.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings46.escapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings0.escapeMode(escapeMode51);
        org.jsoup.nodes.TextNode textNode56 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str57 = textNode56.baseUri();
        java.lang.String str58 = textNode56.text;
        org.jsoup.nodes.TextNode textNode61 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node62 = textNode61.parent();
        boolean boolean63 = textNode56.equals((java.lang.Object) textNode61);
        textNode56.text = "text";
        org.jsoup.nodes.TextNode textNode67 = textNode56.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList68 = textNode56.childNodesCopy();
        textNode56.settext("hi!");
        textNode56.ensureAttributes();
        org.jsoup.nodes.Node node72 = textNode56.nextSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings73.clone();
        int int75 = outputSettings74.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = null;
        outputSettings74.escapeMode = escapeMode76;
        outputSettings74.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder80 = outputSettings74.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings74.prettyPrint(false);
        outputSettings82.setprettyPrint(false);
        boolean boolean85 = textNode56.equals((java.lang.Object) outputSettings82);
        org.jsoup.nodes.Entities.EscapeMode escapeMode86 = outputSettings82.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder87 = outputSettings82.getcharsetEncoder();
        outputSettings53.setcharsetEncoder(charsetEncoder87);
        int int89 = outputSettings53.indentAmount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(textNode67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder80);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(escapeMode86);
        org.junit.Assert.assertNotNull(charsetEncoder87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        int int17 = outputSettings15.indentAmount();
        outputSettings15.indentAmount = 52;
        java.nio.charset.Charset charset20 = outputSettings15.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings15.prettyPrint(true);
        int int23 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        java.nio.charset.Charset charset29 = null;
        outputSettings28.charset = charset29;
        outputSettings28.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings28.prettyPrint(true);
        java.nio.charset.Charset charset35 = null;
        outputSettings28.setcharset(charset35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings28.escapeMode;
        boolean boolean38 = outputSettings28.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings28.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings41.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(10);
        java.nio.charset.Charset charset45 = outputSettings44.getcharset();
        outputSettings28.setcharset(charset45);
        java.nio.charset.Charset charset47 = outputSettings28.charset();
        outputSettings15.charset = charset47;
        outputSettings0.setcharset(charset47);
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings0.getescapeMode();
        outputSettings0.setindentAmount((int) (byte) 100);
        int int53 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings54.clone();
        int int56 = outputSettings55.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = null;
        outputSettings55.escapeMode = escapeMode57;
        outputSettings55.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings55.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        int int64 = outputSettings63.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.clone();
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings65.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings65.prettyPrint(true);
        java.nio.charset.Charset charset69 = outputSettings65.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings62.charset(charset69);
        java.nio.charset.Charset charset71 = outputSettings62.charset;
        outputSettings0.charset = charset71;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(charset71);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.attr("ext", "h");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        textNode2.text = "i!";
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        int int12 = outputSettings11.indentAmount();
        int int13 = outputSettings11.indentAmount;
        int int14 = outputSettings11.indentAmount;
        java.nio.charset.Charset charset15 = null;
        outputSettings11.charset = charset15;
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode17);
        int int19 = outputSettings18.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        int int21 = outputSettings20.indentAmount();
        int int22 = outputSettings20.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings18.escapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        int int27 = outputSettings26.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.clone();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings28.getcharsetEncoder();
        outputSettings25.setcharsetEncoder(charsetEncoder29);
        java.nio.charset.Charset charset31 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings24.charset(charset31);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings24.escapeMode;
        boolean boolean34 = textNode2.equals((java.lang.Object) escapeMode33);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        textNode2.text = "text";
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.nodeName();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.splitText(1);
        org.jsoup.nodes.Node node18 = textNode17.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.baseUri();
        textNode2.ensureAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.baseUri();
        java.lang.String str14 = textNode10.attr("text");
        java.lang.String str15 = textNode10.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node17 = textNode10.nextSibling();
        org.jsoup.nodes.Node node20 = textNode10.attr("hi!", "");
        textNode10.setBaseUri("h");
        textNode10.text = "i!";
        int int25 = textNode10.childNodeSize();
        boolean boolean26 = textNode10.isBlank();
        org.jsoup.nodes.Node node27 = textNode10.clone();
        boolean boolean28 = textNode10.isBlank();
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.TextNode textNode33 = textNode31.text("h");
        java.lang.String str35 = textNode31.attr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode31.childNodes();
        boolean boolean37 = textNode10.equals((java.lang.Object) nodeList36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings3.clone();
        int int5 = outputSettings4.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        java.nio.charset.Charset charset10 = null;
        outputSettings9.charset = charset10;
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        outputSettings9.setcharsetEncoder(charsetEncoder12);
        boolean boolean14 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        int int16 = outputSettings15.indentAmount();
        int int17 = outputSettings15.indentAmount;
        int int18 = outputSettings15.indentAmount;
        java.nio.charset.Charset charset19 = null;
        outputSettings15.charset = charset19;
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings15.escapeMode(escapeMode21);
        int int23 = outputSettings22.getindentAmount();
        boolean boolean24 = outputSettings22.getprettyPrint();
        boolean boolean25 = outputSettings22.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings22.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(10);
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings30.charsetEncoder;
        outputSettings22.charsetEncoder = charsetEncoder31;
        outputSettings9.setcharsetEncoder(charsetEncoder31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        int int36 = outputSettings34.indentAmount;
        int int37 = outputSettings34.indentAmount;
        java.nio.charset.Charset charset38 = null;
        outputSettings34.charset = charset38;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings34.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        int int43 = outputSettings42.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.clone();
        outputSettings42.setindentAmount(1);
        boolean boolean47 = outputSettings42.getprettyPrint();
        outputSettings42.setindentAmount((int) '4');
        java.nio.charset.Charset charset50 = outputSettings42.getcharset();
        outputSettings41.charset = charset50;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings9.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings0.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings54.clone();
        int int56 = outputSettings55.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings55.escapeMode();
        boolean boolean58 = outputSettings55.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings59.clone();
        int int61 = outputSettings60.indentAmount();
        java.nio.charset.Charset charset62 = outputSettings60.charset();
        outputSettings55.charset = charset62;
        boolean boolean64 = outputSettings55.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings65.clone();
        java.nio.charset.Charset charset67 = null;
        outputSettings66.charset = charset67;
        outputSettings66.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings66.prettyPrint(true);
        java.nio.charset.Charset charset73 = null;
        outputSettings66.setcharset(charset73);
        int int75 = outputSettings66.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings66.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder77 = outputSettings66.encoder();
        outputSettings55.charsetEncoder = charsetEncoder77;
        java.nio.charset.CharsetEncoder charsetEncoder79 = outputSettings55.getcharsetEncoder();
        outputSettings53.setcharsetEncoder(charsetEncoder79);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings53.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(escapeMode26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(charsetEncoder77);
        org.junit.Assert.assertNotNull(charsetEncoder79);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.clone();
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings3.getcharsetEncoder();
        outputSettings0.setcharsetEncoder(charsetEncoder4);
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        java.nio.charset.Charset charset8 = outputSettings0.getcharset();
        java.nio.charset.Charset charset9 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        int int6 = outputSettings4.indentAmount;
        int int7 = outputSettings4.indentAmount;
        java.nio.charset.Charset charset8 = null;
        outputSettings4.charset = charset8;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings4.escapeMode(escapeMode10);
        int int12 = outputSettings11.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        int int15 = outputSettings13.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.escapeMode(escapeMode16);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings11.encoder();
        java.nio.charset.Charset charset19 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        int int23 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.clone();
        outputSettings22.setindentAmount(1);
        boolean boolean27 = outputSettings22.getprettyPrint();
        outputSettings22.setindentAmount((int) '4');
        java.nio.charset.Charset charset30 = outputSettings22.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings11.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings1.charset(charset30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings1.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings1.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings1.prettyPrint(true);
        outputSettings38.setprettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings38);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        int int8 = outputSettings0.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings0.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings0.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings0.getescapeMode();
        int int12 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset13 = outputSettings0.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("");
        boolean boolean8 = textNode2.hasAttr("#text");
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings7.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        int int11 = outputSettings9.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.escapeMode(escapeMode12);
        boolean boolean14 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode();
        int int17 = outputSettings7.indentAmount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i", "#");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("i!");
        java.lang.String str9 = textNode2.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        boolean boolean16 = outputSettings13.getprettyPrint();
        java.nio.charset.Charset charset17 = outputSettings13.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        int int20 = outputSettings18.indentAmount;
        int int21 = outputSettings18.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        java.nio.charset.Charset charset26 = null;
        outputSettings25.charset = charset26;
        outputSettings25.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings25.prettyPrint(true);
        java.nio.charset.Charset charset32 = null;
        outputSettings25.setcharset(charset32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings25.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings18.escapeMode(escapeMode34);
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings35.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings35.getcharsetEncoder();
        outputSettings13.setcharsetEncoder(charsetEncoder37);
        int int39 = outputSettings13.getindentAmount();
        textNode2.outerHtmlTail(stringBuilder10, (int) (byte) 10, outputSettings13);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings41.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = null;
        outputSettings41.escapeMode = escapeMode43;
        boolean boolean45 = outputSettings41.prettyPrint;
        outputSettings41.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings48.clone();
        java.nio.charset.Charset charset50 = null;
        outputSettings49.charset = charset50;
        java.nio.charset.Charset charset52 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        int int54 = outputSettings53.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.clone();
        java.nio.charset.CharsetEncoder charsetEncoder56 = outputSettings55.getcharsetEncoder();
        outputSettings49.charsetEncoder = charsetEncoder56;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings49.indentAmount((int) ' ');
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings61.clone();
        java.nio.charset.Charset charset63 = null;
        outputSettings62.charset = charset63;
        outputSettings62.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings62.prettyPrint(true);
        java.nio.charset.Charset charset69 = null;
        outputSettings62.setcharset(charset69);
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings62.escapeMode;
        boolean boolean72 = outputSettings62.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings62.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings75.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings76.indentAmount(10);
        java.nio.charset.Charset charset79 = outputSettings78.getcharset();
        outputSettings62.setcharset(charset79);
        outputSettings59.charset = charset79;
        org.jsoup.nodes.Entities.EscapeMode escapeMode82 = outputSettings59.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings41.escapeMode(escapeMode82);
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings41.prettyPrint(false);
        int int86 = outputSettings85.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode87 = outputSettings85.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings13.escapeMode(escapeMode87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNull(charset52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charsetEncoder56);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertTrue("'" + escapeMode82 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode82.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode87 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode87.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings88);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        textNode2.settext("i");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean12 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode2.attr("text", "hi!");
        java.lang.String str17 = textNode2.nodeName();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        int int20 = outputSettings19.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.clone();
        outputSettings19.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings19.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings19.encoder();
        outputSettings19.indentAmount = (short) 100;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings19.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        int int36 = outputSettings34.indentAmount;
        int int37 = outputSettings34.indentAmount;
        java.nio.charset.Charset charset38 = null;
        outputSettings34.charset = charset38;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings34.escapeMode(escapeMode40);
        int int42 = outputSettings41.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        int int44 = outputSettings43.indentAmount();
        int int45 = outputSettings43.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings43.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings41.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.clone();
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings51.getcharsetEncoder();
        outputSettings48.setcharsetEncoder(charsetEncoder52);
        java.nio.charset.Charset charset54 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings47.charset(charset54);
        java.nio.charset.Charset charset56 = outputSettings55.charset;
        outputSettings19.charset = charset56;
        java.nio.charset.Charset charset58 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        int int60 = outputSettings59.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.clone();
        outputSettings59.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings59.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        int int68 = outputSettings67.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings67.clone();
        java.nio.charset.CharsetEncoder charsetEncoder70 = outputSettings69.getcharsetEncoder();
        outputSettings66.setcharsetEncoder(charsetEncoder70);
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings66.escapeMode();
        outputSettings59.escapeMode = escapeMode72;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings74.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount(10);
        java.nio.charset.Charset charset78 = outputSettings77.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings59.charset(charset78);
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings19.charset(charset78);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = node18.equals((java.lang.Object) outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(charsetEncoder70);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(outputSettings80);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        boolean boolean8 = outputSettings0.prettyPrint;
        int int9 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        int int14 = outputSettings12.indentAmount;
        int int15 = outputSettings12.indentAmount;
        java.nio.charset.Charset charset16 = null;
        outputSettings12.charset = charset16;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings12.escapeMode(escapeMode18);
        int int20 = outputSettings19.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        int int23 = outputSettings21.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings21.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings19.escapeMode(escapeMode24);
        boolean boolean26 = outputSettings19.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings19.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings19.escapeMode();
        outputSettings0.setescapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        int int31 = outputSettings30.indentAmount();
        int int32 = outputSettings30.indentAmount;
        int int33 = outputSettings30.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings30.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings36.clone();
        java.nio.charset.Charset charset38 = null;
        outputSettings37.charset = charset38;
        outputSettings37.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings37.prettyPrint(true);
        java.nio.charset.Charset charset44 = null;
        outputSettings37.setcharset(charset44);
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings37.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings30.escapeMode(escapeMode46);
        boolean boolean48 = outputSettings30.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings30.clone();
        java.nio.charset.Charset charset50 = outputSettings30.charset;
        outputSettings30.setprettyPrint(false);
        java.nio.charset.Charset charset53 = outputSettings30.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings0.charset(charset53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(escapeMode10);
        org.junit.Assert.assertNull(escapeMode11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("t", "i");
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "h");
        textNode2.settext("");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        java.nio.charset.Charset charset7 = null;
        outputSettings6.charset = charset7;
        outputSettings6.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.prettyPrint(true);
        java.nio.charset.Charset charset13 = null;
        outputSettings6.setcharset(charset13);
        int int15 = outputSettings6.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings6.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings6.encoder();
        boolean boolean18 = textNode2.equals((java.lang.Object) outputSettings6);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        java.nio.charset.Charset charset21 = null;
        outputSettings20.charset = charset21;
        java.nio.charset.Charset charset23 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.clone();
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings26.getcharsetEncoder();
        outputSettings20.charsetEncoder = charsetEncoder27;
        boolean boolean29 = outputSettings20.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        java.nio.charset.Charset charset32 = outputSettings31.charset();
        java.nio.charset.Charset charset33 = outputSettings31.charset();
        outputSettings20.setcharset(charset33);
        boolean boolean35 = outputSettings20.prettyPrint();
        boolean boolean36 = textNode2.equals((java.lang.Object) boolean35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNull(charset23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "h");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        int int4 = outputSettings3.indentAmount();
        int int5 = outputSettings3.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings3.indentAmount((int) ' ');
        int int8 = outputSettings3.getindentAmount();
        boolean boolean9 = textNode2.equals((java.lang.Object) outputSettings3);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = null;
        outputSettings11.escapeMode = escapeMode13;
        outputSettings11.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings11.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        java.nio.charset.Charset charset22 = null;
        outputSettings21.charset = charset22;
        java.nio.charset.CharsetEncoder charsetEncoder24 = null;
        outputSettings21.setcharsetEncoder(charsetEncoder24);
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings21.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings21.escapeMode(escapeMode27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings21.escapeMode();
        boolean boolean30 = outputSettings21.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings21.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings32.clone();
        int int34 = outputSettings33.indentAmount();
        java.nio.charset.Charset charset35 = outputSettings33.charset();
        outputSettings21.setcharset(charset35);
        outputSettings19.charset = charset35;
        outputSettings3.charset = charset35;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings3.clone();
        java.nio.charset.Charset charset40 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        int int42 = outputSettings41.indentAmount();
        int int43 = outputSettings41.indentAmount;
        int int44 = outputSettings41.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings41.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings47.clone();
        java.nio.charset.Charset charset49 = null;
        outputSettings48.charset = charset49;
        outputSettings48.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.prettyPrint(true);
        java.nio.charset.Charset charset55 = null;
        outputSettings48.setcharset(charset55);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings48.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings41.escapeMode(escapeMode57);
        boolean boolean59 = outputSettings41.prettyPrint();
        boolean boolean60 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        int int62 = outputSettings61.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.clone();
        outputSettings61.setindentAmount(1);
        boolean boolean66 = outputSettings61.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings61.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        int int69 = outputSettings68.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings68.clone();
        outputSettings68.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings68.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder74 = outputSettings68.encoder();
        java.nio.charset.Charset charset75 = outputSettings68.getcharset();
        outputSettings61.charset = charset75;
        outputSettings41.setcharset(charset75);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        int int79 = outputSettings78.indentAmount();
        int int80 = outputSettings78.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings78.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder83 = outputSettings82.getcharsetEncoder();
        outputSettings41.charsetEncoder = charsetEncoder83;
        outputSettings3.charsetEncoder = charsetEncoder83;
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNull(escapeMode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(charsetEncoder31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder74);
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(charsetEncoder83);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.lang.String str16 = textNode2.attr("h");
        org.jsoup.nodes.Node node17 = textNode2.parent();
        textNode2.ensureAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str20 = textNode19.baseUri();
        java.lang.String str21 = textNode19.baseUri();
        java.lang.String str22 = textNode19.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        int int24 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.clone();
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings23.encoder();
        boolean boolean27 = textNode19.equals((java.lang.Object) outputSettings23);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings23.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings32.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings32.escapeMode = escapeMode34;
        boolean boolean36 = outputSettings32.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        int int39 = outputSettings38.indentAmount();
        int int40 = outputSettings38.indentAmount;
        int int41 = outputSettings38.indentAmount;
        java.nio.charset.Charset charset42 = null;
        outputSettings38.charset = charset42;
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings38.escapeMode(escapeMode44);
        int int46 = outputSettings45.getindentAmount();
        java.nio.charset.Charset charset47 = outputSettings45.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings45.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings50.clone();
        int int52 = outputSettings51.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = null;
        outputSettings51.escapeMode = escapeMode53;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings55.clone();
        int int57 = outputSettings56.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings56.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings51.escapeMode(escapeMode58);
        outputSettings45.escapeMode = escapeMode58;
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings45.escapeMode();
        outputSettings32.setescapeMode(escapeMode61);
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings32.encoder();
        outputSettings23.charsetEncoder = charsetEncoder63;
        boolean boolean65 = textNode2.equals((java.lang.Object) outputSettings23);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings23.indentAmount((int) (byte) 10);
        java.nio.charset.Charset charset68 = null;
        outputSettings67.charset = charset68;
        boolean boolean70 = outputSettings67.prettyPrint;
        boolean boolean71 = outputSettings67.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings67.getescapeMode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(escapeMode37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node12 = textNode11.nextSibling();
        org.jsoup.nodes.Document document13 = textNode11.ownerDocument();
        boolean boolean14 = textNode2.equals((java.lang.Object) document13);
        java.lang.String str15 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.attr("");
        textNode2.settext("h");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("t");
        java.lang.String str14 = textNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.isBlank();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.baseUri();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.gettext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.Charset charset6 = outputSettings0.getcharset();
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        int int11 = outputSettings9.indentAmount;
        int int12 = outputSettings9.indentAmount;
        java.nio.charset.Charset charset13 = null;
        outputSettings9.charset = charset13;
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.escapeMode(escapeMode15);
        int int17 = outputSettings16.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        int int20 = outputSettings18.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings18.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.escapeMode(escapeMode21);
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings16.encoder();
        java.nio.charset.Charset charset24 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings16.prettyPrint(true);
        int int27 = outputSettings16.indentAmount();
        boolean boolean28 = outputSettings16.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        int int32 = outputSettings31.indentAmount();
        int int33 = outputSettings31.indentAmount;
        int int34 = outputSettings31.indentAmount;
        java.nio.charset.Charset charset35 = null;
        outputSettings31.charset = charset35;
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings31.escapeMode(escapeMode37);
        int int39 = outputSettings38.getindentAmount();
        boolean boolean40 = outputSettings38.getprettyPrint();
        java.nio.charset.Charset charset41 = outputSettings38.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings38.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder43 = outputSettings38.charsetEncoder;
        outputSettings30.setcharsetEncoder(charsetEncoder43);
        java.nio.charset.Charset charset45 = outputSettings30.getcharset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(charset41);
        org.junit.Assert.assertNull(escapeMode42);
        org.junit.Assert.assertNotNull(charsetEncoder43);
        org.junit.Assert.assertNotNull(charset45);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str14 = textNode13.baseUri();
        java.lang.String str15 = textNode13.getWholeText();
        org.jsoup.nodes.Document document16 = textNode13.ownerDocument();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        int int20 = outputSettings19.indentAmount();
        int int21 = outputSettings19.indentAmount;
        int int22 = outputSettings19.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        int int27 = outputSettings25.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.indentAmount((int) ' ');
        int int30 = outputSettings25.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings25.escapeMode;
        outputSettings24.escapeMode = escapeMode31;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        int int34 = outputSettings33.indentAmount();
        int int35 = outputSettings33.indentAmount;
        int int36 = outputSettings33.indentAmount;
        java.nio.charset.Charset charset37 = null;
        outputSettings33.charset = charset37;
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings33.escapeMode(escapeMode39);
        int int41 = outputSettings40.getindentAmount();
        java.nio.charset.Charset charset42 = outputSettings40.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings45.clone();
        int int47 = outputSettings46.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = null;
        outputSettings46.escapeMode = escapeMode48;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings50.clone();
        int int52 = outputSettings51.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings46.escapeMode(escapeMode53);
        outputSettings40.escapeMode = escapeMode53;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        int int57 = outputSettings56.indentAmount();
        int int58 = outputSettings56.indentAmount;
        int int59 = outputSettings56.indentAmount;
        java.nio.charset.Charset charset60 = null;
        outputSettings56.charset = charset60;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings56.escapeMode(escapeMode62);
        int int64 = outputSettings63.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        int int66 = outputSettings65.indentAmount();
        int int67 = outputSettings65.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings65.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings63.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        int int72 = outputSettings71.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.clone();
        java.nio.charset.CharsetEncoder charsetEncoder74 = outputSettings73.getcharsetEncoder();
        outputSettings70.setcharsetEncoder(charsetEncoder74);
        java.nio.charset.Charset charset76 = outputSettings70.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings69.charset(charset76);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings40.charset(charset76);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings24.charset(charset76);
        textNode13.outerHtmlTail(stringBuilder17, 10, outputSettings79);
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings79.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings79.clone();
        boolean boolean83 = textNode2.equals((java.lang.Object) outputSettings79);
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings79.prettyPrint(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(charsetEncoder74);
        org.junit.Assert.assertNotNull(charset76);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(outputSettings85);
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        int int12 = outputSettings11.indentAmount();
        int int13 = outputSettings11.indentAmount;
        int int14 = outputSettings11.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings11.escapeMode;
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings11);
        boolean boolean17 = outputSettings11.prettyPrint();
        java.nio.charset.Charset charset18 = outputSettings11.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings11.charsetEncoder;
        boolean boolean20 = outputSettings11.getprettyPrint();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        boolean boolean14 = textNode11.hasAttr("h");
        org.jsoup.nodes.Node node15 = textNode11.clone();
        textNode11.ensureAttributes();
        java.lang.String str18 = textNode11.absUrl("#text");
        org.jsoup.nodes.Node node19 = textNode11.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (byte) 0);
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        int int16 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        outputSettings15.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings15.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings15.encoder();
        boolean boolean22 = outputSettings15.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings15.indentAmount((int) (short) 100);
        textNode2.outerHtmlTail(stringBuilder13, (int) (byte) 0, outputSettings26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        textNode2.settext("hi!");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.gettext();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.baseUri();
        java.lang.String str14 = textNode10.attr("text");
        java.lang.String str15 = textNode10.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode10);
        int int17 = textNode2.childNodeSize();
        java.lang.String str18 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("i!");
        java.lang.String str21 = textNode2.gettext();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode23 = textNode2.splitText(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i!" + "'", str21, "i!");
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings7.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        int int11 = outputSettings9.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.escapeMode(escapeMode12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings7.encoder();
        java.nio.charset.Charset charset15 = outputSettings7.charset();
        java.nio.charset.Charset charset16 = outputSettings7.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        outputSettings18.prettyPrint = true;
        outputSettings18.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.clone();
        outputSettings25.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings25.getescapeMode();
        outputSettings18.setescapeMode(escapeMode30);
        outputSettings7.escapeMode = escapeMode30;
        boolean boolean33 = outputSettings7.getprettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        textNode2.outerHtmlTail(stringBuilder4, (-1), outputSettings6);
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.text;
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder2 = null;
        outputSettings1.setcharsetEncoder(charsetEncoder2);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        outputSettings7.setcharsetEncoder(charsetEncoder8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.clone();
        outputSettings12.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings12.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings12.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings12.encoder();
        outputSettings11.setcharsetEncoder(charsetEncoder20);
        outputSettings5.charsetEncoder = charsetEncoder20;
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings5.getcharsetEncoder();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(charsetEncoder23);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        textNode2.text = "text";
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str15 = textNode2.text();
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str12 = textNode2.attr("text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        java.lang.String str7 = textNode6.text();
        textNode6.text = "i!";
        textNode6.setBaseUri("h");
        org.jsoup.nodes.Node node12 = textNode6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode6.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text();
        java.lang.String str15 = textNode2.nodeName();
        java.lang.String str16 = textNode2.outerHtml();
        boolean boolean17 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        int int20 = outputSettings19.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode();
        boolean boolean22 = outputSettings19.getprettyPrint();
        java.nio.charset.Charset charset23 = outputSettings19.getcharset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.prettyPrint(false);
        java.nio.charset.Charset charset27 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.prettyPrint(true);
        boolean boolean30 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.Node node31 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "text" + "'", str16, "text");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.baseUri();
        java.lang.String str14 = textNode10.attr("text");
        java.lang.String str15 = textNode10.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node17 = textNode10.nextSibling();
        org.jsoup.nodes.Node node20 = textNode10.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode22 = textNode10.text("#text");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        int int27 = outputSettings25.indentAmount;
        int int28 = outputSettings25.indentAmount;
        java.nio.charset.Charset charset29 = null;
        outputSettings25.charset = charset29;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings25.escapeMode(escapeMode31);
        int int33 = outputSettings32.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        int int35 = outputSettings34.indentAmount();
        int int36 = outputSettings34.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings34.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings32.escapeMode(escapeMode37);
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings32.encoder();
        java.nio.charset.Charset charset40 = outputSettings32.charset();
        int int41 = outputSettings32.indentAmount;
        textNode10.outerHtmlTail(stringBuilder23, 0, outputSettings32);
        org.jsoup.nodes.TextNode textNode44 = textNode10.text("i!");
        java.lang.String str45 = textNode44.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode44.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertNull(charset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(textNode44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "text" + "'", str45, "text");
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings2.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings2.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings2.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings2.escapeMode();
        boolean boolean8 = outputSettings2.getprettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        outputSettings0.escapeMode = escapeMode2;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        int int6 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.clone();
        outputSettings5.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.clone();
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings15.getcharsetEncoder();
        outputSettings12.setcharsetEncoder(charsetEncoder16);
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings12.escapeMode();
        outputSettings5.escapeMode = escapeMode18;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        int int22 = outputSettings21.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings29.getcharset();
        outputSettings23.setcharset(charset30);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        outputSettings23.setcharsetEncoder(charsetEncoder32);
        boolean boolean34 = outputSettings23.prettyPrint;
        outputSettings23.setindentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings23.indentAmount((int) (short) 10);
        java.nio.charset.Charset charset39 = outputSettings38.charset;
        outputSettings5.setcharset(charset39);
        outputSettings0.charset = charset39;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings0.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings43);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.nodeName();
        textNode2.text = "hi!";
        boolean boolean12 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str15 = textNode2.attr("hi!");
        java.lang.String str16 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.prettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        outputSettings7.setcharset(charset14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        boolean boolean18 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.clone();
        java.nio.charset.Charset charset20 = outputSettings0.charset;
        outputSettings0.setprettyPrint(false);
        boolean boolean23 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings0.getescapeMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        int int3 = textNode2.childNodeSize();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        outputSettings7.setcharsetEncoder(charsetEncoder8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        java.nio.charset.Charset charset14 = null;
        outputSettings13.charset = charset14;
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings19.getcharsetEncoder();
        outputSettings13.charsetEncoder = charsetEncoder20;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings13.indentAmount((int) ' ');
        outputSettings13.indentAmount = (short) 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        int int28 = outputSettings27.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        outputSettings27.escapeMode = escapeMode29;
        outputSettings27.prettyPrint = true;
        boolean boolean33 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings27.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        int int37 = outputSettings36.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.clone();
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings36.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        int int41 = outputSettings40.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode;
        outputSettings36.setescapeMode(escapeMode43);
        outputSettings35.escapeMode = escapeMode43;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings13.escapeMode(escapeMode43);
        outputSettings7.setescapeMode(escapeMode43);
        boolean boolean48 = textNode2.equals((java.lang.Object) outputSettings7);
        int int49 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode52 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        int int53 = textNode52.siblingIndex();
        org.jsoup.nodes.Attributes attributes54 = textNode52.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = textNode2.after((org.jsoup.nodes.Node) textNode52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(charset16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(textNode52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        outputSettings0.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.charsetEncoder;
        boolean boolean6 = outputSettings0.prettyPrint;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings7.getindentAmount();
        java.nio.charset.Charset charset9 = outputSettings7.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = null;
        outputSettings12.escapeMode = escapeMode14;
        boolean boolean16 = outputSettings12.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        int int19 = outputSettings17.indentAmount;
        int int20 = outputSettings17.indentAmount;
        java.nio.charset.Charset charset21 = null;
        outputSettings17.charset = charset21;
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.escapeMode(escapeMode23);
        int int25 = outputSettings24.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        int int27 = outputSettings26.indentAmount();
        int int28 = outputSettings26.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings26.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.escapeMode(escapeMode29);
        outputSettings12.setescapeMode(escapeMode29);
        outputSettings12.setprettyPrint(false);
        java.nio.charset.Charset charset34 = outputSettings12.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings11.charset(charset34);
        outputSettings11.setprettyPrint(false);
        int int38 = outputSettings11.indentAmount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.prettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        outputSettings7.setcharset(charset14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        boolean boolean18 = outputSettings0.prettyPrint();
        boolean boolean19 = outputSettings0.prettyPrint();
        boolean boolean20 = outputSettings0.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings0.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings25.clone();
        java.nio.charset.Charset charset27 = null;
        outputSettings26.charset = charset27;
        outputSettings26.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings26.prettyPrint(true);
        java.nio.charset.Charset charset33 = null;
        outputSettings26.setcharset(charset33);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings26.getescapeMode();
        outputSettings26.prettyPrint = true;
        outputSettings26.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings26.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder42 = outputSettings41.getcharsetEncoder();
        outputSettings41.setprettyPrint(false);
        boolean boolean45 = outputSettings41.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings41.encoder();
        outputSettings24.charsetEncoder = charsetEncoder46;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings48.clone();
        java.nio.charset.Charset charset50 = null;
        outputSettings49.charset = charset50;
        outputSettings49.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings49.prettyPrint(true);
        java.nio.charset.Charset charset56 = null;
        outputSettings49.setcharset(charset56);
        int int58 = outputSettings49.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder59 = outputSettings49.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings49.escapeMode();
        boolean boolean61 = outputSettings49.getprettyPrint();
        boolean boolean62 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings49.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings24.escapeMode(escapeMode63);
        boolean boolean65 = outputSettings64.getprettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charsetEncoder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "#text");
        java.lang.String str11 = textNode2.text;
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("i!");
        java.lang.String str17 = textNode2.getWholeText();
        java.lang.String str18 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str22 = textNode21.baseUri();
        java.lang.String str23 = textNode21.outerHtml();
        org.jsoup.nodes.Node node24 = textNode21.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode21.childNodesCopy();
        boolean boolean27 = textNode21.hasAttr("#text");
        java.lang.String str28 = textNode21.getTEXT_KEY();
        boolean boolean29 = textNode2.equals((java.lang.Object) textNode21);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "text" + "'", str28, "text");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder2 = null;
        outputSettings1.setcharsetEncoder(charsetEncoder2);
        outputSettings1.indentAmount = (short) 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings1.indentAmount((int) (byte) 0);
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings7.encoder();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNull(charsetEncoder8);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        textNode2.text = "text";
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("ext");
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        java.lang.String str19 = textNode2.attr("hi!");
        int int20 = textNode2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.prettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        outputSettings7.setcharset(charset14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings17.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings17.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        int int21 = outputSettings20.indentAmount();
        int int22 = outputSettings20.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.indentAmount((int) ' ');
        outputSettings24.setprettyPrint(true);
        outputSettings24.indentAmount = (byte) 1;
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings17.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings31.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = null;
        outputSettings31.escapeMode = escapeMode33;
        boolean boolean35 = outputSettings31.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        int int38 = outputSettings37.indentAmount();
        int int39 = outputSettings37.indentAmount;
        int int40 = outputSettings37.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings37.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings43.clone();
        java.nio.charset.Charset charset45 = null;
        outputSettings44.charset = charset45;
        outputSettings44.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings44.prettyPrint(true);
        java.nio.charset.Charset charset51 = null;
        outputSettings44.setcharset(charset51);
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings44.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings37.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings31.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings17.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.indentAmount(97);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings56.indentAmount((int) (short) 10);
        int int61 = outputSettings56.indentAmount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(escapeMode36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str6 = textNode5.getWholeText();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str9 = textNode5.attr("text");
        java.lang.String str10 = textNode5.nodeName();
        java.lang.String str11 = textNode5.baseUri();
        java.lang.String str12 = textNode5.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode5.splitText(1);
        java.lang.String str15 = textNode14.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("hi!");
        java.lang.String str20 = textNode2.absUrl("#text");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes26 = textNode25.attributes();
        org.jsoup.nodes.TextNode textNode28 = textNode25.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode25.siblingNodes();
        textNode25.settext("h");
        org.jsoup.nodes.Attributes attributes32 = textNode25.attributes();
        boolean boolean33 = textNode2.equals((java.lang.Object) textNode25);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.nodeName();
        boolean boolean9 = textNode2.hasAttr("#text");
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.attr("h");
        java.lang.String str14 = textNode2.text();
        java.lang.String str15 = textNode2.gettext();
        java.lang.String str16 = textNode2.outerHtml();
        textNode2.text = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        int int5 = outputSettings4.indentAmount();
        int int6 = outputSettings4.indentAmount;
        int int7 = outputSettings4.indentAmount;
        java.nio.charset.Charset charset8 = null;
        outputSettings4.charset = charset8;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings4.escapeMode(escapeMode10);
        int int12 = outputSettings11.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        int int15 = outputSettings13.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.escapeMode(escapeMode16);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings11.encoder();
        java.nio.charset.Charset charset19 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        int int23 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.clone();
        outputSettings22.setindentAmount(1);
        boolean boolean27 = outputSettings22.getprettyPrint();
        outputSettings22.setindentAmount((int) '4');
        java.nio.charset.Charset charset30 = outputSettings22.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings11.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings1.charset(charset30);
        outputSettings1.indentAmount = '#';
        java.nio.charset.Charset charset35 = outputSettings1.getcharset();
        int int36 = outputSettings1.getindentAmount();
        boolean boolean37 = outputSettings1.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        int int39 = outputSettings38.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.clone();
        outputSettings38.setindentAmount(1);
        boolean boolean43 = outputSettings38.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder44 = outputSettings38.encoder();
        int int45 = outputSettings38.indentAmount;
        java.nio.charset.Charset charset46 = outputSettings38.getcharset();
        outputSettings38.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        int int50 = outputSettings49.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.clone();
        outputSettings49.setindentAmount(1);
        boolean boolean54 = outputSettings49.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings49.escapeMode();
        int int56 = outputSettings49.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings57.clone();
        java.nio.charset.Charset charset59 = null;
        outputSettings58.charset = charset59;
        outputSettings58.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings58.prettyPrint(true);
        java.nio.charset.Charset charset65 = null;
        outputSettings58.setcharset(charset65);
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings58.escapeMode;
        boolean boolean68 = outputSettings58.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings58.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings71.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings72.indentAmount(10);
        java.nio.charset.Charset charset75 = outputSettings74.getcharset();
        outputSettings58.setcharset(charset75);
        outputSettings49.setcharset(charset75);
        int int78 = outputSettings49.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings49.getescapeMode();
        outputSettings38.escapeMode = escapeMode79;
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings1.escapeMode(escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = new org.jsoup.nodes.Document.OutputSettings();
        int int84 = outputSettings83.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings83.clone();
        java.nio.charset.CharsetEncoder charsetEncoder86 = outputSettings85.getcharsetEncoder();
        outputSettings82.setcharsetEncoder(charsetEncoder86);
        java.nio.charset.Charset charset88 = outputSettings82.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode89 = outputSettings82.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings82.prettyPrint(false);
        java.nio.charset.Charset charset92 = outputSettings82.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder93 = outputSettings82.getcharsetEncoder();
        outputSettings1.charsetEncoder = charsetEncoder93;
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charsetEncoder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(charsetEncoder86);
        org.junit.Assert.assertNotNull(charset88);
        org.junit.Assert.assertTrue("'" + escapeMode89 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode89.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(charset92);
        org.junit.Assert.assertNotNull(charsetEncoder93);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.settext("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        textNode2.text = "text";
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = null;
        outputSettings12.escapeMode = escapeMode14;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings12.escapeMode;
        outputSettings12.setprettyPrint(false);
        textNode2.outerHtmlTail(stringBuilder9, (int) ' ', outputSettings12);
        org.jsoup.nodes.Node node20 = textNode2.clone();
        textNode2.text = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(escapeMode16);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        outputSettings1.escapeMode = escapeMode3;
        outputSettings1.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings1.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        int int15 = outputSettings14.indentAmount();
        int int16 = outputSettings14.indentAmount;
        int int17 = outputSettings14.indentAmount;
        java.nio.charset.Charset charset18 = null;
        outputSettings14.charset = charset18;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings14.escapeMode(escapeMode20);
        int int22 = outputSettings21.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        int int24 = outputSettings23.indentAmount();
        int int25 = outputSettings23.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings23.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.escapeMode(escapeMode26);
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings21.encoder();
        java.nio.charset.Charset charset29 = outputSettings21.charset();
        outputSettings21.indentAmount = (short) 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        outputSettings13.escapeMode = escapeMode34;
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings13.charsetEncoder;
        int int37 = outputSettings13.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings13.getescapeMode();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setindentAmount(1);
        boolean boolean5 = outputSettings0.getprettyPrint();
        outputSettings0.setindentAmount((int) '4');
        java.nio.charset.Charset charset8 = outputSettings0.getcharset();
        int int9 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.getescapeMode();
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        outputSettings17.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings17.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings0.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        int int26 = outputSettings24.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings0.escapeMode(escapeMode27);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings32.clone();
        java.nio.charset.Charset charset34 = null;
        outputSettings33.charset = charset34;
        java.nio.charset.CharsetEncoder charsetEncoder36 = null;
        outputSettings33.setcharsetEncoder(charsetEncoder36);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings33.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings33.escapeMode(escapeMode39);
        int int41 = outputSettings33.indentAmount();
        java.nio.charset.Charset charset42 = outputSettings33.charset;
        java.nio.charset.Charset charset43 = outputSettings33.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings44.clone();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = null;
        outputSettings45.escapeMode = escapeMode47;
        outputSettings45.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings45.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        int int54 = outputSettings53.indentAmount();
        int int55 = outputSettings53.indentAmount;
        int int56 = outputSettings53.indentAmount;
        java.nio.charset.Charset charset57 = null;
        outputSettings53.charset = charset57;
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings53.escapeMode(escapeMode59);
        int int61 = outputSettings60.getindentAmount();
        boolean boolean62 = outputSettings60.getprettyPrint();
        boolean boolean63 = outputSettings60.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings60.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        int int66 = outputSettings65.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings67.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings67.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings70.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.indentAmount(10);
        java.nio.charset.Charset charset74 = outputSettings73.getcharset();
        outputSettings67.setcharset(charset74);
        outputSettings60.setcharset(charset74);
        outputSettings45.setcharset(charset74);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings78.clone();
        java.nio.charset.Charset charset80 = null;
        outputSettings79.charset = charset80;
        java.nio.charset.Charset charset82 = outputSettings79.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = new org.jsoup.nodes.Document.OutputSettings();
        int int84 = outputSettings83.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings83.clone();
        java.nio.charset.CharsetEncoder charsetEncoder86 = outputSettings85.getcharsetEncoder();
        outputSettings79.charsetEncoder = charsetEncoder86;
        boolean boolean88 = outputSettings79.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings89.clone();
        java.nio.charset.Charset charset91 = outputSettings90.charset();
        java.nio.charset.Charset charset92 = outputSettings90.charset();
        outputSettings79.setcharset(charset92);
        outputSettings45.setcharset(charset92);
        outputSettings33.charset = charset92;
        outputSettings31.charset = charset92;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNull(charsetEncoder38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(charset42);
        org.junit.Assert.assertNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(escapeMode64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNull(charset82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(charsetEncoder86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertNotNull(charset91);
        org.junit.Assert.assertNotNull(charset92);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        java.nio.charset.Charset charset2 = null;
        outputSettings1.charset = charset2;
        outputSettings1.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings1.prettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        outputSettings1.setcharset(charset8);
        int int10 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        outputSettings12.setcharsetEncoder(charsetEncoder13);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings17.clone();
        java.nio.charset.Charset charset19 = null;
        outputSettings18.charset = charset19;
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        int int23 = outputSettings22.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.clone();
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings24.getcharsetEncoder();
        outputSettings18.charsetEncoder = charsetEncoder25;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings18.indentAmount((int) ' ');
        outputSettings18.indentAmount = (short) 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings31.clone();
        int int33 = outputSettings32.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings32.escapeMode = escapeMode34;
        outputSettings32.prettyPrint = true;
        boolean boolean38 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings32.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        int int42 = outputSettings41.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.clone();
        java.nio.charset.CharsetEncoder charsetEncoder44 = outputSettings41.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings45.escapeMode;
        outputSettings41.setescapeMode(escapeMode48);
        outputSettings40.escapeMode = escapeMode48;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings18.escapeMode(escapeMode48);
        outputSettings12.setescapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings1.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.prettyPrint(false);
        boolean boolean56 = outputSettings53.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNull(charset21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charsetEncoder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings0.getindentAmount();
        int int9 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset10 = outputSettings0.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings0.getescapeMode();
        java.nio.charset.Charset charset12 = outputSettings0.charset;
        int int13 = outputSettings0.indentAmount;
        boolean boolean14 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        int int16 = outputSettings15.indentAmount();
        int int17 = outputSettings15.indentAmount;
        int int18 = outputSettings15.indentAmount;
        java.nio.charset.Charset charset19 = null;
        outputSettings15.charset = charset19;
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings15.escapeMode(escapeMode21);
        int int23 = outputSettings22.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        int int26 = outputSettings24.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings24.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings22.escapeMode(escapeMode27);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings22.encoder();
        java.nio.charset.Charset charset30 = outputSettings22.charset();
        outputSettings22.indentAmount = (short) 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        int int37 = outputSettings36.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.clone();
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings38.getcharsetEncoder();
        outputSettings35.setcharsetEncoder(charsetEncoder39);
        java.nio.charset.Charset charset41 = outputSettings35.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings34.escapeMode(escapeMode42);
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings47.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        java.nio.charset.Charset charset51 = null;
        outputSettings50.charset = charset51;
        outputSettings50.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings50.prettyPrint(true);
        java.nio.charset.Charset charset57 = null;
        outputSettings50.setcharset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings50.getescapeMode();
        outputSettings47.escapeMode = escapeMode59;
        java.nio.charset.CharsetEncoder charsetEncoder61 = outputSettings47.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        int int63 = outputSettings62.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings64.clone();
        int int66 = outputSettings64.indentAmount();
        outputSettings64.indentAmount = 52;
        java.nio.charset.Charset charset69 = outputSettings64.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings64.prettyPrint(true);
        int int72 = outputSettings64.indentAmount();
        org.jsoup.nodes.TextNode textNode75 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str76 = textNode75.getWholeText();
        textNode75.ensureAttributes();
        java.lang.StringBuilder stringBuilder78 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = new org.jsoup.nodes.Document.OutputSettings();
        int int81 = outputSettings80.indentAmount();
        int int82 = outputSettings80.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings80.indentAmount((int) ' ');
        textNode75.outerHtmlTail(stringBuilder78, 32, outputSettings80);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings86.clone();
        int int88 = outputSettings87.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode89 = outputSettings87.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings80.escapeMode(escapeMode89);
        java.nio.charset.Charset charset91 = outputSettings90.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings64.charset(charset91);
        outputSettings47.setcharset(charset91);
        outputSettings43.setcharset(charset91);
        outputSettings0.setcharset(charset91);
        boolean boolean96 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertNull(escapeMode11);
        org.junit.Assert.assertNull(charset12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode89 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode89.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertNotNull(charset91);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        textNode2.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("#text");
        boolean boolean17 = textNode2.isBlank();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        outputSettings0.escapeMode = escapeMode2;
        boolean boolean4 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        outputSettings6.setindentAmount(1);
        boolean boolean11 = outputSettings6.getprettyPrint();
        outputSettings6.setindentAmount((int) '4');
        java.nio.charset.Charset charset14 = outputSettings6.getcharset();
        int int15 = outputSettings6.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings6.encoder();
        outputSettings0.charsetEncoder = charsetEncoder16;
        int int18 = outputSettings0.indentAmount;
        outputSettings0.setprettyPrint(false);
        outputSettings0.prettyPrint = false;
        boolean boolean23 = outputSettings0.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.text;
        textNode5.text = "";
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        java.nio.charset.Charset charset18 = null;
        outputSettings17.charset = charset18;
        outputSettings17.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.prettyPrint(true);
        java.nio.charset.Charset charset24 = null;
        outputSettings17.setcharset(charset24);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings17.getescapeMode();
        outputSettings14.escapeMode = escapeMode26;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings14.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings14.indentAmount(10);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings14.escapeMode;
        textNode5.outerHtmlTail(stringBuilder10, (-1), outputSettings14);
        org.jsoup.nodes.Node node33 = textNode5.clone();
        int int34 = node33.siblingIndex();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        outputSettings0.escapeMode = escapeMode2;
        boolean boolean4 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        int int8 = outputSettings6.indentAmount;
        int int9 = outputSettings6.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        java.nio.charset.Charset charset14 = null;
        outputSettings13.charset = charset14;
        outputSettings13.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.prettyPrint(true);
        java.nio.charset.Charset charset20 = null;
        outputSettings13.setcharset(charset20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings13.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings6.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings0.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        int int27 = outputSettings25.indentAmount;
        int int28 = outputSettings25.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        int int32 = outputSettings31.indentAmount();
        int int33 = outputSettings31.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.indentAmount((int) ' ');
        int int36 = outputSettings31.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings31.escapeMode;
        outputSettings30.escapeMode = escapeMode37;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        int int40 = outputSettings39.indentAmount();
        int int41 = outputSettings39.indentAmount;
        int int42 = outputSettings39.indentAmount;
        java.nio.charset.Charset charset43 = null;
        outputSettings39.charset = charset43;
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings39.escapeMode(escapeMode45);
        int int47 = outputSettings46.getindentAmount();
        java.nio.charset.Charset charset48 = outputSettings46.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings46.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings51.clone();
        int int53 = outputSettings52.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = null;
        outputSettings52.escapeMode = escapeMode54;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings56.clone();
        int int58 = outputSettings57.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings52.escapeMode(escapeMode59);
        outputSettings46.escapeMode = escapeMode59;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        int int63 = outputSettings62.indentAmount();
        int int64 = outputSettings62.indentAmount;
        int int65 = outputSettings62.indentAmount;
        java.nio.charset.Charset charset66 = null;
        outputSettings62.charset = charset66;
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings62.escapeMode(escapeMode68);
        int int70 = outputSettings69.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        int int72 = outputSettings71.indentAmount();
        int int73 = outputSettings71.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings71.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings69.escapeMode(escapeMode74);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        int int78 = outputSettings77.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.clone();
        java.nio.charset.CharsetEncoder charsetEncoder80 = outputSettings79.getcharsetEncoder();
        outputSettings76.setcharsetEncoder(charsetEncoder80);
        java.nio.charset.Charset charset82 = outputSettings76.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings75.charset(charset82);
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings46.charset(charset82);
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings30.charset(charset82);
        outputSettings0.charset = charset82;
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings0.indentAmount(32);
        int int91 = outputSettings90.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings90.clone();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charsetEncoder80);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 32 + "'", int91 == 32);
        org.junit.Assert.assertNotNull(outputSettings92);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        outputSettings7.setindentAmount((int) (short) 10);
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        outputSettings7.indentAmount = (short) 100;
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings7.getescapeMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean13 = textNode2.isBlank();
        int int14 = textNode2.childNodeSize();
        boolean boolean16 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        int int19 = outputSettings17.indentAmount;
        int int20 = outputSettings17.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        java.nio.charset.Charset charset25 = null;
        outputSettings24.charset = charset25;
        outputSettings24.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.prettyPrint(true);
        java.nio.charset.Charset charset31 = null;
        outputSettings24.setcharset(charset31);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings24.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings17.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        int int37 = outputSettings36.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        boolean boolean39 = outputSettings36.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings40.clone();
        int int42 = outputSettings41.indentAmount();
        java.nio.charset.Charset charset43 = outputSettings41.charset();
        outputSettings36.charset = charset43;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings17.charset(charset43);
        java.nio.charset.Charset charset46 = outputSettings45.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings45.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        java.nio.charset.Charset charset51 = null;
        outputSettings50.charset = charset51;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        outputSettings50.setcharsetEncoder(charsetEncoder53);
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings50.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings50.escapeMode(escapeMode56);
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.getescapeMode();
        org.jsoup.nodes.TextNode textNode61 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.StringBuilder stringBuilder62 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        int int65 = outputSettings64.indentAmount();
        int int66 = outputSettings64.indentAmount;
        int int67 = outputSettings64.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings64.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings70.clone();
        java.nio.charset.Charset charset72 = null;
        outputSettings71.charset = charset72;
        outputSettings71.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings71.prettyPrint(true);
        java.nio.charset.Charset charset78 = null;
        outputSettings71.setcharset(charset78);
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings71.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings64.escapeMode(escapeMode80);
        boolean boolean82 = outputSettings64.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings64.clone();
        textNode61.outerHtmlTail(stringBuilder62, (int) (byte) -1, outputSettings64);
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings64.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings57.escapeMode(escapeMode85);
        org.jsoup.nodes.Entities.EscapeMode escapeMode87 = outputSettings86.escapeMode();
        outputSettings48.escapeMode = escapeMode87;
        boolean boolean89 = textNode2.equals((java.lang.Object) escapeMode87);
        java.lang.String str91 = textNode2.attr("text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNull(escapeMode58);
        org.junit.Assert.assertNotNull(textNode61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertTrue("'" + escapeMode87 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode87.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "text" + "'", str91, "text");
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        boolean boolean15 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes16 = textNode13.attributes();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("text");
        java.lang.String str19 = textNode18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode18.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        boolean boolean8 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        int int11 = outputSettings9.indentAmount;
        int int12 = outputSettings9.indentAmount;
        java.nio.charset.Charset charset13 = null;
        outputSettings9.charset = charset13;
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.escapeMode(escapeMode15);
        int int17 = outputSettings9.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings9.escapeMode(escapeMode20);
        outputSettings0.setescapeMode(escapeMode20);
        java.nio.charset.Charset charset23 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.clone();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings27.getcharsetEncoder();
        outputSettings24.setcharsetEncoder(charsetEncoder28);
        outputSettings0.setcharsetEncoder(charsetEncoder28);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings0.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings0.escapeMode();
        java.lang.Class<?> wildcardClass34 = escapeMode33.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNull(charset23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount((int) ' ');
        int int5 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        int int8 = outputSettings7.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.escapeMode(escapeMode9);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        outputSettings10.charsetEncoder = charsetEncoder11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        java.nio.charset.Charset charset17 = null;
        outputSettings16.charset = charset17;
        outputSettings16.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        outputSettings24.setcharsetEncoder(charsetEncoder25);
        int int27 = outputSettings24.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        int int29 = outputSettings28.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings31.clone();
        int int33 = outputSettings32.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings28.escapeMode(escapeMode34);
        outputSettings24.escapeMode = escapeMode34;
        outputSettings16.escapeMode = escapeMode34;
        textNode2.outerHtmlTail(stringBuilder13, (int) (byte) 10, outputSettings16);
        org.jsoup.nodes.Node node39 = textNode2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        java.nio.charset.Charset charset2 = null;
        outputSettings1.charset = charset2;
        outputSettings1.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings1.prettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        outputSettings1.setcharset(charset8);
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings1.getescapeMode();
        outputSettings1.prettyPrint = true;
        outputSettings1.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings1.prettyPrint(false);
        int int17 = outputSettings16.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings16.charsetEncoder;
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        boolean boolean20 = outputSettings16.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        boolean boolean14 = textNode11.hasAttr("h");
        org.jsoup.nodes.Node node15 = textNode11.clone();
        textNode11.ensureAttributes();
        java.lang.String str18 = textNode11.absUrl("#text");
        java.lang.String str19 = textNode11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode11.childNodesCopy();
        org.jsoup.nodes.Node node21 = textNode11.nextSibling();
        java.lang.String str22 = textNode11.toString();
        org.jsoup.nodes.TextNode textNode24 = textNode11.splitText((int) (short) 1);
        java.lang.String str25 = textNode11.gettext();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str29 = textNode28.baseUri();
        java.lang.String str30 = textNode28.outerHtml();
        textNode28.settext("hi!");
        org.jsoup.nodes.Attributes attributes33 = textNode28.attributes();
        java.lang.String str34 = textNode28.nodeName();
        java.lang.String str35 = textNode28.toString();
        java.lang.String str37 = textNode28.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = textNode11.after((org.jsoup.nodes.Node) textNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "i!" + "'", str22, "i!");
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i" + "'", str25, "i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#text" + "'", str34, "#text");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setindentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount(100);
        int int7 = outputSettings0.getindentAmount();
        int int8 = outputSettings0.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset10 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings0.getescapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        textNode2.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("#text");
        java.lang.String str17 = textNode2.outerHtml();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node20 = textNode2.clone();
        int int21 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        outputSettings0.escapeMode = escapeMode2;
        boolean boolean4 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        int int8 = outputSettings6.indentAmount;
        int int9 = outputSettings6.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        int int13 = outputSettings12.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.clone();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings12.encoder();
        outputSettings6.setcharsetEncoder(charsetEncoder15);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings6.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        int int19 = outputSettings18.indentAmount();
        int int20 = outputSettings18.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.indentAmount((int) ' ');
        int int23 = outputSettings18.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings18.escapeMode(escapeMode27);
        outputSettings6.setescapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) (short) 0);
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str36 = textNode35.baseUri();
        java.lang.String str37 = textNode35.outerHtml();
        org.jsoup.nodes.Node node38 = textNode35.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode35.childNodesCopy();
        boolean boolean41 = textNode35.hasAttr("#text");
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        int int45 = outputSettings44.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings46.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings46.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount(10);
        java.nio.charset.Charset charset53 = outputSettings52.getcharset();
        outputSettings46.setcharset(charset53);
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        outputSettings46.setcharsetEncoder(charsetEncoder55);
        boolean boolean57 = outputSettings46.prettyPrint;
        outputSettings46.setindentAmount((int) (byte) 10);
        textNode35.outerHtmlTail(stringBuilder42, (int) (short) 10, outputSettings46);
        outputSettings46.indentAmount = (short) 10;
        java.nio.charset.Charset charset63 = outputSettings46.charset();
        outputSettings32.charset = charset63;
        outputSettings32.setprettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charset63);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        outputSettings7.prettyPrint = false;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        outputSettings16.escapeMode = escapeMode18;
        outputSettings16.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.clone();
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings26.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.prettyPrint(true);
        java.nio.charset.Charset charset30 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings23.charset(charset30);
        java.nio.charset.Charset charset32 = outputSettings23.charset;
        java.nio.charset.Charset charset33 = outputSettings23.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings34.clone();
        int int36 = outputSettings35.indentAmount();
        java.nio.charset.Charset charset37 = outputSettings35.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings35.getescapeMode();
        java.nio.charset.Charset charset39 = outputSettings35.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings40.clone();
        int int42 = outputSettings41.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = null;
        outputSettings41.escapeMode = escapeMode43;
        outputSettings41.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder47 = outputSettings41.getcharsetEncoder();
        boolean boolean48 = outputSettings41.prettyPrint();
        boolean boolean49 = outputSettings41.prettyPrint();
        java.nio.charset.Charset charset50 = outputSettings41.getcharset();
        outputSettings35.setcharset(charset50);
        outputSettings23.charset = charset50;
        java.nio.charset.Charset charset53 = outputSettings23.charset();
        outputSettings7.setcharset(charset53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charset53);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.nio.charset.Charset charset8 = null;
        outputSettings7.charset = charset8;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.prettyPrint(true);
        java.nio.charset.Charset charset14 = null;
        outputSettings7.setcharset(charset14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        int int20 = outputSettings19.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode();
        boolean boolean22 = outputSettings19.getprettyPrint();
        java.nio.charset.Charset charset23 = outputSettings19.getcharset();
        java.nio.charset.Charset charset24 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings0.charset(charset24);
        outputSettings25.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.prettyPrint(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings29);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        outputSettings1.escapeMode = escapeMode3;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings1.escapeMode;
        outputSettings1.setprettyPrint(false);
        outputSettings1.indentAmount = (byte) 1;
        int int10 = outputSettings1.indentAmount;
        java.nio.charset.Charset charset11 = outputSettings1.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        java.nio.charset.Charset charset14 = null;
        outputSettings13.charset = charset14;
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings19.getcharsetEncoder();
        outputSettings13.charsetEncoder = charsetEncoder20;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings13.indentAmount((int) ' ');
        int int24 = outputSettings13.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings13.escapeMode;
        int int26 = outputSettings13.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings13.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings13.encoder();
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        outputSettings36.setcharsetEncoder(charsetEncoder37);
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings36.encoder();
        java.nio.charset.Charset charset40 = outputSettings36.charset();
        int int41 = outputSettings36.indentAmount();
        textNode32.outerHtmlTail(stringBuilder33, 32, outputSettings36);
        outputSettings36.indentAmount = (byte) -1;
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings36.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        int int47 = outputSettings46.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.clone();
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings48.getcharsetEncoder();
        boolean boolean50 = outputSettings48.prettyPrint;
        java.nio.charset.Charset charset51 = outputSettings48.charset();
        outputSettings36.charset = charset51;
        outputSettings13.setcharset(charset51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings1.charset(charset51);
        java.nio.charset.Charset charset55 = outputSettings54.charset;
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(escapeMode5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(charset16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNull(charsetEncoder39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(charsetEncoder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(charset55);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.attr("text");
        java.lang.String str12 = textNode2.text;
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        textNode2.settext("h");
        java.lang.String str19 = textNode2.text();
        textNode2.setBaseUri("#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        boolean boolean4 = textNode2.hasAttr("h");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = null;
        outputSettings1.escapeMode = escapeMode3;
        outputSettings1.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings1.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings1.prettyPrint(false);
        outputSettings9.indentAmount = 0;
        java.nio.charset.Charset charset12 = outputSettings9.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        int int15 = outputSettings14.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = null;
        outputSettings14.escapeMode = escapeMode16;
        outputSettings14.prettyPrint = true;
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings14.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings14.prettyPrint(false);
        outputSettings22.indentAmount = 0;
        java.nio.charset.Charset charset25 = outputSettings22.charset;
        outputSettings9.charset = charset25;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        int int28 = outputSettings27.indentAmount();
        int int29 = outputSettings27.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.indentAmount((int) ' ');
        java.nio.charset.Charset charset32 = null;
        outputSettings31.charset = charset32;
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings31.charsetEncoder;
        boolean boolean35 = outputSettings31.getprettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings31.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings31.getcharsetEncoder();
        outputSettings9.charsetEncoder = charsetEncoder37;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        int int40 = outputSettings39.indentAmount();
        int int41 = outputSettings39.indentAmount;
        int int42 = outputSettings39.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings45.clone();
        java.nio.charset.Charset charset47 = null;
        outputSettings46.charset = charset47;
        outputSettings46.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings46.prettyPrint(true);
        java.nio.charset.Charset charset53 = null;
        outputSettings46.setcharset(charset53);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings46.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings39.escapeMode(escapeMode55);
        boolean boolean57 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        int int59 = outputSettings58.indentAmount();
        int int60 = outputSettings58.indentAmount;
        int int61 = outputSettings58.indentAmount;
        java.nio.charset.Charset charset62 = null;
        outputSettings58.charset = charset62;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings58.escapeMode(escapeMode64);
        int int66 = outputSettings65.getindentAmount();
        java.nio.charset.Charset charset67 = null;
        outputSettings65.charset = charset67;
        java.nio.charset.CharsetEncoder charsetEncoder69 = outputSettings65.encoder();
        outputSettings39.setcharsetEncoder(charsetEncoder69);
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        int int74 = outputSettings73.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings73.clone();
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings75.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings75.prettyPrint(true);
        java.nio.charset.Charset charset79 = outputSettings75.charset();
        int int80 = outputSettings75.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings75.escapeMode;
        outputSettings72.escapeMode = escapeMode81;
        outputSettings9.escapeMode = escapeMode81;
        java.nio.charset.CharsetEncoder charsetEncoder84 = outputSettings9.charsetEncoder;
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings9.escapeMode;
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder69);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        int int3 = outputSettings2.indentAmount();
        int int4 = outputSettings2.indentAmount;
        int int5 = outputSettings2.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        int int9 = outputSettings8.indentAmount();
        int int10 = outputSettings8.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount((int) ' ');
        int int13 = outputSettings8.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings8.escapeMode;
        outputSettings7.escapeMode = escapeMode14;
        outputSettings1.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings1.prettyPrint(false);
        outputSettings1.prettyPrint = false;
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        textNode2.outerHtmlTail(stringBuilder4, (-1), outputSettings6);
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean11 = textNode2.hasAttr("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        java.lang.String str14 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.jsoup.nodes.Node node18 = textNode2.attr("h", "");
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("#text");
        java.lang.String str21 = textNode20.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text();
        int int15 = textNode2.siblingIndex();
        java.lang.String str16 = textNode2.getTEXT_KEY();
        java.lang.String str18 = textNode2.attr("i!");
        boolean boolean19 = textNode2.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "text" + "'", str16, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str11 = textNode10.getWholeText();
        java.lang.String str12 = textNode10.baseUri();
        java.lang.String str14 = textNode10.attr("text");
        java.lang.String str15 = textNode10.nodeName();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node17 = textNode10.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode10.childNodes();
        java.lang.String str19 = textNode10.getTEXT_KEY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        outputSettings0.setindentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        outputSettings8.escapeMode = escapeMode10;
        outputSettings8.prettyPrint = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings8.getescapeMode();
        java.nio.charset.Charset charset15 = outputSettings8.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        java.nio.charset.Charset charset22 = null;
        outputSettings21.charset = charset22;
        outputSettings21.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.prettyPrint(true);
        java.nio.charset.Charset charset28 = null;
        outputSettings21.setcharset(charset28);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings21.getescapeMode();
        outputSettings18.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings18.charset;
        outputSettings8.charset = charset32;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings0.charset(charset32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings0.escapeMode;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(escapeMode14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "hi!");
        textNode2.text = "i!";
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.absUrl("text");
        textNode2.ensureAttributes();
        int int9 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        int int2 = outputSettings1.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode();
        boolean boolean4 = outputSettings1.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        int int6 = outputSettings5.indentAmount();
        int int7 = outputSettings5.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.indentAmount((int) ' ');
        int int10 = outputSettings5.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings11.clone();
        java.nio.charset.Charset charset13 = null;
        outputSettings12.charset = charset13;
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        java.nio.charset.Charset charset16 = outputSettings12.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings12.getcharsetEncoder();
        outputSettings5.charsetEncoder = charsetEncoder17;
        outputSettings1.setcharsetEncoder(charsetEncoder17);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings1.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        int int26 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.getescapeMode();
        outputSettings23.escapeMode = escapeMode29;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings23.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertNull(charset16);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text();
        java.lang.String str15 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("t");
        org.jsoup.nodes.Node node19 = textNode17.removeAttr("i!");
        int int20 = textNode17.childNodeSize();
        org.jsoup.nodes.Node node23 = textNode17.attr("text", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "text" + "'", str15, "text");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str14 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        outputSettings9.indentAmount = 0;
        int int14 = outputSettings9.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings9.getcharsetEncoder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charsetEncoder15);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.attr("");
        textNode2.settext("h");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("ext");
        java.lang.String str15 = textNode14.gettext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i!" + "'", str12, "i!");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ext" + "'", str15, "ext");
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.text();
        java.lang.String str14 = textNode7.attr("");
        java.lang.String str15 = textNode7.baseUri();
        org.jsoup.nodes.Node node16 = textNode7.previousSibling();
        textNode7.text = "text";
        java.lang.String str19 = textNode7.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        int int2 = outputSettings0.indentAmount;
        int int3 = outputSettings0.indentAmount;
        java.nio.charset.Charset charset4 = null;
        outputSettings0.charset = charset4;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.escapeMode(escapeMode6);
        int int8 = outputSettings7.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        int int11 = outputSettings9.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings9.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.escapeMode(escapeMode12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings7.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings15.clone();
        java.nio.charset.Charset charset17 = null;
        outputSettings16.charset = charset17;
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        int int21 = outputSettings20.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.clone();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings22.getcharsetEncoder();
        outputSettings16.charsetEncoder = charsetEncoder23;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings16.indentAmount((int) ' ');
        int int27 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings16.escapeMode;
        int int29 = outputSettings16.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings16.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings16.escapeMode;
        outputSettings7.escapeMode = escapeMode31;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings7.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings7.charsetEncoder;
        outputSettings7.prettyPrint = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charsetEncoder35);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        int int15 = outputSettings13.indentAmount;
        int int16 = outputSettings13.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        java.nio.charset.Charset charset21 = null;
        outputSettings20.charset = charset21;
        outputSettings20.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings20.prettyPrint(true);
        java.nio.charset.Charset charset27 = null;
        outputSettings20.setcharset(charset27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings13.escapeMode(escapeMode29);
        textNode2.outerHtmlTail(stringBuilder11, (int) (byte) 0, outputSettings30);
        org.jsoup.nodes.TextNode textNode33 = textNode2.text("text");
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        int int37 = outputSettings36.indentAmount();
        int int38 = outputSettings36.indentAmount;
        int int39 = outputSettings36.indentAmount;
        java.nio.charset.Charset charset40 = null;
        outputSettings36.charset = charset40;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings36.escapeMode(escapeMode42);
        int int44 = outputSettings43.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        int int47 = outputSettings45.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings45.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.escapeMode(escapeMode48);
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings43.encoder();
        java.nio.charset.Charset charset51 = outputSettings43.charset();
        outputSettings43.prettyPrint = false;
        org.jsoup.nodes.TextNode textNode56 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes57 = textNode56.attributes();
        java.lang.String str58 = textNode56.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings59.clone();
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        outputSettings60.setcharsetEncoder(charsetEncoder61);
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings60.encoder();
        java.nio.charset.Charset charset64 = outputSettings60.charset();
        int int65 = outputSettings60.indentAmount();
        boolean boolean66 = textNode56.equals((java.lang.Object) outputSettings60);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings67.clone();
        java.nio.charset.CharsetEncoder charsetEncoder69 = null;
        outputSettings68.setcharsetEncoder(charsetEncoder69);
        outputSettings68.indentAmount = (short) 10;
        java.nio.charset.Charset charset73 = outputSettings68.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings68.indentAmount((int) (short) 10);
        java.nio.charset.Charset charset76 = outputSettings75.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings60.charset(charset76);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings78.clone();
        int int80 = outputSettings79.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings79.escapeMode();
        boolean boolean82 = outputSettings79.getprettyPrint();
        java.nio.charset.Charset charset83 = outputSettings79.getcharset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings79.prettyPrint(false);
        java.nio.charset.Charset charset87 = outputSettings86.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings77.charset(charset87);
        outputSettings43.charset = charset87;
        int int90 = outputSettings43.indentAmount();
        int int91 = outputSettings43.indentAmount();
        textNode2.outerHtmlTail(stringBuilder34, (int) (byte) -1, outputSettings43);
        org.jsoup.nodes.Document.OutputSettings outputSettings94 = outputSettings43.indentAmount((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertNull(charset51);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNull(charsetEncoder63);
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(charset76);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(charset83);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(charset87);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(outputSettings94);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("text");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.lang.String str16 = textNode2.gettext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.text = "i!";
        java.lang.String str12 = textNode2.attr("text");
        java.lang.String str13 = textNode2.text();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        boolean boolean16 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node17 = textNode2.parent();
        java.lang.String str18 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "text" + "'", str7, "text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textNode20);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.siblingNodes();
        org.jsoup.nodes.Attributes attributes8 = textNode5.attributes();
        textNode5.text = "hi!";
        boolean boolean11 = textNode5.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode5.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode13.attr("text", "text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        int int8 = outputSettings7.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings7.escapeMode = escapeMode9;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        int int16 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings17.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings14.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        int int26 = outputSettings25.indentAmount();
        int int27 = outputSettings25.indentAmount;
        int int28 = outputSettings25.indentAmount;
        java.nio.charset.Charset charset29 = null;
        outputSettings25.charset = charset29;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings25.escapeMode(escapeMode31);
        int int33 = outputSettings25.getindentAmount();
        int int34 = outputSettings25.indentAmount;
        int int35 = outputSettings25.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        int int37 = outputSettings36.indentAmount();
        int int38 = outputSettings36.indentAmount;
        int int39 = outputSettings36.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings36.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        int int43 = outputSettings42.indentAmount();
        int int44 = outputSettings42.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings42.indentAmount((int) ' ');
        int int47 = outputSettings42.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings42.escapeMode;
        outputSettings41.escapeMode = escapeMode48;
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings41.encoder();
        outputSettings25.setcharsetEncoder(charsetEncoder50);
        outputSettings24.setcharsetEncoder(charsetEncoder50);
        textNode2.outerHtmlTail(stringBuilder4, (int) '#', outputSettings24);
        outputSettings24.setindentAmount((int) (short) -1);
        boolean boolean56 = outputSettings24.prettyPrint;
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        int int1 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings2.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings2.charset();
        int int7 = outputSettings2.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings2.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        outputSettings10.setcharsetEncoder(charsetEncoder11);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings10.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings10.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        int int16 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings17.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        java.nio.charset.Charset charset24 = outputSettings23.getcharset();
        outputSettings17.setcharset(charset24);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        outputSettings17.setcharsetEncoder(charsetEncoder26);
        boolean boolean28 = outputSettings17.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings17.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings10.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings2.escapeMode(escapeMode29);
        boolean boolean32 = outputSettings31.prettyPrint;
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str36 = textNode35.getWholeText();
        textNode35.text = "";
        org.jsoup.nodes.Node node39 = textNode35.parent();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        int int43 = outputSettings42.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.clone();
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings44.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings44.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings47.getcharsetEncoder();
        textNode35.outerHtmlTail(stringBuilder40, (int) (short) -1, outputSettings47);
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings47.charsetEncoder;
        java.nio.charset.Charset charset53 = outputSettings47.getcharset();
        outputSettings31.charset = charset53;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings55.clone();
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        outputSettings56.setcharsetEncoder(charsetEncoder57);
        outputSettings56.indentAmount = (short) 10;
        java.nio.charset.Charset charset61 = outputSettings56.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings56.indentAmount((int) (short) 10);
        int int64 = outputSettings56.indentAmount;
        java.nio.charset.Charset charset65 = outputSettings56.charset;
        java.nio.charset.Charset charset66 = outputSettings56.getcharset();
        outputSettings31.setcharset(charset66);
        org.jsoup.nodes.TextNode textNode70 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str71 = textNode70.baseUri();
        java.lang.String str72 = textNode70.outerHtml();
        textNode70.settext("hi!");
        org.jsoup.nodes.Attributes attributes75 = textNode70.attributes();
        textNode70.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = textNode70.childNodesCopy();
        java.lang.StringBuilder stringBuilder78 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = new org.jsoup.nodes.Document.OutputSettings();
        int int82 = outputSettings81.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings81.clone();
        java.nio.charset.CharsetEncoder charsetEncoder84 = outputSettings83.getcharsetEncoder();
        outputSettings80.setcharsetEncoder(charsetEncoder84);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        int int87 = outputSettings86.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.clone();
        outputSettings86.setindentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode91 = outputSettings86.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder92 = outputSettings86.encoder();
        java.nio.charset.Charset charset93 = outputSettings86.getcharset();
        outputSettings80.charset = charset93;
        textNode70.outerHtmlTail(stringBuilder78, (int) (short) 0, outputSettings80);
        int int96 = outputSettings80.indentAmount();
        java.nio.charset.Charset charset97 = outputSettings80.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings98 = outputSettings31.charset(charset97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNull(charsetEncoder13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charsetEncoder45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(charsetEncoder84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertTrue("'" + escapeMode91 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode91.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder92);
        org.junit.Assert.assertNotNull(charset93);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(charset97);
        org.junit.Assert.assertNotNull(outputSettings98);
    }
}

