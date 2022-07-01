import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test21501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode11.toString();
        java.lang.String str13 = textNode11.getWholeText();
        org.jsoup.nodes.Node node14 = textNode11.nextSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode11.splitText((int) (short) 1);
        org.jsoup.nodes.Attributes attributes17 = textNode16.attributes();
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node21 = textNode20.previousSibling();
        org.jsoup.nodes.TextNode textNode23 = textNode20.text("h");
        textNode20.setBaseUri("h");
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings26.escapeMode(escapeMode33);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        boolean boolean36 = textNode20.equals((java.lang.Object) escapeMode35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = textNode16.after((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        boolean boolean33 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings32.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings26.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings25.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings12.charset(charset37);
        boolean boolean43 = textNode2.equals((java.lang.Object) outputSettings12);
        boolean boolean45 = textNode2.hasAttr("");
        org.jsoup.nodes.Document document46 = textNode2.ownerDocument();
        java.lang.String str47 = textNode2.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#text" + "'", str47, "#text");
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.text();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode11.toString();
        java.lang.String str13 = textNode11.getWholeText();
        boolean boolean14 = textNode11.isBlank();
        org.jsoup.nodes.Node node17 = textNode11.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        boolean boolean15 = textNode13.isBlank();
        java.lang.String str16 = textNode13.baseUri();
        java.lang.String str17 = textNode13.baseUri();
        boolean boolean18 = textNode2.equals((java.lang.Object) str17);
        org.jsoup.nodes.Node node19 = textNode2.clone();
        java.lang.String str20 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        java.lang.String str22 = textNode2.baseUri();
        org.jsoup.nodes.Node node25 = textNode2.attr("h", "text");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        java.lang.String str13 = textNode12.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings9.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings5.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings5.prettyPrint(false);
        boolean boolean21 = textNode2.equals((java.lang.Object) outputSettings5);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings5.indentAmount((int) 'a');
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        org.jsoup.nodes.Node node28 = textNode26.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(10);
        boolean boolean36 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount(10);
        java.nio.charset.Charset charset40 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings35.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings29.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount(10);
        boolean boolean46 = outputSettings45.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount(10);
        java.nio.charset.Charset charset50 = outputSettings47.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings45.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings51.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings42.escapeMode(escapeMode54);
        boolean boolean56 = textNode26.equals((java.lang.Object) outputSettings42);
        java.nio.charset.Charset charset57 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings5.charset(charset57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.indentAmount(10);
        boolean boolean4 = outputSettings3.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings3.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings11.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings0.charset(charset22);
        java.nio.charset.Charset charset27 = outputSettings0.charset();
        boolean boolean28 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        int int8 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        java.nio.charset.Charset charset12 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        boolean boolean26 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings9.escapeMode(escapeMode27);
        int int29 = outputSettings28.indentAmount();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings6.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings5.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings34.escapeMode();
        boolean boolean38 = outputSettings34.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str17 = textNode2.attr("");
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        org.jsoup.nodes.Document document21 = textNode2.ownerDocument();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount(10);
        java.nio.charset.Charset charset27 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings22.charset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        boolean boolean33 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings32.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings38.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings29.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings15.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount(10);
        java.nio.charset.Charset charset47 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings44.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings44.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset52 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings43.charset(charset52);
        boolean boolean54 = outputSettings43.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings43.forceAllElementAsBlock(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(outputSettings56);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        textNode2.setBaseUri("");
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.nodeName();
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node16 = textNode2.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        java.nio.charset.Charset charset13 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings7.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings7.forceAllElementAsBlock(false);
        boolean boolean18 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        boolean boolean22 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.charset(charset26);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        java.nio.charset.Charset charset29 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings7.charset(charset29);
        boolean boolean31 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings7.indentAmount(97);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings7.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        boolean boolean7 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings14.charset(charset19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings8.charset(charset19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        boolean boolean25 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings8.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(10);
        boolean boolean31 = outputSettings30.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(10);
        boolean boolean36 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings30.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings8.escapeMode(escapeMode37);
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount(10);
        java.nio.charset.Charset charset44 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings41.prettyPrint(false);
        int int47 = outputSettings41.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings41.clone();
        java.nio.charset.Charset charset49 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings39.charset(charset49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings0.charset(charset49);
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings0.escapeMode(escapeMode52);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings53);
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        java.nio.charset.Charset charset11 = outputSettings10.charset();
        boolean boolean12 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.indentAmount(32);
        int int17 = outputSettings10.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings10.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings10.forceAllElementAsBlock(false);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        node12.setBaseUri("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.siblingNodes();
        java.lang.String str11 = textNode8.attr("h");
        java.lang.String str12 = textNode8.text();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i!" + "'", str12, "i!");
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        java.lang.String str14 = textNode6.absUrl("hi!");
        java.lang.String str15 = textNode6.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode6.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.outerHtml();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node10 = node9.clone();
        int int11 = node10.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings11.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings11.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount(10);
        boolean boolean39 = outputSettings38.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings33.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings11.escapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount(10);
        boolean boolean49 = outputSettings48.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings43.escapeMode(escapeMode50);
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings51.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings54.prettyPrint(false);
        boolean boolean58 = outputSettings54.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings54.clone();
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount(10);
        java.nio.charset.Charset charset64 = outputSettings61.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.indentAmount(10);
        boolean boolean68 = outputSettings67.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount(10);
        java.nio.charset.Charset charset72 = outputSettings69.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings67.charset(charset72);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings61.charset(charset72);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount(10);
        boolean boolean78 = outputSettings77.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings77.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings61.escapeMode(escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings59.escapeMode(escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings11.escapeMode(escapeMode79);
        int int83 = outputSettings82.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings82.indentAmount(0);
        boolean boolean86 = textNode2.equals((java.lang.Object) outputSettings82);
        org.jsoup.nodes.Node node87 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node89 = node87.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node87);
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.absUrl("hi!");
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        org.jsoup.nodes.Node node15 = textNode13.clone();
        java.lang.String str17 = textNode13.attr("hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("hi!");
        java.lang.String str20 = textNode13.getWholeText();
        java.lang.String str21 = textNode13.text();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode13.siblingNodes();
        java.lang.String str23 = textNode13.baseUri();
        textNode13.setBaseUri("hi!");
        java.lang.String str26 = textNode13.text();
        org.jsoup.nodes.TextNode textNode28 = textNode13.text("i!");
        boolean boolean29 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str30 = textNode13.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i!" + "'", str30, "i!");
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.forceAllElementAsBlock(true);
        int int17 = outputSettings10.indentAmount();
        int int18 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings10.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        boolean boolean30 = outputSettings29.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        java.nio.charset.Charset charset34 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings29.charset(charset34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings23.charset(charset34);
        boolean boolean37 = outputSettings36.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings22.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings7.escapeMode(escapeMode38);
        java.nio.charset.Charset charset41 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(10);
        boolean boolean45 = outputSettings44.forceAllElementAsBlock();
        boolean boolean46 = outputSettings44.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings44.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings44.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings50.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.indentAmount(10);
        boolean boolean57 = outputSettings56.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings56.prettyPrint(true);
        java.nio.charset.Charset charset60 = outputSettings59.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings53.charset(charset60);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings7.escapeMode(escapeMode62);
        java.nio.charset.Charset charset64 = outputSettings7.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charset64);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.absUrl("#text");
        java.lang.String str11 = textNode6.attr("hi!");
        java.lang.String str13 = textNode6.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        java.lang.String str16 = textNode6.absUrl("#text");
        org.jsoup.nodes.TextNode textNode18 = textNode6.text("text");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.siblingNodes();
        java.lang.String str23 = textNode21.outerHtml();
        java.lang.String str24 = textNode21.getWholeText();
        java.lang.String str26 = textNode21.attr("hi!");
        java.lang.String str27 = textNode21.nodeName();
        org.jsoup.nodes.Node node28 = textNode21.clone();
        org.jsoup.nodes.Node node29 = textNode21.clone();
        org.jsoup.nodes.Attributes attributes30 = textNode21.attributes();
        org.jsoup.nodes.TextNode textNode32 = textNode21.text("h");
        int int33 = textNode21.siblingIndex();
        java.lang.String str35 = textNode21.absUrl("i!");
        boolean boolean36 = textNode18.equals((java.lang.Object) textNode21);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#text" + "'", str27, "#text");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        java.nio.charset.Charset charset17 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings20.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings14.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings13.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings0.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.clone();
        boolean boolean42 = outputSettings39.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        boolean boolean48 = outputSettings47.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount(10);
        java.nio.charset.Charset charset52 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings47.charset(charset52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings53.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings57.indentAmount(10);
        boolean boolean60 = outputSettings59.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings59.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings59.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings53.escapeMode(escapeMode65);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings44.escapeMode(escapeMode65);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings30.escapeMode(escapeMode65);
        int int69 = outputSettings68.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings68.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings72.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount(10);
        boolean boolean78 = outputSettings77.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings77.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings72.escapeMode(escapeMode79);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings80.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings82.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings83.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings83.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.indentAmount(10);
        boolean boolean89 = outputSettings88.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings88.prettyPrint(true);
        int int92 = outputSettings91.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode93 = outputSettings91.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings91.indentAmount(32);
        java.nio.charset.Charset charset96 = outputSettings95.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings97 = outputSettings83.charset(charset96);
        org.jsoup.nodes.Document.OutputSettings outputSettings98 = outputSettings68.charset(charset96);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertTrue("'" + escapeMode93 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode93.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings95);
        org.junit.Assert.assertNotNull(charset96);
        org.junit.Assert.assertNotNull(outputSettings97);
        org.junit.Assert.assertNotNull(outputSettings98);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        int int6 = outputSettings5.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings5.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings15.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings5.escapeMode(escapeMode22);
        java.nio.charset.Charset charset25 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings26.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings5.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.indentAmount((int) (byte) 100);
        boolean boolean40 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings39.forceAllElementAsBlock(true);
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset47 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings5.charset(charset47);
        int int49 = outputSettings48.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings48.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings48.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(outputSettings51);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("#", "#");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean14 = textNode2.hasAttr("h");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.outerHtml();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode2.attr("hi!", "hi!");
        java.lang.String str16 = textNode2.text();
        java.lang.String str18 = textNode2.absUrl("#");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.nodeName();
        java.lang.String str11 = textNode9.getWholeText();
        java.lang.String str12 = textNode9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        org.jsoup.nodes.Node node12 = textNode8.attr("#text", "");
        java.lang.String str14 = textNode8.attr("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode8.text("hi!");
        org.jsoup.nodes.Node node17 = textNode8.parent();
        org.jsoup.nodes.TextNode textNode19 = textNode8.text("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.indentAmount(10);
        boolean boolean4 = outputSettings3.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings3.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings3.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings11.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings0.charset(charset22);
        java.nio.charset.Charset charset27 = outputSettings0.charset();
        boolean boolean28 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.prettyPrint(true);
        java.nio.charset.Charset charset35 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset39 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset42 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings34.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings0.charset(charset42);
        int int45 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        textNode2.setBaseUri("");
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.text();
        java.lang.String str12 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        java.lang.String str14 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node19 = textNode17.removeAttr("hi!");
        java.lang.String str20 = textNode17.getWholeText();
        boolean boolean21 = textNode17.isBlank();
        java.lang.String str22 = textNode17.getWholeText();
        boolean boolean24 = textNode17.hasAttr("");
        org.jsoup.nodes.Node node25 = textNode17.parent();
        org.jsoup.nodes.TextNode textNode27 = textNode17.text("");
        textNode17.setBaseUri("hi!");
        java.lang.String str30 = textNode17.text();
        org.jsoup.nodes.TextNode textNode32 = textNode17.text("hi!");
        boolean boolean33 = textNode2.equals((java.lang.Object) textNode17);
        int int34 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node36 = textNode17.removeAttr("#");
        java.lang.Class<?> wildcardClass37 = textNode17.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.absUrl("#text");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node15 = textNode14.parent();
        org.jsoup.nodes.Node node16 = textNode14.clone();
        org.jsoup.nodes.Document document17 = textNode14.ownerDocument();
        org.jsoup.nodes.Node node20 = textNode14.attr("hi!", "#text");
        java.lang.String str22 = textNode14.absUrl("#text");
        org.jsoup.nodes.Node node24 = textNode14.removeAttr("hi!");
        java.lang.String str25 = textNode14.text();
        org.jsoup.nodes.Node node28 = textNode14.attr("i!", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node11.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.attr("#text");
        java.lang.String str12 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str12 = textNode2.absUrl("h");
        boolean boolean14 = textNode2.hasAttr("#text");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        textNode6.setBaseUri("#text");
        textNode6.setBaseUri("#text");
        java.lang.String str18 = textNode6.attr("#text");
        java.lang.String str19 = textNode6.toString();
        boolean boolean20 = textNode6.isBlank();
        java.lang.String str21 = textNode6.text();
        java.lang.String str23 = textNode6.absUrl("#text");
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        java.lang.String str28 = textNode26.outerHtml();
        java.lang.String str29 = textNode26.getWholeText();
        java.lang.String str30 = textNode26.toString();
        java.lang.String str31 = textNode26.text();
        java.lang.String str33 = textNode26.absUrl("#text");
        org.jsoup.nodes.TextNode textNode35 = textNode26.text("");
        org.jsoup.nodes.TextNode textNode37 = textNode35.text("#text");
        java.lang.String str39 = textNode37.absUrl("#text");
        org.jsoup.nodes.Node node40 = textNode37.clone();
        java.lang.String str42 = textNode37.absUrl("h");
        org.jsoup.nodes.Node node44 = textNode37.removeAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode6.replaceWith(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) '4');
        int int34 = outputSettings31.indentAmount();
        int int35 = outputSettings31.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.indentAmount((int) (byte) 0);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(outputSettings37);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.lang.String str11 = textNode8.baseUri();
        org.jsoup.nodes.TextNode textNode13 = textNode8.splitText((int) (byte) 0);
        boolean boolean15 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node17 = textNode8.removeAttr("i!");
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        java.nio.charset.Charset charset25 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.prettyPrint(true);
        boolean boolean30 = node18.equals((java.lang.Object) outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("");
        boolean boolean10 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.attr("#text");
        java.lang.String str13 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.nodeName();
        java.lang.String str16 = textNode2.attr("#text");
        java.lang.String str17 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        int int6 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings0.escapeMode(escapeMode11);
        java.nio.charset.Charset charset13 = outputSettings12.charset();
        boolean boolean14 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.clone();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        java.nio.charset.Charset charset11 = outputSettings10.charset();
        boolean boolean12 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.indentAmount(32);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(true);
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        int int21 = outputSettings18.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings25.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        java.lang.String str13 = textNode9.attr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode9.text("hi!");
        java.lang.String str16 = textNode9.getWholeText();
        java.lang.String str17 = textNode9.text();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.siblingNodes();
        org.jsoup.nodes.Document document19 = textNode9.ownerDocument();
        java.lang.String str20 = textNode9.nodeName();
        boolean boolean21 = textNode2.equals((java.lang.Object) str20);
        org.jsoup.nodes.Node node24 = textNode2.attr("text", "");
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.siblingNodes();
        java.lang.String str29 = textNode27.outerHtml();
        java.lang.String str30 = textNode27.getWholeText();
        java.lang.String str31 = textNode27.toString();
        java.lang.String str32 = textNode27.text();
        java.lang.String str33 = textNode27.nodeName();
        java.lang.String str34 = textNode27.nodeName();
        java.lang.String str35 = textNode27.getWholeText();
        java.lang.String str37 = textNode27.attr("h");
        java.lang.String str39 = textNode27.absUrl("i!");
        java.lang.String str40 = textNode27.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node24.replaceWith((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#text" + "'", str33, "#text");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#text" + "'", str34, "#text");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#text" + "'", str40, "#text");
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        java.lang.String str14 = textNode11.attr("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.siblingNodes();
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.Node node22 = textNode2.attr("i!", "text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        java.lang.String str16 = textNode15.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        textNode8.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        boolean boolean10 = outputSettings9.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        java.nio.charset.Charset charset23 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings18.charset(charset23);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings12.charset(charset23);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        boolean boolean29 = outputSettings28.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings12.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount(10);
        boolean boolean35 = outputSettings34.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount(10);
        boolean boolean40 = outputSettings39.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings34.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings12.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings9.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings9.indentAmount((int) (short) 0);
        boolean boolean47 = outputSettings46.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        boolean boolean51 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        int int54 = outputSettings53.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(10);
        boolean boolean58 = outputSettings57.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings53.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount(10);
        boolean boolean64 = outputSettings63.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount(10);
        boolean boolean69 = outputSettings68.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings68.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings63.escapeMode(escapeMode70);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings53.escapeMode(escapeMode70);
        java.nio.charset.Charset charset73 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings74.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.indentAmount(10);
        boolean boolean80 = outputSettings79.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings74.escapeMode(escapeMode81);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings53.escapeMode(escapeMode81);
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings53.clone();
        int int85 = outputSettings84.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings86.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings86.forceAllElementAsBlock(true);
        int int93 = outputSettings86.indentAmount();
        int int94 = outputSettings86.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings96 = outputSettings86.forceAllElementAsBlock(true);
        java.nio.charset.Charset charset97 = outputSettings86.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings98 = outputSettings84.charset(charset97);
        org.jsoup.nodes.Document.OutputSettings outputSettings99 = outputSettings46.charset(charset97);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 10 + "'", int94 == 10);
        org.junit.Assert.assertNotNull(outputSettings96);
        org.junit.Assert.assertNotNull(charset97);
        org.junit.Assert.assertNotNull(outputSettings98);
        org.junit.Assert.assertNotNull(outputSettings99);
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "i!");
        java.lang.String str13 = textNode2.attr("");
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings0.indentAmount((int) (byte) 0);
        java.nio.charset.Charset charset34 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount(10);
        boolean boolean42 = outputSettings41.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount(10);
        java.nio.charset.Charset charset46 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings41.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings0.charset(charset46);
        boolean boolean50 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount(10);
        java.nio.charset.Charset charset54 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(10);
        boolean boolean58 = outputSettings57.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(10);
        java.nio.charset.Charset charset62 = outputSettings59.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings57.charset(charset62);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings51.charset(charset62);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.indentAmount(10);
        boolean boolean68 = outputSettings67.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings67.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings51.escapeMode(escapeMode69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.indentAmount(10);
        boolean boolean74 = outputSettings73.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings73.prettyPrint(true);
        java.nio.charset.Charset charset77 = outputSettings76.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings76.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset81 = outputSettings80.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings80.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset84 = outputSettings83.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings76.charset(charset84);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings70.charset(charset84);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings86.prettyPrint(false);
        java.nio.charset.Charset charset89 = outputSettings86.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings0.charset(charset89);
        boolean boolean91 = outputSettings90.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charset81);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(charset84);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(charset89);
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node15 = textNode14.clone();
        org.jsoup.nodes.Node node16 = textNode14.nextSibling();
        boolean boolean18 = textNode14.hasAttr("");
        java.lang.String str19 = textNode14.outerHtml();
        int int20 = textNode14.siblingIndex();
        java.lang.String str21 = textNode14.baseUri();
        java.lang.String str23 = textNode14.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.lang.String str6 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.Document document11 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode8.clone();
        textNode8.setBaseUri("i!");
        java.lang.String str15 = textNode8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode8.siblingNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode8.text("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode8.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        java.nio.charset.Charset charset24 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings21.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings20.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings10.charset(charset32);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount(10);
        java.nio.charset.Charset charset40 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount(10);
        boolean boolean44 = outputSettings43.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings37.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount(10);
        boolean boolean54 = outputSettings53.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings37.escapeMode(escapeMode55);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings10.escapeMode(escapeMode55);
        java.nio.charset.Charset charset58 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings7.charset(charset58);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(1);
        boolean boolean62 = outputSettings61.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings61.indentAmount((int) '#');
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.text();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.baseUri();
        int int13 = textNode2.siblingIndex();
        int int14 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node18 = textNode17.clone();
        org.jsoup.nodes.Node node19 = textNode17.nextSibling();
        java.lang.String str20 = textNode17.baseUri();
        org.jsoup.nodes.TextNode textNode22 = textNode17.text("");
        java.lang.String str24 = textNode22.absUrl("hi!");
        org.jsoup.nodes.Node node27 = textNode22.attr("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node27.siblingNodes();
        org.jsoup.nodes.Node node29 = node27.parent();
        org.jsoup.nodes.Node node30 = node27.parent();
        boolean boolean31 = textNode2.equals((java.lang.Object) node27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = textNode2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        textNode12.setBaseUri("#text");
        java.lang.String str15 = textNode12.nodeName();
        org.jsoup.nodes.Node node17 = textNode12.removeAttr("hi!");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode12.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        textNode6.setBaseUri("#text");
        textNode6.setBaseUri("#text");
        boolean boolean17 = textNode6.isBlank();
        org.jsoup.nodes.Node node19 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node20 = node19.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.Document document11 = textNode10.ownerDocument();
        java.lang.String str13 = textNode10.absUrl("hi!");
        java.lang.String str14 = textNode10.text();
        org.jsoup.nodes.Node node15 = textNode10.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document12 = textNode11.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode11);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode11.siblingNodes();
        java.lang.String str16 = textNode11.text();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("i!");
        org.jsoup.nodes.Attributes attributes19 = textNode18.attributes();
        java.lang.String str21 = textNode18.absUrl("hi!");
        java.lang.String str23 = textNode18.attr("#text");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        int int8 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        java.nio.charset.Charset charset12 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        boolean boolean26 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings9.escapeMode(escapeMode27);
        int int29 = outputSettings28.indentAmount();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings6.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings5.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings34.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings36);
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        boolean boolean15 = outputSettings14.prettyPrint();
        boolean boolean16 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings14.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        boolean boolean22 = textNode10.equals((java.lang.Object) outputSettings20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.charset("h");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: h");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        textNode2.setBaseUri("");
        java.lang.String str14 = textNode2.attr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        java.nio.charset.Charset charset18 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        boolean boolean22 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings15.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings37.prettyPrint(true);
        java.nio.charset.Charset charset41 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings40.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset45 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings44.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset48 = outputSettings47.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings40.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings34.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        int int53 = outputSettings50.indentAmount();
        boolean boolean54 = textNode2.equals((java.lang.Object) int53);
        java.lang.String str55 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        textNode2.setBaseUri("");
        boolean boolean10 = textNode2.hasAttr("");
        textNode2.setBaseUri("hi!");
        java.lang.String str13 = textNode2.outerHtml();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str16 = textNode2.absUrl("#");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("");
        java.lang.String str22 = textNode19.toString();
        textNode19.setBaseUri("#text");
        java.lang.String str25 = textNode19.outerHtml();
        org.jsoup.nodes.Node node26 = textNode19.clone();
        java.lang.String str28 = textNode19.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode19.childNodes();
        boolean boolean30 = textNode19.isBlank();
        textNode19.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = textNode2.after((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Node node12 = textNode9.attr("hi!", "#text");
        java.lang.String str14 = textNode9.absUrl("hi!");
        java.lang.String str15 = textNode9.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        java.nio.charset.Charset charset18 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.charset(charset18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        boolean boolean25 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(10);
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.indentAmount(10);
        boolean boolean40 = outputSettings39.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount(10);
        java.nio.charset.Charset charset44 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings39.charset(charset44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings33.charset(charset44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount(10);
        boolean boolean50 = outputSettings49.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount(10);
        java.nio.charset.Charset charset54 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings49.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings55.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings55.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings46.escapeMode(escapeMode58);
        int int60 = outputSettings59.indentAmount();
        java.nio.charset.Charset charset61 = outputSettings59.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings30.charset(charset61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings19.charset(charset61);
        boolean boolean64 = textNode2.equals((java.lang.Object) charset61);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings31.clone();
        java.nio.charset.Charset charset37 = outputSettings31.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        java.nio.charset.Charset charset12 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings9.prettyPrint(false);
        int int15 = outputSettings9.indentAmount();
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings9);
        java.nio.charset.Charset charset17 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings9.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings9.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(false);
        boolean boolean25 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.forceAllElementAsBlock(false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        int int5 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node12 = textNode10.removeAttr("hi!");
        java.lang.String str13 = textNode10.getWholeText();
        java.lang.String str14 = textNode10.toString();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode10);
        boolean boolean16 = textNode10.isBlank();
        org.jsoup.nodes.Node node17 = textNode10.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("#text");
        org.jsoup.nodes.Node node16 = textNode11.attr("hi!", "hi!");
        boolean boolean17 = textNode11.isBlank();
        org.jsoup.nodes.Document document18 = textNode11.ownerDocument();
        org.jsoup.nodes.Node node20 = textNode11.removeAttr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        java.nio.charset.Charset charset6 = outputSettings3.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.charset(charset14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        boolean boolean20 = outputSettings19.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings3.escapeMode(escapeMode21);
        int int23 = outputSettings22.indentAmount();
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings0.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.forceAllElementAsBlock(false);
        int int32 = outputSettings29.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount(10);
        boolean boolean43 = outputSettings42.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings37.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        java.nio.charset.Charset charset51 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.indentAmount(10);
        boolean boolean55 = outputSettings54.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.indentAmount(10);
        java.nio.charset.Charset charset59 = outputSettings56.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings54.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings48.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(10);
        boolean boolean65 = outputSettings64.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount(10);
        java.nio.charset.Charset charset69 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings64.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings70.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings70.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings70.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings61.escapeMode(escapeMode73);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings37.escapeMode(escapeMode73);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings76.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings79.indentAmount(10);
        boolean boolean82 = outputSettings81.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings81.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings76.escapeMode(escapeMode83);
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings84.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings84.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = outputSettings87.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings87.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode91 = outputSettings90.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings37.escapeMode(escapeMode91);
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings34.escapeMode(escapeMode91);
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings93.forceAllElementAsBlock(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertTrue("'" + escapeMode88 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode88.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertTrue("'" + escapeMode91 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode91.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertNotNull(outputSettings93);
        org.junit.Assert.assertNotNull(outputSettings95);
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.prettyPrint(false);
        int int17 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings11.escapeMode(escapeMode22);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings8.charset(charset25);
        java.nio.charset.Charset charset27 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings8.clone();
        java.nio.charset.Charset charset29 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean36 = textNode34.hasAttr("#text");
        java.lang.String str37 = textNode34.text();
        java.lang.String str39 = textNode34.attr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount(10);
        boolean boolean43 = outputSettings42.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount(10);
        java.nio.charset.Charset charset47 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings42.charset(charset47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings48.clone();
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        boolean boolean51 = outputSettings48.prettyPrint();
        boolean boolean52 = textNode34.equals((java.lang.Object) outputSettings48);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.indentAmount(100);
        boolean boolean55 = outputSettings48.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings48.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings48.forceAllElementAsBlock(false);
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings31.escapeMode(escapeMode61);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#text" + "'", str37, "#text");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        java.lang.String str14 = textNode12.outerHtml();
        java.lang.String str15 = textNode12.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.siblingNodes();
        boolean boolean18 = textNode9.equals((java.lang.Object) nodeList17);
        java.lang.String str19 = textNode9.nodeName();
        org.jsoup.nodes.Node node20 = textNode9.nextSibling();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str24 = textNode23.outerHtml();
        java.lang.String str25 = textNode23.toString();
        org.jsoup.nodes.Node node26 = textNode23.clone();
        java.lang.String str27 = textNode23.text();
        boolean boolean28 = textNode23.isBlank();
        org.jsoup.nodes.TextNode textNode30 = textNode23.splitText(0);
        org.jsoup.nodes.Node node31 = textNode23.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode9.replaceWith(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#text" + "'", str27, "#text");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        int int3 = outputSettings2.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings4.prettyPrint(false);
        int int10 = outputSettings4.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings4.escapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings2.escapeMode(escapeMode15);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        boolean boolean19 = outputSettings17.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test21605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21605");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode11.toString();
        java.lang.String str13 = textNode11.getWholeText();
        org.jsoup.nodes.Node node14 = textNode11.nextSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode11.splitText((int) (short) 1);
        java.lang.String str17 = textNode11.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
    }

    @Test
    public void test21606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21606");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        int int10 = textNode9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode9.attr("", "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test21607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21607");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode6.attr("#text", "");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node20 = textNode19.clone();
        boolean boolean21 = textNode6.equals((java.lang.Object) textNode19);
        org.jsoup.nodes.Attributes attributes22 = textNode6.attributes();
        org.jsoup.nodes.Node node23 = textNode6.parent();
        org.jsoup.nodes.TextNode textNode25 = textNode6.text("#text");
        org.jsoup.nodes.Attributes attributes26 = textNode25.attributes();
        java.lang.String str27 = textNode25.getWholeText();
        java.lang.String str29 = textNode25.attr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode25.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode25.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#text" + "'", str27, "#text");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#text" + "'", str29, "#text");
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test21608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21608");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.toString();
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test21609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21609");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        org.jsoup.nodes.Document document10 = node9.ownerDocument();
        int int11 = node9.siblingIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test21610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21610");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount(10);
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode17);
        boolean boolean19 = textNode5.equals((java.lang.Object) escapeMode17);
        java.lang.String str21 = textNode5.attr("hi!");
        java.lang.String str22 = textNode5.getWholeText();
        boolean boolean24 = textNode5.hasAttr("hi!");
        java.lang.String str25 = textNode5.nodeName();
        org.jsoup.nodes.Node node26 = textNode5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node26.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#text" + "'", str22, "#text");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test21611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21611");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        boolean boolean16 = textNode14.isBlank();
        org.jsoup.nodes.Node node18 = textNode14.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean23 = textNode21.hasAttr("");
        org.jsoup.nodes.TextNode textNode25 = textNode21.text("");
        java.lang.String str26 = textNode21.text();
        boolean boolean28 = textNode21.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode30 = textNode21.text("#text");
        java.lang.String str31 = textNode30.toString();
        org.jsoup.nodes.TextNode textNode33 = textNode30.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode30.siblingNodes();
        boolean boolean35 = textNode30.isBlank();
        boolean boolean36 = textNode14.equals((java.lang.Object) boolean35);
        org.jsoup.nodes.Node node37 = textNode14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = textNode2.before(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#text" + "'", str31, "#text");
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test21612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21612");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("hi!");
        java.lang.String str12 = textNode8.attr("hi!");
        java.lang.String str14 = textNode8.attr("#text");
        int int15 = textNode8.siblingIndex();
        org.jsoup.nodes.Document document16 = textNode8.ownerDocument();
        org.jsoup.nodes.Document document17 = textNode8.ownerDocument();
        java.lang.String str18 = textNode8.text();
        java.lang.String str19 = textNode8.text();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode8);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node22 = textNode2.clone();
        org.jsoup.nodes.Node node23 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("h", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.childNodes();
        java.lang.String str28 = textNode26.getWholeText();
        boolean boolean29 = textNode2.equals((java.lang.Object) textNode26);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test21613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21613");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.lang.String str13 = textNode12.toString();
        org.jsoup.nodes.TextNode textNode15 = textNode12.text("i!");
        java.lang.String str16 = textNode15.text();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "i!" + "'", str16, "i!");
    }

    @Test
    public void test21614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21614");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str16 = textNode2.attr("");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        java.lang.Class<?> wildcardClass18 = node17.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21615");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        boolean boolean11 = textNode2.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21616");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str17 = textNode16.text();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode16.childNodes();
        java.lang.String str19 = textNode16.toString();
        java.lang.String str20 = textNode16.nodeName();
        java.lang.String str21 = textNode16.toString();
        org.jsoup.nodes.TextNode textNode23 = textNode16.text("hi!");
        org.jsoup.nodes.Node node26 = textNode23.attr("#text", "hi!");
        java.lang.String str27 = textNode23.toString();
        boolean boolean28 = textNode2.equals((java.lang.Object) str27);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test21617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21617");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.lang.String str13 = textNode12.baseUri();
        org.jsoup.nodes.TextNode textNode15 = textNode12.text("text");
        java.lang.String str16 = textNode15.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "text" + "'", str16, "text");
    }

    @Test
    public void test21618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21618");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        java.lang.Class<?> wildcardClass10 = textNode9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21619");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset13 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings5.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(10);
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.charset(charset36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings25.charset(charset36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings24.charset(charset36);
        int int40 = outputSettings39.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount(10);
        boolean boolean44 = outputSettings43.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings43.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings49.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings39.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings14.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings14.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings14.indentAmount(0);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings58);
    }

    @Test
    public void test21620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21620");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        boolean boolean8 = outputSettings2.prettyPrint();
        java.nio.charset.Charset charset9 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings10.escapeMode(escapeMode22);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node28 = textNode27.clone();
        org.jsoup.nodes.Node node29 = textNode27.nextSibling();
        java.lang.String str30 = textNode27.baseUri();
        org.jsoup.nodes.TextNode textNode32 = textNode27.text("");
        boolean boolean33 = textNode27.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings34.prettyPrint(false);
        int int40 = outputSettings34.indentAmount();
        boolean boolean41 = textNode27.equals((java.lang.Object) outputSettings34);
        java.nio.charset.Charset charset42 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings34.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings34.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount(10);
        java.nio.charset.Charset charset50 = outputSettings47.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount(10);
        boolean boolean54 = outputSettings53.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(10);
        java.nio.charset.Charset charset58 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings53.charset(charset58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings47.charset(charset58);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount(10);
        boolean boolean64 = outputSettings63.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings47.escapeMode(escapeMode65);
        int int67 = outputSettings66.indentAmount();
        java.nio.charset.Charset charset68 = outputSettings66.charset();
        java.nio.charset.Charset charset69 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings46.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings10.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings74.indentAmount(10);
        boolean boolean77 = outputSettings76.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode78 = outputSettings76.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings79.indentAmount(10);
        boolean boolean82 = outputSettings81.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings81.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings76.escapeMode(escapeMode83);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings84.prettyPrint(false);
        boolean boolean87 = outputSettings86.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = outputSettings86.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings71.escapeMode(escapeMode88);
        boolean boolean90 = outputSettings71.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings71.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings91.indentAmount((int) (short) 100);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + escapeMode78 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode78.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + escapeMode88 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode88.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(outputSettings93);
    }

    @Test
    public void test21621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21621");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test21622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21622");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test21623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21623");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#text");
        textNode2.setBaseUri("#text");
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str14 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test21624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21624");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        java.nio.charset.Charset charset11 = outputSettings10.charset();
        boolean boolean12 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings27.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount(10);
        boolean boolean42 = outputSettings41.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount(10);
        java.nio.charset.Charset charset46 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings41.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings34.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings24.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings23.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings10.charset(charset46);
        java.nio.charset.Charset charset53 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.prettyPrint(true);
        boolean boolean58 = outputSettings57.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings59.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.forceAllElementAsBlock(true);
        int int66 = outputSettings65.indentAmount();
        java.nio.charset.Charset charset67 = outputSettings65.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings57.charset(charset67);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings10.charset(charset67);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings69.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings69.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings69.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings73.indentAmount((int) (short) 0);
        java.nio.charset.Charset charset76 = outputSettings75.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(charset76);
    }

    @Test
    public void test21625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21625");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.prettyPrint(true);
        boolean boolean14 = outputSettings13.prettyPrint();
        boolean boolean15 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings13.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test21626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21626");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(false);
        int int19 = outputSettings13.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings13.escapeMode(escapeMode24);
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        boolean boolean33 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings32.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings28.escapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(10);
        java.nio.charset.Charset charset45 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount(10);
        boolean boolean49 = outputSettings48.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount(10);
        java.nio.charset.Charset charset53 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.charset(charset53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings42.charset(charset53);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.indentAmount(10);
        boolean boolean59 = outputSettings58.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings42.escapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(10);
        boolean boolean65 = outputSettings64.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings64.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings67.indentAmount(10);
        boolean boolean70 = outputSettings69.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings69.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings64.escapeMode(escapeMode71);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings42.escapeMode(escapeMode71);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings74.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.indentAmount(10);
        boolean boolean80 = outputSettings79.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings74.escapeMode(escapeMode81);
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings82.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings42.escapeMode(escapeMode83);
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings41.escapeMode(escapeMode83);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings25.escapeMode(escapeMode83);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings8.escapeMode(escapeMode83);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings87.prettyPrint(false);
        int int90 = outputSettings89.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode91 = outputSettings89.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings89.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings94 = outputSettings89.charset("#");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode91 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode91.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings92);
    }

    @Test
    public void test21627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21627");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        java.lang.String str13 = textNode9.attr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode9.text("hi!");
        java.lang.String str16 = textNode9.getWholeText();
        java.lang.String str17 = textNode9.text();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.siblingNodes();
        org.jsoup.nodes.Document document19 = textNode9.ownerDocument();
        java.lang.String str20 = textNode9.nodeName();
        boolean boolean21 = textNode2.equals((java.lang.Object) str20);
        org.jsoup.nodes.Node node24 = textNode2.attr("text", "");
        java.lang.String str25 = node24.outerHtml();
        org.jsoup.nodes.Node node26 = node24.parent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test21628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21628");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node6 = textNode5.clone();
        org.jsoup.nodes.Node node8 = textNode5.removeAttr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.childNodes();
        org.jsoup.nodes.Node node10 = textNode5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test21629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21629");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings0.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings0.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode42.siblingNodes();
        org.jsoup.nodes.Node node44 = textNode42.clone();
        java.lang.String str45 = textNode42.nodeName();
        org.jsoup.nodes.Document document46 = textNode42.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        boolean boolean51 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings50.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(10);
        java.nio.charset.Charset charset61 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(10);
        boolean boolean65 = outputSettings64.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount(10);
        java.nio.charset.Charset charset69 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings64.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings58.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings57.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings47.charset(charset69);
        boolean boolean74 = textNode42.equals((java.lang.Object) outputSettings47);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount(10);
        boolean boolean78 = outputSettings77.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings79.indentAmount(10);
        java.nio.charset.Charset charset82 = outputSettings79.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings77.charset(charset82);
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings83.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings83.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings83.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings87.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings89.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode92 = outputSettings91.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings47.escapeMode(escapeMode92);
        java.nio.charset.Charset charset94 = outputSettings93.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings39.charset(charset94);
        org.jsoup.nodes.Document.OutputSettings outputSettings97 = outputSettings95.prettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#text" + "'", str45, "#text");
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertTrue("'" + escapeMode92 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode92.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings93);
        org.junit.Assert.assertNotNull(charset94);
        org.junit.Assert.assertNotNull(outputSettings95);
        org.junit.Assert.assertNotNull(outputSettings97);
    }

    @Test
    public void test21630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21630");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node8 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test21631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21631");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test21632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21632");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test21633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21633");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.absUrl("i!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test21634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21634");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        textNode6.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("#text");
        org.jsoup.nodes.Node node17 = textNode16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test21635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21635");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.lang.String str12 = textNode11.text();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test21636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21636");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node10 = textNode6.removeAttr("hi!");
        java.lang.String str11 = textNode6.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings14.charset(charset19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(0);
        boolean boolean25 = textNode6.equals((java.lang.Object) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode6.siblingNodes();
        java.lang.String str27 = textNode6.nodeName();
        java.lang.String str28 = textNode6.outerHtml();
        boolean boolean29 = textNode6.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode6.childNodes();
        java.lang.String str31 = textNode6.toString();
        java.lang.String str33 = textNode6.absUrl("text");
        java.lang.String str35 = textNode6.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#text" + "'", str27, "#text");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test21637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21637");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        textNode2.setBaseUri("");
        boolean boolean10 = textNode2.hasAttr("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 1);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test21638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21638");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str10 = textNode8.absUrl("hi!");
        java.lang.String str12 = textNode8.absUrl("hi!");
        org.jsoup.nodes.Node node14 = textNode8.removeAttr("#");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test21639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21639");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean9 = textNode2.hasAttr("h");
        java.lang.String str10 = textNode2.nodeName();
        int int11 = textNode2.siblingIndex();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test21640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21640");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test21641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21641");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.indentAmount(1);
        boolean boolean15 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount(10);
        java.nio.charset.Charset charset27 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings22.charset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset27);
        java.nio.charset.Charset charset30 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings10.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(false);
        boolean boolean34 = node9.equals((java.lang.Object) outputSettings31);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset40 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings35.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings35.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount((int) '#');
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test21642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21642");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.baseUri();
        java.lang.String str11 = textNode8.outerHtml();
        org.jsoup.nodes.Attributes attributes12 = textNode8.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test21643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21643");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        textNode6.setBaseUri("#text");
        textNode6.setBaseUri("#text");
        java.lang.String str18 = textNode6.attr("#text");
        java.lang.String str19 = textNode6.toString();
        org.jsoup.nodes.Node node21 = textNode6.removeAttr("i!");
        // The following exception was thrown during execution in test generation
        try {
            textNode6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test21644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21644");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount(10);
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode17);
        boolean boolean19 = textNode5.equals((java.lang.Object) escapeMode17);
        java.lang.String str21 = textNode5.attr("hi!");
        org.jsoup.nodes.Node node22 = textNode5.nextSibling();
        org.jsoup.nodes.Node node24 = textNode5.removeAttr("h");
        java.lang.String str25 = textNode5.text();
        org.jsoup.nodes.Attributes attributes26 = textNode5.attributes();
        java.lang.Class<?> wildcardClass27 = attributes26.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test21645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21645");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Document document9 = textNode8.ownerDocument();
        boolean boolean11 = textNode8.hasAttr("#text");
        java.lang.String str12 = textNode8.getWholeText();
        org.jsoup.nodes.Document document13 = textNode8.ownerDocument();
        org.jsoup.nodes.Attributes attributes14 = textNode8.attributes();
        org.jsoup.nodes.TextNode textNode16 = textNode8.text("#");
        java.lang.String str17 = textNode8.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
    }

    @Test
    public void test21646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21646");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test21647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21647");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.prettyPrint(true);
        java.nio.charset.Charset charset18 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings8.charset(charset18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings22.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings8.escapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings8.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.clone();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings37);
    }

    @Test
    public void test21648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21648");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode6.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test21649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21649");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings4.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings4.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        java.nio.charset.Charset charset23 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount(10);
        boolean boolean27 = outputSettings26.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(10);
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings26.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings20.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        boolean boolean37 = outputSettings36.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount(10);
        java.nio.charset.Charset charset41 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings36.charset(charset41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings42.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings33.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings19.escapeMode(escapeMode45);
        boolean boolean48 = textNode2.equals((java.lang.Object) outputSettings47);
        int int49 = textNode2.siblingIndex();
        java.lang.String str51 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = textNode2.before(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test21650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21650");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test21651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21651");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = textNode2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test21652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21652");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str8 = textNode2.attr("h");
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test21653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21653");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.escapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) ' ');
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        boolean boolean20 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.indentAmount(10);
        boolean boolean36 = outputSettings35.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings35.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings35.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount(10);
        java.nio.charset.Charset charset46 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount(10);
        boolean boolean50 = outputSettings49.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount(10);
        java.nio.charset.Charset charset54 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings49.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings43.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings42.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings32.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings31.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings18.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings5.charset(charset54);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings61.clone();
        boolean boolean63 = outputSettings62.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings62.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test21654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21654");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode8.childNodes();
        org.jsoup.nodes.Node node14 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean19 = textNode17.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode17.childNodes();
        org.jsoup.nodes.Document document21 = textNode17.ownerDocument();
        java.lang.String str22 = textNode17.baseUri();
        java.lang.String str23 = textNode17.baseUri();
        org.jsoup.nodes.Attributes attributes24 = textNode17.attributes();
        org.jsoup.nodes.Attributes attributes25 = textNode17.attributes();
        org.jsoup.nodes.Document document26 = textNode17.ownerDocument();
        textNode17.setBaseUri("");
        java.lang.String str29 = textNode17.text();
        org.jsoup.nodes.TextNode textNode31 = textNode17.text("h");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = node14.equals((java.lang.Object) textNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(textNode31);
    }

    @Test
    public void test21655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21655");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.attr("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        boolean boolean12 = textNode2.hasAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test21656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21656");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        boolean boolean8 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        boolean boolean13 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings12.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.indentAmount(1);
        boolean boolean28 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings23.forceAllElementAsBlock(false);
        int int31 = outputSettings23.indentAmount();
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean36 = textNode34.hasAttr("#text");
        java.lang.String str37 = textNode34.text();
        java.lang.String str39 = textNode34.attr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount(10);
        boolean boolean43 = outputSettings42.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount(10);
        java.nio.charset.Charset charset47 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings42.charset(charset47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings48.clone();
        java.nio.charset.Charset charset50 = outputSettings48.charset();
        boolean boolean51 = outputSettings48.prettyPrint();
        boolean boolean52 = textNode34.equals((java.lang.Object) outputSettings48);
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings23.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings22.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings9.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings9.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings9.escapeMode();
        org.jsoup.nodes.TextNode textNode61 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str62 = textNode61.text();
        java.lang.String str63 = textNode61.nodeName();
        boolean boolean65 = textNode61.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode67 = textNode61.text("i!");
        org.jsoup.nodes.TextNode textNode69 = textNode67.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset71 = outputSettings70.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings70.prettyPrint(true);
        boolean boolean74 = outputSettings73.prettyPrint();
        boolean boolean75 = outputSettings73.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings73.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings73.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings79.escapeMode();
        boolean boolean81 = textNode69.equals((java.lang.Object) outputSettings79);
        org.jsoup.nodes.Entities.EscapeMode escapeMode82 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings9.escapeMode(escapeMode82);
        int int84 = outputSettings83.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#text" + "'", str37, "#text");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "#text" + "'", str63, "#text");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(textNode67);
        org.junit.Assert.assertNotNull(textNode69);
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + escapeMode82 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode82.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
    }

    @Test
    public void test21657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21657");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test21658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21658");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        boolean boolean11 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings8.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.forceAllElementAsBlock(false);
        boolean boolean20 = outputSettings19.forceAllElementAsBlock();
        java.nio.charset.Charset charset21 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings8.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.indentAmount((int) (byte) 10);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
    }

    @Test
    public void test21659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21659");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        boolean boolean13 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings7.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(false);
        boolean boolean18 = textNode2.equals((java.lang.Object) outputSettings15);
        org.jsoup.nodes.Node node19 = textNode2.clone();
        boolean boolean21 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("hi!");
        org.jsoup.nodes.Node node24 = textNode23.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node24.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test21660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21660");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(true);
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset30 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset33 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings19.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings19.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings39.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings39.forceAllElementAsBlock(false);
        boolean boolean43 = outputSettings39.prettyPrint();
        int int44 = outputSettings39.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings45.prettyPrint(false);
        boolean boolean51 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) ' ');
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings53.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings53.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings53.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings62.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings39.escapeMode(escapeMode65);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
    }

    @Test
    public void test21661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21661");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.escapeMode(escapeMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset15 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.charset(charset15);
        int int17 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.prettyPrint(true);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.forceAllElementAsBlock(true);
        int int29 = outputSettings28.indentAmount();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings20.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings16.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings34.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount(10);
        boolean boolean39 = outputSettings38.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings38.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset44 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        boolean boolean48 = outputSettings47.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings47.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings47.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings38.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings38.clone();
        boolean boolean56 = outputSettings55.forceAllElementAsBlock();
        java.nio.charset.Charset charset57 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings35.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(35);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
    }

    @Test
    public void test21662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21662");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings0.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        java.nio.charset.Charset charset17 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings20.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings14.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings13.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings0.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings35.prettyPrint(false);
        java.nio.charset.Charset charset40 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings29.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings29.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings29.indentAmount(97);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings29.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test21663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21663");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test21664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21664");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test21665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21665");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str17 = textNode15.attr("#text");
        java.lang.String str19 = textNode15.attr("hi!");
        boolean boolean21 = textNode15.hasAttr("hi!");
        textNode15.setBaseUri("#text");
        org.jsoup.nodes.Node node24 = textNode15.parent();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test21666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21666");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        java.lang.String str14 = textNode11.attr("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        org.jsoup.nodes.Document document18 = textNode2.ownerDocument();
        java.lang.String str20 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document21 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("#text");
        org.jsoup.nodes.Node node24 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test21667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21667");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str13 = textNode2.attr("");
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.getWholeText();
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "hi!");
        java.lang.String str21 = textNode2.attr("i!");
        java.lang.String str22 = textNode2.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test21668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21668");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.Object obj8 = null;
        boolean boolean9 = textNode2.equals(obj8);
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str12 = textNode2.attr("hi!");
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str15 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test21669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21669");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset8 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings2.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings2.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings2.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test21670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21670");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node6 = textNode4.removeAttr("#text");
        org.jsoup.nodes.Document document7 = textNode4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode4.clone();
        java.lang.String str10 = textNode4.baseUri();
        org.jsoup.nodes.Node node11 = textNode4.parent();
        boolean boolean12 = textNode4.isBlank();
        boolean boolean13 = textNode4.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode4.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21671");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        int int9 = outputSettings8.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount((int) (short) 0);
        int int12 = outputSettings8.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test21672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21672");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str11 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str13 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test21673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21673");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        boolean boolean23 = outputSettings22.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(true);
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset30 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset33 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings25.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings19.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.prettyPrint(false);
        int int38 = outputSettings35.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.indentAmount(10);
        boolean boolean42 = outputSettings41.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings41.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings44.clone();
        java.nio.charset.Charset charset46 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings35.charset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings35.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount(10);
        java.nio.charset.Charset charset53 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings50.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(10);
        boolean boolean61 = outputSettings60.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(10);
        java.nio.charset.Charset charset65 = outputSettings62.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings60.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings57.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings68.indentAmount(10);
        java.nio.charset.Charset charset71 = outputSettings68.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings68.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings73.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset76 = outputSettings73.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings67.charset(charset76);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings35.charset(charset76);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(charset76);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(outputSettings78);
    }

    @Test
    public void test21674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21674");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.escapeMode(escapeMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.indentAmount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
    }

    @Test
    public void test21675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21675");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.escapeMode(escapeMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings2.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings15.escapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount((int) ' ');
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings14.charset(charset26);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Document document32 = textNode31.ownerDocument();
        boolean boolean34 = textNode31.hasAttr("");
        textNode31.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node41 = textNode39.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node41.childNodes();
        org.jsoup.nodes.Node node43 = node41.parent();
        boolean boolean44 = textNode31.equals((java.lang.Object) node43);
        boolean boolean46 = textNode31.hasAttr("hi!");
        java.lang.String str47 = textNode31.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings48.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings48.forceAllElementAsBlock(true);
        int int55 = outputSettings48.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings48.prettyPrint(false);
        boolean boolean58 = textNode31.equals((java.lang.Object) outputSettings48);
        java.nio.charset.Charset charset59 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings27.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings60.forceAllElementAsBlock(false);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#text" + "'", str47, "#text");
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
    }

    @Test
    public void test21676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21676");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test21677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21677");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Document document9 = textNode8.ownerDocument();
        java.lang.String str10 = textNode8.getWholeText();
        java.lang.String str11 = textNode8.text();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("#text", "#text");
        int int15 = textNode14.siblingIndex();
        textNode14.setBaseUri("hi!");
        java.lang.String str18 = textNode14.getWholeText();
        org.jsoup.nodes.Node node19 = textNode14.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode14.splitText(0);
        boolean boolean22 = textNode8.equals((java.lang.Object) textNode14);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21678");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean8 = textNode2.isBlank();
        boolean boolean10 = textNode2.hasAttr("text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test21679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21679");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test21680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21680");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.toString();
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node18 = textNode2.attr("h", "");
        java.lang.String str19 = textNode2.nodeName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
    }

    @Test
    public void test21681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21681");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str12 = textNode11.nodeName();
        java.lang.String str14 = textNode11.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test21682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21682");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount(10);
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings3.escapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) ' ');
        boolean boolean14 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        java.nio.charset.Charset charset18 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        boolean boolean22 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings15.escapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount(10);
        boolean boolean43 = outputSettings42.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings37.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings15.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings11.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings2.escapeMode(escapeMode44);
        boolean boolean49 = outputSettings2.forceAllElementAsBlock();
        java.nio.charset.Charset charset50 = outputSettings2.charset();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charset50);
    }

    @Test
    public void test21683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21683");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount(10);
        java.nio.charset.Charset charset14 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.prettyPrint(false);
        int int17 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings11.escapeMode(escapeMode22);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings8.charset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings8.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        java.lang.Class<?> wildcardClass31 = outputSettings29.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test21684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21684");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.absUrl("#text");
        java.lang.String str12 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        java.lang.String str18 = textNode15.getWholeText();
        boolean boolean19 = textNode15.isBlank();
        java.lang.String str20 = textNode15.getWholeText();
        boolean boolean22 = textNode15.hasAttr("");
        org.jsoup.nodes.Node node23 = textNode15.parent();
        org.jsoup.nodes.TextNode textNode25 = textNode15.text("");
        textNode15.setBaseUri("hi!");
        boolean boolean28 = textNode15.isBlank();
        org.jsoup.nodes.Node node29 = textNode15.nextSibling();
        java.lang.String str30 = textNode15.text();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode15.siblingNodes();
        boolean boolean32 = textNode2.equals((java.lang.Object) textNode15);
        org.jsoup.nodes.Node node33 = textNode2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test21685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21685");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.text();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test21686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21686");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str9 = textNode7.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node13 = textNode12.clone();
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        java.lang.String str15 = textNode12.baseUri();
        org.jsoup.nodes.TextNode textNode17 = textNode12.text("");
        boolean boolean18 = textNode12.isBlank();
        java.lang.String str20 = textNode12.attr("hi!");
        org.jsoup.nodes.Node node21 = textNode12.clone();
        boolean boolean22 = textNode7.equals((java.lang.Object) node21);
        org.jsoup.nodes.TextNode textNode24 = textNode7.text("");
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.siblingNodes();
        org.jsoup.nodes.TextNode textNode30 = textNode27.text("#text");
        java.lang.String str31 = textNode27.baseUri();
        boolean boolean32 = textNode7.equals((java.lang.Object) textNode27);
        org.jsoup.nodes.Attributes attributes33 = textNode27.attributes();
        java.lang.String str34 = textNode27.getWholeText();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#text" + "'", str34, "#text");
    }

    @Test
    public void test21687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21687");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        boolean boolean5 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test21688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21688");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.lang.String str12 = textNode8.absUrl("#text");
        org.jsoup.nodes.Node node13 = textNode8.previousSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode8.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test21689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21689");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode10.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test21690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21690");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node11 = textNode2.attr("#", "text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test21691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21691");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.attr("h", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test21692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21692");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        boolean boolean15 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.prettyPrint(true);
        int int18 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        boolean boolean22 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.escapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        boolean boolean28 = outputSettings27.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        boolean boolean33 = outputSettings32.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings27.escapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings17.escapeMode(escapeMode34);
        boolean boolean37 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings17.escapeMode();
        boolean boolean39 = textNode2.equals((java.lang.Object) escapeMode38);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node43 = textNode42.parent();
        java.lang.String str44 = textNode42.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        boolean boolean48 = outputSettings47.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount(10);
        boolean boolean53 = outputSettings52.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings47.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.prettyPrint(false);
        boolean boolean58 = textNode42.equals((java.lang.Object) outputSettings55);
        org.jsoup.nodes.Attributes attributes59 = textNode42.attributes();
        org.jsoup.nodes.Attributes attributes60 = textNode42.attributes();
        java.lang.String str62 = textNode42.attr("hi!");
        org.jsoup.nodes.Node node63 = textNode42.previousSibling();
        org.jsoup.nodes.TextNode textNode65 = textNode42.text("");
        org.jsoup.nodes.Attributes attributes66 = textNode65.attributes();
        org.jsoup.nodes.Document document67 = textNode65.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node68 = textNode2.before((org.jsoup.nodes.Node) textNode65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(textNode65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNull(document67);
    }

    @Test
    public void test21693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21693");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "h");
        java.lang.String str11 = textNode2.attr("i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test21694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21694");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings17.escapeMode();
        int int21 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
    }

    @Test
    public void test21695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21695");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }
}

