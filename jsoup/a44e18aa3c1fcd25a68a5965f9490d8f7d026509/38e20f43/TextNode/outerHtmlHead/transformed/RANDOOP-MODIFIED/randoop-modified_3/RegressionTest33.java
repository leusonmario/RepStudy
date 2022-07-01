import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#");
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("text");
        org.jsoup.nodes.Document document22 = node21.ownerDocument();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#text");
        boolean boolean20 = textNode18.hasAttr("hi!");
        java.lang.String str22 = textNode18.attr("#");
        org.jsoup.nodes.TextNode textNode24 = textNode18.text("#text");
        org.jsoup.nodes.Node node25 = textNode24.clone();
        textNode24.setBaseUri("");
        textNode24.settext("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        textNode2.outerHtmlTail(stringBuilder16, (int) (byte) 100, outputSettings18);
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings18.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        outputSettings23.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings23.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings23.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.clone();
        boolean boolean30 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode;
        java.nio.charset.Charset charset34 = outputSettings31.charset;
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings31.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.indentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings37.charsetEncoder;
        outputSettings23.charsetEncoder = charsetEncoder38;
        outputSettings18.setcharsetEncoder(charsetEncoder38);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings18.escapeMode;
        int int42 = outputSettings18.indentAmount;
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings2.clone();
        boolean boolean4 = outputSettings3.getprettyPrint();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = null;
        outputSettings13.escapeMode = escapeMode14;
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        textNode7.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings13.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings13.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        outputSettings22.escapeMode = escapeMode25;
        outputSettings20.setescapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        outputSettings28.prettyPrint = false;
        java.nio.charset.Charset charset32 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings20.charset(charset32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        outputSettings13.setescapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode;
        outputSettings41.escapeMode = escapeMode44;
        outputSettings39.setescapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        outputSettings47.prettyPrint = false;
        java.nio.charset.Charset charset51 = outputSettings47.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings39.charset(charset51);
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings36.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings13.escapeMode(escapeMode53);
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings13.escapeMode;
        outputSettings3.setescapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings3.prettyPrint(false);
        outputSettings3.indentAmount = 'a';
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings3.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings64.prettyPrint(true);
        java.nio.charset.Charset charset67 = outputSettings66.charset;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charset67);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.text = "#text";
        java.lang.String str11 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "hi!");
        java.lang.String str15 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        int int13 = node11.childNodeSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode;
        outputSettings9.escapeMode = escapeMode12;
        outputSettings7.setescapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        outputSettings15.prettyPrint = false;
        java.nio.charset.Charset charset19 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings7.charset(charset19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings7.prettyPrint(false);
        outputSettings22.setindentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        boolean boolean28 = textNode2.equals((java.lang.Object) outputSettings26);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.text;
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str17 = textNode16.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings26.escapeMode;
        outputSettings25.escapeMode = escapeMode28;
        outputSettings23.setescapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        outputSettings31.prettyPrint = false;
        java.nio.charset.Charset charset35 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings23.charset(charset35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings20.escapeMode(escapeMode37);
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode41.setBaseUri("hi!");
        org.jsoup.nodes.Node node44 = textNode41.parent();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = null;
        outputSettings47.escapeMode = escapeMode48;
        java.nio.charset.Charset charset50 = outputSettings47.charset();
        textNode41.outerHtmlTail(stringBuilder45, 10, outputSettings47);
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings47.getcharsetEncoder();
        outputSettings38.charsetEncoder = charsetEncoder52;
        textNode16.outerHtmlTail(stringBuilder18, (int) (byte) 0, outputSettings38);
        java.lang.String str55 = textNode16.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = textNode16.childNodesCopy();
        java.lang.StringBuilder stringBuilder57 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings60.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings66.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings66.escapeMode;
        outputSettings65.escapeMode = escapeMode68;
        outputSettings63.setescapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode();
        outputSettings71.prettyPrint = false;
        java.nio.charset.Charset charset75 = outputSettings71.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings63.charset(charset75);
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings76.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings60.escapeMode(escapeMode77);
        boolean boolean79 = outputSettings60.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder80 = outputSettings60.getcharsetEncoder();
        outputSettings59.charsetEncoder = charsetEncoder80;
        java.nio.charset.CharsetEncoder charsetEncoder82 = outputSettings59.encoder();
        boolean boolean83 = outputSettings59.prettyPrint;
        int int84 = outputSettings59.indentAmount;
        textNode16.outerHtmlTail(stringBuilder57, (int) (short) 1, outputSettings59);
        boolean boolean86 = textNode16.isBlank();
        org.jsoup.nodes.TextNode textNode88 = textNode16.text("hi!");
        int int89 = textNode88.siblingIndex();
        int int90 = textNode88.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node91 = textNode2.after((org.jsoup.nodes.Node) textNode88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "text" + "'", str55, "text");
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(charsetEncoder80);
        org.junit.Assert.assertNotNull(charsetEncoder82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(textNode88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = null;
        outputSettings7.escapeMode = escapeMode8;
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        boolean boolean11 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings7.getescapeMode();
        outputSettings7.setindentAmount((int) (short) 1);
        java.nio.charset.Charset charset15 = outputSettings7.charset;
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings7.getcharsetEncoder();
        boolean boolean17 = textNode6.equals((java.lang.Object) outputSettings7);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = null;
        outputSettings18.escapeMode = escapeMode19;
        java.nio.charset.Charset charset21 = outputSettings18.charset;
        boolean boolean22 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings18.escapeMode;
        boolean boolean25 = outputSettings18.prettyPrint;
        outputSettings18.setprettyPrint(true);
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        outputSettings33.prettyPrint = false;
        textNode30.outerHtmlTail(stringBuilder31, (int) (byte) 100, outputSettings33);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.clone();
        outputSettings33.indentAmount = 'a';
        int int42 = outputSettings33.indentAmount();
        java.nio.charset.Charset charset43 = outputSettings33.charset;
        outputSettings18.setcharset(charset43);
        outputSettings7.setcharset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        outputSettings46.setindentAmount(0);
        java.nio.charset.Charset charset50 = outputSettings46.charset();
        java.nio.charset.Charset charset51 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings46.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        outputSettings54.setindentAmount(0);
        java.nio.charset.Charset charset58 = outputSettings54.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings54.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode;
        int int63 = outputSettings61.getindentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings61.escapeMode;
        outputSettings46.setescapeMode(escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings7.escapeMode(escapeMode64);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(escapeMode12);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(escapeMode23);
        org.junit.Assert.assertNull(escapeMode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings66);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        java.nio.charset.Charset charset8 = outputSettings0.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.indentAmount((int) (short) 10);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        outputSettings19.escapeMode = escapeMode20;
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        textNode13.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        java.nio.charset.CharsetEncoder charsetEncoder24 = outputSettings19.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings19.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings26.escapeMode = escapeMode27;
        java.nio.charset.Charset charset29 = outputSettings26.charset;
        int int30 = outputSettings26.indentAmount();
        java.nio.charset.Charset charset31 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings19.charset(charset31);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.indentAmount((int) '#');
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode38.setBaseUri("hi!");
        org.jsoup.nodes.Node node41 = textNode38.parent();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = null;
        outputSettings44.escapeMode = escapeMode45;
        java.nio.charset.Charset charset47 = outputSettings44.charset();
        textNode38.outerHtmlTail(stringBuilder42, 10, outputSettings44);
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings44.getcharsetEncoder();
        outputSettings44.indentAmount = '4';
        outputSettings44.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings44.charsetEncoder;
        outputSettings35.charsetEncoder = charsetEncoder54;
        outputSettings10.charsetEncoder = charsetEncoder54;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings10.indentAmount((int) '4');
        boolean boolean59 = outputSettings10.prettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charsetEncoder24);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNull(escapeMode33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str16 = textNode2.attr("#text");
        java.lang.String str17 = textNode2.outerHtml();
        org.jsoup.nodes.Node node18 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode21.setBaseUri("hi!");
        org.jsoup.nodes.Node node24 = textNode21.parent();
        java.lang.String str25 = textNode21.getWholeText();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        textNode21.outerHtmlTail(stringBuilder26, 100, outputSettings28);
        java.lang.String str30 = textNode21.getTEXT_KEY();
        java.lang.String str31 = textNode21.gettext();
        org.jsoup.nodes.Node node32 = textNode21.clone();
        java.lang.String str33 = textNode21.text;
        org.jsoup.nodes.Node node34 = textNode21.clone();
        java.lang.String str36 = textNode21.attr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "text" + "'", str30, "text");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        textNode7.outerHtmlTail(stringBuilder12, 100, outputSettings14);
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 0, outputSettings14);
        textNode2.text = "hi!";
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("text");
        java.lang.String str23 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode25 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode27 = textNode2.text("#text");
        int int28 = textNode27.siblingIndex();
        org.jsoup.nodes.Attributes attributes29 = textNode27.attributes();
        boolean boolean31 = textNode27.hasAttr("#text");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        int int5 = outputSettings0.getindentAmount();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        outputSettings0.escapeMode = escapeMode7;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode;
        outputSettings11.escapeMode = escapeMode14;
        outputSettings9.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        outputSettings17.prettyPrint = false;
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings9.escapeMode(escapeMode26);
        outputSettings0.escapeMode = escapeMode26;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.clone();
        outputSettings0.indentAmount = 0;
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings0.encoder();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charsetEncoder33);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        outputSettings15.setescapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        outputSettings23.prettyPrint = false;
        java.nio.charset.Charset charset27 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.charset(charset27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        outputSettings8.setescapeMode(escapeMode29);
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings8.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings8.indentAmount(52);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings8.indentAmount((int) '#');
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        outputSettings0.setprettyPrint(false);
        int int5 = outputSettings0.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        outputSettings0.prettyPrint = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset12 = outputSettings0.getcharset();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str13 = textNode2.text();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        outputSettings22.escapeMode = escapeMode25;
        outputSettings20.setescapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        outputSettings28.prettyPrint = false;
        java.nio.charset.Charset charset32 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings20.charset(charset32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings17.escapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings35.prettyPrint;
        boolean boolean39 = textNode2.equals((java.lang.Object) outputSettings35);
        org.jsoup.nodes.Attributes attributes40 = textNode2.attributes();
        java.lang.String str42 = textNode2.attr("#text");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        textNode7.outerHtmlTail(stringBuilder12, 100, outputSettings14);
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 0, outputSettings14);
        java.lang.String str17 = textNode2.getWholeText();
        java.lang.String str18 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        java.lang.String str21 = textNode2.text;
        java.lang.String str22 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.outerHtml();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        textNode2.outerHtmlTail(stringBuilder16, (int) (byte) 100, outputSettings18);
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings18.charsetEncoder;
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode25.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = textNode25.parent();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = null;
        outputSettings31.escapeMode = escapeMode32;
        java.nio.charset.Charset charset34 = outputSettings31.charset();
        textNode25.outerHtmlTail(stringBuilder29, 10, outputSettings31);
        int int36 = textNode25.siblingIndex();
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str40 = textNode39.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode;
        outputSettings48.escapeMode = escapeMode51;
        outputSettings46.setescapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        outputSettings54.prettyPrint = false;
        java.nio.charset.Charset charset58 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings46.charset(charset58);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings43.escapeMode(escapeMode60);
        org.jsoup.nodes.TextNode textNode64 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode64.setBaseUri("hi!");
        org.jsoup.nodes.Node node67 = textNode64.parent();
        java.lang.StringBuilder stringBuilder68 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = null;
        outputSettings70.escapeMode = escapeMode71;
        java.nio.charset.Charset charset73 = outputSettings70.charset();
        textNode64.outerHtmlTail(stringBuilder68, 10, outputSettings70);
        java.nio.charset.CharsetEncoder charsetEncoder75 = outputSettings70.getcharsetEncoder();
        outputSettings61.charsetEncoder = charsetEncoder75;
        textNode39.outerHtmlTail(stringBuilder41, (int) (byte) 0, outputSettings61);
        boolean boolean78 = textNode25.equals((java.lang.Object) outputSettings61);
        java.nio.charset.CharsetEncoder charsetEncoder79 = outputSettings61.encoder();
        outputSettings18.charsetEncoder = charsetEncoder79;
        outputSettings18.indentAmount = 52;
        java.nio.charset.Charset charset83 = outputSettings18.getcharset();
        outputSettings18.prettyPrint = false;
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "text" + "'", str40, "text");
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(charsetEncoder75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(charsetEncoder79);
        org.junit.Assert.assertNotNull(charset83);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings7.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode13);
        int int15 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode;
        outputSettings18.escapeMode = escapeMode21;
        outputSettings16.setescapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings16.indentAmount((int) (short) 0);
        java.nio.charset.Charset charset26 = outputSettings25.getcharset();
        java.nio.charset.Charset charset27 = outputSettings25.charset;
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings25.charsetEncoder;
        java.nio.charset.Charset charset29 = outputSettings25.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.charset(charset29);
        java.nio.charset.Charset charset31 = outputSettings0.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode;
        outputSettings34.escapeMode = escapeMode37;
        outputSettings32.setescapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings32.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings48.escapeMode;
        outputSettings47.escapeMode = escapeMode50;
        outputSettings45.setescapeMode(escapeMode50);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        outputSettings53.prettyPrint = false;
        java.nio.charset.Charset charset57 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings45.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings42.escapeMode(escapeMode59);
        boolean boolean61 = outputSettings42.prettyPrint();
        int int62 = outputSettings42.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings42.getcharsetEncoder();
        outputSettings41.setcharsetEncoder(charsetEncoder63);
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings41.getcharsetEncoder();
        java.nio.charset.Charset charset66 = outputSettings41.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings0.charset(charset66);
        java.nio.charset.CharsetEncoder charsetEncoder68 = outputSettings67.encoder();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder63);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(charsetEncoder68);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        textNode7.outerHtmlTail(stringBuilder12, 100, outputSettings14);
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 0, outputSettings14);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings14.escapeMode;
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode20.parent();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings26.escapeMode = escapeMode27;
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        textNode20.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        outputSettings26.prettyPrint = false;
        java.nio.charset.Charset charset33 = outputSettings26.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings26.escapeMode = escapeMode34;
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings26.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode;
        outputSettings39.escapeMode = escapeMode42;
        outputSettings37.setescapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings26.escapeMode(escapeMode42);
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.getescapeMode();
        outputSettings14.escapeMode = escapeMode46;
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings14.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings14.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode;
        outputSettings51.escapeMode = escapeMode54;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder57 = outputSettings56.encoder();
        outputSettings51.charsetEncoder = charsetEncoder57;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings59.getescapeMode();
        outputSettings51.escapeMode = escapeMode62;
        boolean boolean64 = outputSettings51.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings51.indentAmount((int) '4');
        boolean boolean67 = outputSettings66.prettyPrint;
        java.nio.charset.Charset charset68 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        outputSettings69.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings69.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings73.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings73.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings76.escapeMode();
        outputSettings76.setindentAmount(0);
        java.nio.charset.Charset charset80 = outputSettings76.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings73.charset(charset80);
        outputSettings66.charset = charset80;
        outputSettings50.setcharset(charset80);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder57);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset80);
        org.junit.Assert.assertNotNull(outputSettings81);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings1.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings6.escapeMode = escapeMode9;
        outputSettings4.setescapeMode(escapeMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        outputSettings12.prettyPrint = false;
        java.nio.charset.Charset charset16 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings4.charset(charset16);
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings1.escapeMode(escapeMode18);
        boolean boolean20 = outputSettings1.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings1.getcharsetEncoder();
        outputSettings0.charsetEncoder = charsetEncoder21;
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings0.encoder();
        boolean boolean24 = outputSettings0.prettyPrint;
        int int25 = outputSettings0.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode29.setBaseUri("hi!");
        org.jsoup.nodes.Node node32 = textNode29.parent();
        org.jsoup.nodes.Attributes attributes33 = textNode29.attributes();
        textNode29.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes36 = textNode29.attributes();
        java.lang.String str37 = textNode29.text;
        org.jsoup.nodes.Attributes attributes38 = textNode29.attributes();
        java.lang.String str39 = textNode29.nodeName();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode;
        outputSettings42.setprettyPrint(false);
        textNode29.outerHtmlTail(stringBuilder40, 52, outputSettings42);
        java.nio.charset.Charset charset48 = outputSettings42.charset;
        outputSettings0.charset = charset48;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings0.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings0.clone();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#text" + "'", str39, "#text");
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings52);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        int int6 = outputSettings4.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings4.charsetEncoder;
        outputSettings4.prettyPrint = true;
        boolean boolean10 = outputSettings4.prettyPrint;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        outputSettings8.prettyPrint = false;
        outputSettings8.indentAmount = 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode;
        outputSettings19.escapeMode = escapeMode22;
        outputSettings17.setescapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings17.indentAmount((int) (short) 0);
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode29.setBaseUri("hi!");
        org.jsoup.nodes.Node node32 = textNode29.parent();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = null;
        outputSettings35.escapeMode = escapeMode36;
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        textNode29.outerHtmlTail(stringBuilder33, 10, outputSettings35);
        outputSettings35.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        outputSettings42.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings42.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder47 = outputSettings42.getcharsetEncoder();
        outputSettings35.setcharsetEncoder(charsetEncoder47);
        outputSettings26.setcharsetEncoder(charsetEncoder47);
        java.nio.charset.Charset charset50 = outputSettings26.getcharset();
        outputSettings8.charset = charset50;
        boolean boolean52 = outputSettings8.prettyPrint;
        boolean boolean53 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = null;
        outputSettings54.escapeMode = escapeMode55;
        java.nio.charset.Charset charset57 = outputSettings54.charset;
        int int58 = outputSettings54.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings62.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings62.escapeMode;
        outputSettings61.escapeMode = escapeMode64;
        outputSettings59.setescapeMode(escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings67.escapeMode();
        outputSettings67.prettyPrint = false;
        java.nio.charset.Charset charset71 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings59.charset(charset71);
        java.nio.charset.Charset charset73 = outputSettings59.charset();
        outputSettings54.setcharset(charset73);
        java.nio.charset.Charset charset75 = outputSettings54.charset;
        outputSettings8.setcharset(charset75);
        boolean boolean77 = outputSettings8.prettyPrint();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(charsetEncoder47);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        outputSettings8.prettyPrint = true;
        java.nio.charset.Charset charset16 = outputSettings8.charset();
        outputSettings8.prettyPrint = true;
        outputSettings8.indentAmount = (short) 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        outputSettings21.setescapeMode(escapeMode26);
        java.nio.charset.Charset charset29 = outputSettings21.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings21.indentAmount((int) (short) 10);
        java.nio.charset.Charset charset32 = outputSettings21.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings8.charset(charset32);
        outputSettings8.prettyPrint = false;
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings33);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset8 = outputSettings0.getcharset();
        java.nio.charset.Charset charset9 = outputSettings0.charset();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        java.lang.String str12 = textNode10.baseUri();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        outputSettings6.setprettyPrint(false);
        int int11 = outputSettings6.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings6.escapeMode();
        outputSettings0.setescapeMode(escapeMode12);
        boolean boolean14 = outputSettings0.prettyPrint;
        boolean boolean15 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.indentAmount((int) (byte) 0);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings17.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        outputSettings19.escapeMode = escapeMode20;
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings19.charsetEncoder;
        java.nio.charset.Charset charset23 = outputSettings19.charset;
        boolean boolean24 = outputSettings19.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings26.encoder();
        java.nio.charset.Charset charset28 = outputSettings26.getcharset();
        outputSettings17.charset = charset28;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings17.prettyPrint(true);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings31);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.gettext();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        java.lang.String str18 = textNode2.getWholeText();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings2.encoder();
        java.nio.charset.Charset charset4 = outputSettings2.getcharset();
        java.nio.charset.Charset charset5 = outputSettings2.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str11 = textNode10.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode;
        outputSettings19.escapeMode = escapeMode22;
        outputSettings17.setescapeMode(escapeMode22);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        outputSettings25.prettyPrint = false;
        java.nio.charset.Charset charset29 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings17.charset(charset29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings14.escapeMode(escapeMode31);
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode35.setBaseUri("hi!");
        org.jsoup.nodes.Node node38 = textNode35.parent();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = null;
        outputSettings41.escapeMode = escapeMode42;
        java.nio.charset.Charset charset44 = outputSettings41.charset();
        textNode35.outerHtmlTail(stringBuilder39, 10, outputSettings41);
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings41.getcharsetEncoder();
        outputSettings32.charsetEncoder = charsetEncoder46;
        textNode10.outerHtmlTail(stringBuilder12, (int) (byte) 0, outputSettings32);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = null;
        outputSettings49.escapeMode = escapeMode50;
        java.nio.charset.Charset charset52 = outputSettings49.charset;
        int int53 = outputSettings49.indentAmount();
        java.nio.charset.Charset charset54 = outputSettings49.charset();
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings49.charsetEncoder;
        java.nio.charset.Charset charset56 = outputSettings49.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings32.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings61.escapeMode;
        outputSettings60.escapeMode = escapeMode63;
        outputSettings58.setescapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings66.escapeMode();
        outputSettings66.prettyPrint = false;
        java.nio.charset.Charset charset70 = outputSettings66.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings58.charset(charset70);
        java.nio.charset.Charset charset72 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings32.charset(charset72);
        outputSettings7.charset = charset72;
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings7.escapeMode;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        java.lang.String str14 = textNode10.getWholeText();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        textNode10.outerHtmlTail(stringBuilder15, 100, outputSettings17);
        org.jsoup.nodes.Node node20 = textNode10.removeAttr("hi!");
        java.lang.String str21 = textNode10.baseUri();
        int int22 = textNode10.childNodeSize();
        textNode10.ensureAttributes();
        org.jsoup.nodes.Document document24 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode26 = textNode10.text("#text");
        boolean boolean27 = textNode2.equals((java.lang.Object) textNode26);
        textNode26.settext("text");
        org.jsoup.nodes.Node node30 = textNode26.parent();
        java.lang.String str31 = textNode26.gettext();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "text" + "'", str31, "text");
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.toString();
        org.jsoup.nodes.Node node18 = textNode2.attr("text", "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings2.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.clone();
        int int6 = outputSettings3.indentAmount();
        java.nio.charset.Charset charset7 = outputSettings3.getcharset();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, (int) 'a', outputSettings8);
        textNode2.text = "text";
        textNode2.ensureAttributes();
        textNode2.settext("hi!");
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode27.setBaseUri("hi!");
        org.jsoup.nodes.Node node30 = textNode27.parent();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings33.escapeMode = escapeMode34;
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        textNode27.outerHtmlTail(stringBuilder31, 10, outputSettings33);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings33.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings33.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings33.escapeMode;
        java.nio.charset.Charset charset41 = outputSettings33.charset();
        textNode22.outerHtmlTail(stringBuilder23, (int) (byte) 1, outputSettings33);
        java.lang.String str43 = textNode22.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode22.childNodes();
        java.lang.String str45 = textNode22.text;
        java.lang.String str46 = textNode22.baseUri();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertNotNull(charsetEncoder39);
        org.junit.Assert.assertNull(escapeMode40);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode22.setBaseUri("hi!");
        org.jsoup.nodes.Node node25 = textNode22.parent();
        org.jsoup.nodes.Attributes attributes26 = textNode22.attributes();
        org.jsoup.nodes.TextNode textNode28 = textNode22.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode28.childNodes();
        org.jsoup.nodes.Node node30 = textNode28.nextSibling();
        boolean boolean31 = textNode2.equals((java.lang.Object) textNode28);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode34 = textNode2.text("t");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = textNode34.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(textNode34);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = null;
        outputSettings4.escapeMode = escapeMode5;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings4.charsetEncoder;
        boolean boolean8 = textNode2.equals((java.lang.Object) charsetEncoder7);
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("text");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.baseUri();
        boolean boolean16 = textNode2.isBlank();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode21.setBaseUri("hi!");
        org.jsoup.nodes.Node node24 = textNode21.parent();
        org.jsoup.nodes.Attributes attributes25 = textNode21.attributes();
        textNode21.setBaseUri("hi!");
        org.jsoup.nodes.Node node29 = textNode21.removeAttr("text");
        org.jsoup.nodes.Node node31 = textNode21.removeAttr("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.before((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "text" + "'", str13, "text");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode15.parent();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = null;
        outputSettings21.escapeMode = escapeMode22;
        java.nio.charset.Charset charset24 = outputSettings21.charset();
        textNode15.outerHtmlTail(stringBuilder19, 10, outputSettings21);
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings21.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings21.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode;
        outputSettings30.escapeMode = escapeMode33;
        outputSettings28.setescapeMode(escapeMode33);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        outputSettings36.prettyPrint = false;
        java.nio.charset.Charset charset40 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings28.charset(charset40);
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode();
        outputSettings21.setescapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode;
        outputSettings49.escapeMode = escapeMode52;
        outputSettings47.setescapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        outputSettings55.prettyPrint = false;
        java.nio.charset.Charset charset59 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings47.charset(charset59);
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings44.escapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings21.escapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = null;
        outputSettings64.escapeMode = escapeMode65;
        java.nio.charset.CharsetEncoder charsetEncoder67 = outputSettings64.charsetEncoder;
        java.nio.charset.Charset charset68 = outputSettings64.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings63.charset(charset68);
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.getescapeMode();
        boolean boolean71 = outputSettings69.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings69.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder11, 0, outputSettings72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charsetEncoder67);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(outputSettings72);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.text();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("text");
        java.lang.String str21 = textNode2.gettext();
        java.lang.String str22 = textNode2.getWholeText();
        textNode2.settext("i!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.text;
        java.lang.String str8 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "text" + "'", str8, "text");
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode;
        outputSettings20.escapeMode = escapeMode23;
        outputSettings18.setescapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        outputSettings26.prettyPrint = false;
        java.nio.charset.Charset charset30 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings18.charset(charset30);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode;
        outputSettings35.escapeMode = escapeMode38;
        outputSettings33.setescapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode();
        outputSettings41.prettyPrint = false;
        java.nio.charset.Charset charset45 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings33.charset(charset45);
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings31.escapeMode(escapeMode47);
        outputSettings15.escapeMode = escapeMode47;
        int int50 = outputSettings15.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        outputSettings51.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings51.escapeMode();
        outputSettings15.setescapeMode(escapeMode55);
        int int57 = outputSettings15.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings15.clone();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(outputSettings58);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        boolean boolean16 = outputSettings15.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode;
        textNode2.outerHtmlTail(stringBuilder10, (int) (short) 10, outputSettings15);
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings15.getcharsetEncoder();
        java.nio.charset.Charset charset20 = outputSettings15.charset;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(charset20);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode17.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = textNode17.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = null;
        outputSettings23.escapeMode = escapeMode24;
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        textNode17.outerHtmlTail(stringBuilder21, 10, outputSettings23);
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings23.getcharsetEncoder();
        boolean boolean29 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings30.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings30.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings23.escapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings36.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings39.escapeMode;
        outputSettings38.escapeMode = escapeMode41;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings36.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings35.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode;
        java.nio.charset.Charset charset48 = outputSettings45.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings45.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings45.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings55.escapeMode;
        outputSettings54.escapeMode = escapeMode57;
        outputSettings52.setescapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        outputSettings60.prettyPrint = false;
        java.nio.charset.Charset charset64 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings52.charset(charset64);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings52.prettyPrint(false);
        java.nio.charset.Charset charset68 = outputSettings52.getcharset();
        outputSettings45.setcharset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings45.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings72.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings72.escapeMode;
        outputSettings71.escapeMode = escapeMode74;
        outputSettings45.setescapeMode(escapeMode74);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings44.escapeMode(escapeMode74);
        outputSettings77.indentAmount = 32;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder13, (int) (byte) 1, outputSettings77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode74 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode74.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings77);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode14.setBaseUri("hi!");
        org.jsoup.nodes.Node node17 = textNode14.parent();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = null;
        outputSettings20.escapeMode = escapeMode21;
        java.nio.charset.Charset charset23 = outputSettings20.charset();
        textNode14.outerHtmlTail(stringBuilder18, 10, outputSettings20);
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings20.getcharsetEncoder();
        java.nio.charset.Charset charset26 = outputSettings20.getcharset();
        boolean boolean27 = outputSettings20.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        outputSettings20.setcharsetEncoder(charsetEncoder28);
        int int30 = outputSettings20.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings20.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings20.indentAmount((int) '#');
        outputSettings20.indentAmount = (byte) 100;
        boolean boolean37 = outputSettings20.prettyPrint;
        textNode2.outerHtmlTail(stringBuilder10, (int) '#', outputSettings20);
        org.jsoup.nodes.Document document39 = textNode2.ownerDocument();
        java.lang.String str40 = textNode2.text;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, (int) 'a', outputSettings8);
        textNode2.text = "text";
        textNode2.ensureAttributes();
        textNode2.settext("hi!");
        textNode2.ensureAttributes();
        java.lang.String str20 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodes();
        org.jsoup.nodes.Node node22 = textNode2.clone();
        java.lang.String str24 = textNode2.attr("");
        java.lang.String str26 = textNode2.attr("");
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        outputSettings29.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings29.charset;
        int int33 = outputSettings29.indentAmount();
        outputSettings29.prettyPrint = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings29.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings29.indentAmount((int) (byte) 1);
        int int39 = outputSettings38.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = null;
        outputSettings44.escapeMode = escapeMode45;
        java.nio.charset.Charset charset47 = outputSettings44.charset;
        int int48 = outputSettings44.indentAmount();
        boolean boolean49 = outputSettings44.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings44.encoder();
        outputSettings40.charsetEncoder = charsetEncoder50;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings38.escapeMode(escapeMode52);
        textNode2.outerHtmlTail(stringBuilder27, 1, outputSettings38);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(escapeMode36);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.charsetEncoder;
        java.nio.charset.Charset charset4 = outputSettings0.charset;
        boolean boolean5 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        outputSettings6.prettyPrint = false;
        java.nio.charset.Charset charset10 = outputSettings6.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.charset(charset10);
        java.nio.charset.Charset charset12 = outputSettings11.getcharset();
        java.nio.charset.Charset charset13 = outputSettings11.charset;
        outputSettings11.setindentAmount(0);
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings11.getcharsetEncoder();
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(charsetEncoder16);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        outputSettings5.escapeMode = escapeMode8;
        outputSettings3.setescapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        outputSettings11.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset15);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings0.escapeMode(escapeMode17);
        boolean boolean19 = outputSettings0.prettyPrint();
        int int20 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings0.charset;
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode;
        outputSettings31.escapeMode = escapeMode34;
        outputSettings29.setescapeMode(escapeMode34);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        outputSettings37.prettyPrint = false;
        java.nio.charset.Charset charset41 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings29.charset(charset41);
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings26.escapeMode(escapeMode43);
        org.jsoup.nodes.TextNode textNode47 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode47.setBaseUri("hi!");
        org.jsoup.nodes.Node node50 = textNode47.parent();
        java.lang.StringBuilder stringBuilder51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = null;
        outputSettings53.escapeMode = escapeMode54;
        java.nio.charset.Charset charset56 = outputSettings53.charset();
        textNode47.outerHtmlTail(stringBuilder51, 10, outputSettings53);
        java.nio.charset.CharsetEncoder charsetEncoder58 = outputSettings53.getcharsetEncoder();
        outputSettings44.charsetEncoder = charsetEncoder58;
        java.nio.charset.Charset charset60 = outputSettings44.charset;
        outputSettings0.charset = charset60;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings0.getescapeMode();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(charsetEncoder58);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean10 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.String str17 = textNode13.getWholeText();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        textNode13.outerHtmlTail(stringBuilder18, 100, outputSettings20);
        org.jsoup.nodes.Node node23 = textNode13.removeAttr("hi!");
        java.lang.String str24 = textNode13.baseUri();
        java.lang.String str25 = textNode13.getWholeText();
        org.jsoup.nodes.Node node28 = textNode13.attr("text", "");
        java.lang.String str29 = textNode13.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode13.childNodes();
        boolean boolean31 = textNode2.equals((java.lang.Object) textNode13);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode13.childNodes();
        boolean boolean33 = textNode13.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode13.childNodesCopy();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings37.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings39.clone();
        boolean boolean41 = outputSettings40.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder42 = outputSettings40.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(0);
        textNode13.outerHtmlTail(stringBuilder35, (int) (short) -1, outputSettings40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings40.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charsetEncoder42);
        org.junit.Assert.assertNotNull(outputSettings44);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.gettext();
        java.lang.String str10 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        int int5 = outputSettings0.getindentAmount();
        outputSettings0.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode;
        outputSettings14.escapeMode = escapeMode17;
        outputSettings12.setescapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        outputSettings20.prettyPrint = false;
        java.nio.charset.Charset charset24 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings12.charset(charset24);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings9.escapeMode(escapeMode26);
        boolean boolean28 = outputSettings9.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings9.getcharsetEncoder();
        outputSettings8.charsetEncoder = charsetEncoder29;
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings8.encoder();
        boolean boolean32 = outputSettings8.prettyPrint;
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode35.setBaseUri("hi!");
        org.jsoup.nodes.Node node38 = textNode35.parent();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = null;
        outputSettings41.escapeMode = escapeMode42;
        java.nio.charset.Charset charset44 = outputSettings41.charset();
        textNode35.outerHtmlTail(stringBuilder39, 10, outputSettings41);
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings41.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder47 = outputSettings41.charsetEncoder;
        java.nio.charset.Charset charset48 = outputSettings41.getcharset();
        outputSettings8.setcharset(charset48);
        java.nio.charset.Charset charset50 = outputSettings8.getcharset();
        outputSettings0.setcharset(charset50);
        int int52 = outputSettings0.getindentAmount();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(charsetEncoder47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        textNode8.ensureAttributes();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("#text");
        boolean boolean13 = textNode8.hasAttr("");
        textNode8.setBaseUri("");
        java.lang.String str17 = textNode8.attr("ext");
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode20.parent();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings26.escapeMode = escapeMode27;
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        textNode20.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        java.lang.String str31 = textNode20.text();
        textNode20.ensureAttributes();
        org.jsoup.nodes.Node node34 = textNode20.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode;
        outputSettings40.escapeMode = escapeMode43;
        outputSettings38.setescapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        outputSettings46.prettyPrint = false;
        java.nio.charset.Charset charset50 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings38.charset(charset50);
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings35.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount(10);
        boolean boolean56 = outputSettings53.prettyPrint;
        boolean boolean57 = textNode20.equals((java.lang.Object) outputSettings53);
        org.jsoup.nodes.Attributes attributes58 = textNode20.attributes();
        java.lang.String str60 = textNode20.attr("");
        java.lang.String str61 = textNode20.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            textNode8.replaceWith((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "text" + "'", str61, "text");
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.childNodes();
        java.lang.String str21 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.siblingNodes();
        boolean boolean23 = textNode2.isBlank();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        int int13 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "#text");
        java.lang.String str18 = textNode2.outerHtml();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        boolean boolean8 = outputSettings0.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode;
        outputSettings11.escapeMode = escapeMode14;
        outputSettings9.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        outputSettings17.prettyPrint = false;
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset21);
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode25.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = textNode25.parent();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = null;
        outputSettings31.escapeMode = escapeMode32;
        java.nio.charset.Charset charset34 = outputSettings31.charset();
        textNode25.outerHtmlTail(stringBuilder29, 10, outputSettings31);
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings31.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings31.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode;
        outputSettings40.escapeMode = escapeMode43;
        outputSettings38.setescapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        outputSettings46.prettyPrint = false;
        java.nio.charset.Charset charset50 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings38.charset(charset50);
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        outputSettings31.setescapeMode(escapeMode52);
        outputSettings22.setescapeMode(escapeMode52);
        outputSettings22.indentAmount = 10;
        int int57 = outputSettings22.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder58 = outputSettings22.charsetEncoder;
        outputSettings22.setindentAmount((int) (byte) 100);
        org.jsoup.nodes.TextNode textNode63 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode63.setBaseUri("hi!");
        org.jsoup.nodes.Node node66 = textNode63.parent();
        java.lang.StringBuilder stringBuilder67 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = null;
        outputSettings69.escapeMode = escapeMode70;
        java.nio.charset.Charset charset72 = outputSettings69.charset();
        textNode63.outerHtmlTail(stringBuilder67, 10, outputSettings69);
        java.nio.charset.CharsetEncoder charsetEncoder74 = outputSettings69.getcharsetEncoder();
        outputSettings69.indentAmount = '4';
        boolean boolean77 = outputSettings69.getprettyPrint();
        int int78 = outputSettings69.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings69.escapeMode();
        java.nio.charset.Charset charset80 = outputSettings69.getcharset();
        outputSettings22.setcharset(charset80);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings0.charset(charset80);
        int int83 = outputSettings82.indentAmount();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(charsetEncoder58);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertNotNull(charsetEncoder74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 52 + "'", int78 == 52);
        org.junit.Assert.assertNull(escapeMode79);
        org.junit.Assert.assertNotNull(charset80);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setprettyPrint(true);
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        int int6 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.clone();
        java.nio.charset.Charset charset8 = outputSettings0.charset;
        outputSettings0.prettyPrint = true;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode;
        outputSettings11.escapeMode = escapeMode14;
        outputSettings9.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        outputSettings17.prettyPrint = false;
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset21);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings6.escapeMode(escapeMode23);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode27.setBaseUri("hi!");
        org.jsoup.nodes.Node node30 = textNode27.parent();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings33.escapeMode = escapeMode34;
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        textNode27.outerHtmlTail(stringBuilder31, 10, outputSettings33);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings33.getcharsetEncoder();
        outputSettings24.charsetEncoder = charsetEncoder38;
        textNode2.outerHtmlTail(stringBuilder4, (int) (byte) 0, outputSettings24);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings24.prettyPrint(false);
        boolean boolean43 = outputSettings24.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode;
        outputSettings49.escapeMode = escapeMode52;
        outputSettings47.setescapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        outputSettings55.prettyPrint = false;
        java.nio.charset.Charset charset59 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings47.charset(charset59);
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings44.escapeMode(escapeMode61);
        org.jsoup.nodes.TextNode textNode65 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode65.setBaseUri("hi!");
        org.jsoup.nodes.Node node68 = textNode65.parent();
        java.lang.StringBuilder stringBuilder69 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = null;
        outputSettings71.escapeMode = escapeMode72;
        java.nio.charset.Charset charset74 = outputSettings71.charset();
        textNode65.outerHtmlTail(stringBuilder69, 10, outputSettings71);
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings71.getcharsetEncoder();
        outputSettings62.charsetEncoder = charsetEncoder76;
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings62.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = null;
        outputSettings80.escapeMode = escapeMode81;
        java.nio.charset.Charset charset83 = outputSettings80.charset;
        int int84 = outputSettings80.indentAmount();
        java.nio.charset.Charset charset85 = outputSettings80.charset();
        outputSettings62.setcharset(charset85);
        outputSettings24.setcharset(charset85);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings24.prettyPrint(true);
        boolean boolean90 = outputSettings24.prettyPrint;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertNotNull(charset83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(charset85);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.charsetEncoder;
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode11.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = textNode11.parent();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        outputSettings17.escapeMode = escapeMode18;
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        textNode11.outerHtmlTail(stringBuilder15, 10, outputSettings17);
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings17.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings17.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = null;
        outputSettings24.escapeMode = escapeMode25;
        java.nio.charset.Charset charset27 = outputSettings24.charset;
        int int28 = outputSettings24.indentAmount();
        java.nio.charset.Charset charset29 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings17.charset(charset29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings30.indentAmount((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode;
        outputSettings36.escapeMode = escapeMode39;
        outputSettings34.setescapeMode(escapeMode39);
        int int42 = outputSettings34.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings34.escapeMode;
        outputSettings30.setescapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings45.getcharsetEncoder();
        outputSettings30.charsetEncoder = charsetEncoder46;
        outputSettings0.setcharsetEncoder(charsetEncoder46);
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings0.escapeMode(escapeMode49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        outputSettings51.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings51.clone();
        java.nio.charset.Charset charset56 = outputSettings51.charset;
        boolean boolean57 = outputSettings51.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder58 = outputSettings51.encoder();
        outputSettings50.setcharsetEncoder(charsetEncoder58);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNull(escapeMode31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charsetEncoder58);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        outputSettings15.setescapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        outputSettings23.prettyPrint = false;
        java.nio.charset.Charset charset27 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.charset(charset27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        outputSettings8.setescapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode;
        outputSettings36.escapeMode = escapeMode39;
        outputSettings34.setescapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        outputSettings42.prettyPrint = false;
        java.nio.charset.Charset charset46 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings34.charset(charset46);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings31.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings8.escapeMode(escapeMode48);
        int int51 = outputSettings8.getindentAmount();
        java.nio.charset.Charset charset52 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = null;
        outputSettings53.escapeMode = escapeMode54;
        java.nio.charset.Charset charset56 = outputSettings53.charset;
        int int57 = outputSettings53.indentAmount();
        boolean boolean58 = outputSettings53.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder59 = outputSettings53.encoder();
        java.nio.charset.Charset charset60 = outputSettings53.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings61.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings61.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode68 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode68.setBaseUri("hi!");
        org.jsoup.nodes.Node node71 = textNode68.parent();
        java.lang.StringBuilder stringBuilder72 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = null;
        outputSettings74.escapeMode = escapeMode75;
        java.nio.charset.Charset charset77 = outputSettings74.charset();
        textNode68.outerHtmlTail(stringBuilder72, 10, outputSettings74);
        java.nio.charset.CharsetEncoder charsetEncoder79 = outputSettings74.getcharsetEncoder();
        outputSettings65.charsetEncoder = charsetEncoder79;
        outputSettings53.setcharsetEncoder(charsetEncoder79);
        java.nio.charset.Charset charset82 = outputSettings53.charset;
        java.nio.charset.Charset charset83 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings8.charset(charset83);
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings8.escapeMode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charsetEncoder59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(charsetEncoder79);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(charset83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, (int) 'a', outputSettings8);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        outputSettings16.prettyPrint = false;
        java.nio.charset.Charset charset20 = outputSettings16.charset();
        textNode2.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode23.childNodes();
        java.lang.String str25 = textNode23.toString();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        outputSettings28.escapeMode = escapeMode29;
        java.nio.charset.Charset charset31 = outputSettings28.charset;
        int int32 = outputSettings28.indentAmount();
        java.nio.charset.Charset charset33 = outputSettings28.charset();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings28.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = null;
        outputSettings28.setescapeMode(escapeMode35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        outputSettings38.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder42 = outputSettings38.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder43 = outputSettings38.getcharsetEncoder();
        java.nio.charset.Charset charset44 = outputSettings38.charset();
        outputSettings28.charset = charset44;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = null;
        outputSettings46.escapeMode = escapeMode47;
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings46.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        outputSettings50.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings50.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings50.getcharsetEncoder();
        java.nio.charset.Charset charset56 = outputSettings50.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings50.getescapeMode();
        outputSettings46.setescapeMode(escapeMode58);
        outputSettings28.escapeMode = escapeMode58;
        int int61 = outputSettings28.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            textNode23.outerHtmlHead(stringBuilder26, (int) (short) 1, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertNull(escapeMode37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder42);
        org.junit.Assert.assertNotNull(charsetEncoder43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        int int4 = textNode2.siblingIndex();
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = null;
        outputSettings7.escapeMode = escapeMode8;
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        int int11 = outputSettings7.indentAmount();
        java.nio.charset.Charset charset12 = outputSettings7.charset();
        int int13 = outputSettings7.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = null;
        outputSettings14.escapeMode = escapeMode15;
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings14.charsetEncoder;
        outputSettings7.setcharsetEncoder(charsetEncoder17);
        outputSettings7.indentAmount = (short) -1;
        outputSettings7.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings26.escapeMode;
        outputSettings25.escapeMode = escapeMode28;
        outputSettings23.setescapeMode(escapeMode28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        outputSettings31.prettyPrint = false;
        java.nio.charset.Charset charset35 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings23.charset(charset35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        outputSettings36.setindentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings36.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode;
        outputSettings43.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings43.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings43.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode;
        outputSettings50.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings43.escapeMode(escapeMode56);
        boolean boolean58 = outputSettings57.getprettyPrint();
        java.nio.charset.Charset charset59 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings36.charset(charset59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings7.charset(charset59);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.getescapeMode();
        int int63 = outputSettings61.indentAmount();
        textNode2.outerHtmlTail(stringBuilder5, (-1), outputSettings61);
        org.jsoup.select.NodeVisitor nodeVisitor65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node66 = textNode2.traverse(nodeVisitor65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder17);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNull(escapeMode62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        boolean boolean19 = textNode17.hasAttr("text");
        textNode17.ensureAttributes();
        org.jsoup.nodes.Node node21 = textNode17.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node21.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = null;
        outputSettings5.escapeMode = escapeMode6;
        java.nio.charset.Charset charset8 = outputSettings5.charset;
        boolean boolean9 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings5.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = null;
        outputSettings11.escapeMode = escapeMode12;
        java.nio.charset.Charset charset14 = outputSettings11.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode;
        outputSettings15.escapeMode = escapeMode18;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings15.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings11.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings5.escapeMode(escapeMode20);
        boolean boolean23 = textNode2.equals((java.lang.Object) escapeMode20);
        org.jsoup.nodes.Document document24 = textNode2.ownerDocument();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node26 = textNode2.previousSibling();
        org.jsoup.nodes.Node node27 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        java.lang.String str29 = textNode2.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(escapeMode10);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.gettext();
        boolean boolean9 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        boolean boolean10 = outputSettings7.prettyPrint;
        textNode2.outerHtmlTail(stringBuilder5, 10, outputSettings7);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.indentAmount(0);
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.String str20 = textNode16.getWholeText();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        textNode16.outerHtmlTail(stringBuilder21, 100, outputSettings23);
        outputSettings23.prettyPrint = true;
        outputSettings23.indentAmount = 52;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings29.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings29.clone();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings29.encoder();
        outputSettings23.setcharsetEncoder(charsetEncoder34);
        int int36 = outputSettings23.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings23.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings7.escapeMode(escapeMode37);
        boolean boolean39 = outputSettings7.prettyPrint();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str11 = textNode10.text;
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode;
        outputSettings14.escapeMode = escapeMode17;
        outputSettings14.prettyPrint = true;
        textNode10.outerHtmlTail(stringBuilder12, (int) 'a', outputSettings14);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode;
        outputSettings24.escapeMode = escapeMode27;
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings24.escapeMode;
        outputSettings14.escapeMode = escapeMode29;
        outputSettings0.escapeMode = escapeMode29;
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode34.setBaseUri("hi!");
        org.jsoup.nodes.Node node37 = textNode34.parent();
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = null;
        outputSettings40.escapeMode = escapeMode41;
        java.nio.charset.Charset charset43 = outputSettings40.charset();
        textNode34.outerHtmlTail(stringBuilder38, 10, outputSettings40);
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings40.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings40.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode;
        outputSettings49.escapeMode = escapeMode52;
        outputSettings47.setescapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        outputSettings55.prettyPrint = false;
        java.nio.charset.Charset charset59 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings47.charset(charset59);
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        outputSettings40.setescapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings66.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings69.escapeMode;
        outputSettings68.escapeMode = escapeMode71;
        outputSettings66.setescapeMode(escapeMode71);
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings74.escapeMode();
        outputSettings74.prettyPrint = false;
        java.nio.charset.Charset charset78 = outputSettings74.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings66.charset(charset78);
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings63.escapeMode(escapeMode80);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings40.escapeMode(escapeMode80);
        org.jsoup.nodes.Entities.EscapeMode escapeMode83 = outputSettings82.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings0.escapeMode(escapeMode83);
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings84.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings84.clone();
        outputSettings86.indentAmount = (short) 0;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(charsetEncoder45);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + escapeMode83 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode83.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings86);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        outputSettings9.prettyPrint = true;
        outputSettings9.indentAmount = 52;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings15.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.clone();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings15.encoder();
        outputSettings9.setcharsetEncoder(charsetEncoder20);
        int int22 = outputSettings9.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset26 = outputSettings23.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings23.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings33.escapeMode;
        outputSettings32.escapeMode = escapeMode35;
        outputSettings30.setescapeMode(escapeMode35);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        outputSettings38.prettyPrint = false;
        java.nio.charset.Charset charset42 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings30.charset(charset42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings30.prettyPrint(false);
        java.nio.charset.Charset charset46 = outputSettings30.getcharset();
        outputSettings23.setcharset(charset46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings23.clone();
        java.nio.charset.Charset charset49 = outputSettings48.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings9.charset(charset49);
        java.nio.charset.Charset charset51 = outputSettings50.getcharset();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(charset51);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#text");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode;
        outputSettings26.escapeMode = escapeMode29;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings26.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings22.escapeMode(escapeMode31);
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings32.encoder();
        textNode18.outerHtmlTail(stringBuilder20, (int) 'a', outputSettings32);
        java.lang.String str35 = textNode18.gettext();
        org.jsoup.nodes.TextNode textNode37 = textNode18.text("#");
        org.jsoup.nodes.Node node38 = textNode37.clone();
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode41.setBaseUri("hi!");
        org.jsoup.nodes.Node node44 = textNode41.parent();
        java.lang.String str45 = textNode41.getWholeText();
        java.lang.StringBuilder stringBuilder46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        textNode41.outerHtmlTail(stringBuilder46, 100, outputSettings48);
        org.jsoup.nodes.Node node51 = textNode41.removeAttr("hi!");
        java.lang.String str52 = textNode41.baseUri();
        java.lang.String str53 = textNode41.getWholeText();
        textNode41.text = "hi!";
        org.jsoup.nodes.Node node56 = textNode41.clone();
        org.jsoup.nodes.Node node57 = textNode41.nextSibling();
        java.lang.String str58 = textNode41.getTEXT_KEY();
        java.lang.String str59 = textNode41.toString();
        java.lang.String str61 = textNode41.attr("");
        textNode41.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode66 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode66.setBaseUri("hi!");
        org.jsoup.nodes.Node node69 = textNode66.parent();
        java.lang.StringBuilder stringBuilder70 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = null;
        outputSettings72.escapeMode = escapeMode73;
        java.nio.charset.Charset charset75 = outputSettings72.charset();
        textNode66.outerHtmlTail(stringBuilder70, 10, outputSettings72);
        org.jsoup.nodes.TextNode textNode78 = textNode66.text("text");
        java.lang.String str79 = textNode78.getTEXT_KEY();
        boolean boolean80 = textNode41.equals((java.lang.Object) textNode78);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node81 = textNode37.before((org.jsoup.nodes.Node) textNode41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#text" + "'", str35, "#text");
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "text" + "'", str58, "text");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertNotNull(textNode78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "text" + "'", str79, "text");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount(1);
        outputSettings0.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        outputSettings9.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.clone();
        outputSettings13.setindentAmount(1);
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings22.encoder();
        outputSettings17.charsetEncoder = charsetEncoder23;
        outputSettings13.setcharsetEncoder(charsetEncoder23);
        int int26 = outputSettings13.getindentAmount();
        boolean boolean27 = outputSettings13.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings13.encoder();
        outputSettings13.setindentAmount((int) '#');
        java.nio.charset.Charset charset31 = outputSettings13.charset;
        outputSettings0.charset = charset31;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings0.indentAmount((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings41.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings41.escapeMode;
        outputSettings40.escapeMode = escapeMode43;
        outputSettings38.setescapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        outputSettings46.prettyPrint = false;
        java.nio.charset.Charset charset50 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings38.charset(charset50);
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings35.escapeMode(escapeMode52);
        org.jsoup.nodes.TextNode textNode56 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode56.setBaseUri("hi!");
        org.jsoup.nodes.Node node59 = textNode56.parent();
        java.lang.StringBuilder stringBuilder60 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = null;
        outputSettings62.escapeMode = escapeMode63;
        java.nio.charset.Charset charset65 = outputSettings62.charset();
        textNode56.outerHtmlTail(stringBuilder60, 10, outputSettings62);
        java.nio.charset.CharsetEncoder charsetEncoder67 = outputSettings62.getcharsetEncoder();
        outputSettings53.charsetEncoder = charsetEncoder67;
        boolean boolean69 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings53.prettyPrint(false);
        boolean boolean72 = outputSettings71.prettyPrint();
        outputSettings71.indentAmount = ' ';
        java.nio.charset.CharsetEncoder charsetEncoder75 = outputSettings71.charsetEncoder;
        boolean boolean76 = outputSettings71.getprettyPrint();
        java.nio.charset.Charset charset77 = outputSettings71.getcharset();
        boolean boolean78 = outputSettings71.getprettyPrint();
        java.nio.charset.Charset charset79 = outputSettings71.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings0.charset(charset79);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(charsetEncoder67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(charsetEncoder75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertNotNull(outputSettings80);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.lang.String str16 = textNode2.text;
        org.jsoup.nodes.Node node17 = textNode2.clone();
        java.lang.String str18 = textNode2.text;
        textNode2.setBaseUri("text");
        java.lang.String str21 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode23 = textNode2.splitText(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        textNode2.text = "hi!";
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        java.lang.String str20 = textNode2.toString();
        org.jsoup.nodes.Node node21 = textNode2.clone();
        java.lang.String str22 = textNode2.getTEXT_KEY();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "text" + "'", str22, "text");
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        outputSettings13.setindentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = null;
        outputSettings20.escapeMode = escapeMode21;
        java.nio.charset.Charset charset23 = outputSettings20.charset;
        int int24 = outputSettings20.indentAmount();
        java.nio.charset.Charset charset25 = outputSettings20.charset();
        int int26 = outputSettings20.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        outputSettings27.escapeMode = escapeMode28;
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings27.charsetEncoder;
        outputSettings20.setcharsetEncoder(charsetEncoder30);
        int int32 = outputSettings20.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings20.encoder();
        java.nio.charset.Charset charset34 = outputSettings20.charset();
        outputSettings19.charset = charset34;
        outputSettings19.setprettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings19.charsetEncoder;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(charsetEncoder38);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings2.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings4.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings6.escapeMode = escapeMode9;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings4.escapeMode(escapeMode9);
        java.nio.charset.Charset charset12 = outputSettings11.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.charset(charset12);
        java.nio.charset.Charset charset14 = outputSettings13.charset;
        outputSettings13.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings13.escapeMode();
        outputSettings13.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.clone();
        boolean boolean23 = outputSettings20.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder24 = outputSettings20.encoder();
        boolean boolean25 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode;
        outputSettings33.escapeMode = escapeMode36;
        outputSettings31.setescapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        outputSettings39.prettyPrint = false;
        java.nio.charset.Charset charset43 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings31.charset(charset43);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings28.escapeMode(escapeMode45);
        boolean boolean47 = outputSettings28.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings28.getcharsetEncoder();
        outputSettings27.charsetEncoder = charsetEncoder48;
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings27.encoder();
        boolean boolean51 = outputSettings27.prettyPrint;
        org.jsoup.nodes.TextNode textNode54 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode54.setBaseUri("hi!");
        org.jsoup.nodes.Node node57 = textNode54.parent();
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = null;
        outputSettings60.escapeMode = escapeMode61;
        java.nio.charset.Charset charset63 = outputSettings60.charset();
        textNode54.outerHtmlTail(stringBuilder58, 10, outputSettings60);
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings60.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings60.charsetEncoder;
        java.nio.charset.Charset charset67 = outputSettings60.getcharset();
        outputSettings27.setcharset(charset67);
        java.nio.charset.Charset charset69 = outputSettings27.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings70.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings70.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings70.prettyPrint(true);
        boolean boolean75 = outputSettings70.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings70.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder77 = outputSettings70.encoder();
        java.nio.charset.Charset charset78 = outputSettings70.charset();
        outputSettings70.indentAmount = 0;
        boolean boolean81 = outputSettings70.getprettyPrint();
        java.nio.charset.Charset charset82 = outputSettings70.getcharset();
        outputSettings27.setcharset(charset82);
        java.nio.charset.Charset charset84 = outputSettings27.getcharset();
        outputSettings20.setcharset(charset84);
        outputSettings13.setcharset(charset84);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings13.indentAmount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charsetEncoder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertNotNull(charset69);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(charsetEncoder77);
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(charset84);
        org.junit.Assert.assertNotNull(outputSettings88);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.gettext();
        java.lang.String str18 = textNode2.attr("hi!");
        java.lang.String str19 = textNode2.text();
        java.lang.String str20 = textNode2.toString();
        java.lang.String str21 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode25 = textNode23.text("t");
        textNode25.setBaseUri("i!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(textNode25);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        int int8 = outputSettings0.getindentAmount();
        boolean boolean9 = outputSettings0.prettyPrint();
        boolean boolean10 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "hi!");
        java.lang.String str6 = textNode2.gettext();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        outputSettings5.escapeMode = escapeMode8;
        outputSettings3.setescapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        outputSettings11.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset15);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings0.escapeMode(escapeMode17);
        boolean boolean19 = outputSettings0.prettyPrint();
        int int20 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings0.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings0.escapeMode;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.indentAmount((int) (short) 0);
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = null;
        outputSettings18.escapeMode = escapeMode19;
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        textNode12.outerHtmlTail(stringBuilder16, 10, outputSettings18);
        outputSettings18.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        outputSettings25.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings25.getcharsetEncoder();
        outputSettings18.setcharsetEncoder(charsetEncoder30);
        outputSettings9.setcharsetEncoder(charsetEncoder30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings9.clone();
        java.nio.charset.Charset charset34 = outputSettings33.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings33.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode;
        outputSettings37.prettyPrint = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings37.charset("h");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: h");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode;
        outputSettings11.escapeMode = escapeMode14;
        outputSettings9.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        outputSettings17.prettyPrint = false;
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset21);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings6.escapeMode(escapeMode23);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode27.setBaseUri("hi!");
        org.jsoup.nodes.Node node30 = textNode27.parent();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = null;
        outputSettings33.escapeMode = escapeMode34;
        java.nio.charset.Charset charset36 = outputSettings33.charset();
        textNode27.outerHtmlTail(stringBuilder31, 10, outputSettings33);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings33.getcharsetEncoder();
        outputSettings24.charsetEncoder = charsetEncoder38;
        textNode2.outerHtmlTail(stringBuilder4, (int) (byte) 0, outputSettings24);
        org.jsoup.nodes.Node node43 = textNode2.attr("text", "hi!");
        org.jsoup.nodes.Node node46 = textNode2.attr("hi!", "hi!");
        int int47 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode49 = textNode2.splitText(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        outputSettings6.escapeMode = escapeMode7;
        java.nio.charset.Charset charset9 = outputSettings6.charset;
        int int10 = outputSettings6.indentAmount();
        boolean boolean11 = outputSettings6.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings6.encoder();
        java.nio.charset.Charset charset13 = outputSettings6.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode21.setBaseUri("hi!");
        org.jsoup.nodes.Node node24 = textNode21.parent();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        outputSettings27.escapeMode = escapeMode28;
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        textNode21.outerHtmlTail(stringBuilder25, 10, outputSettings27);
        java.nio.charset.CharsetEncoder charsetEncoder32 = outputSettings27.getcharsetEncoder();
        outputSettings18.charsetEncoder = charsetEncoder32;
        outputSettings6.setcharsetEncoder(charsetEncoder32);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings6.getescapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings6.encoder();
        textNode2.outerHtmlTail(stringBuilder4, 100, outputSettings6);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings6.escapeMode();
        outputSettings6.indentAmount = 'a';
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charsetEncoder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNull(escapeMode35);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNull(escapeMode38);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount(1);
        outputSettings0.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        outputSettings9.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.clone();
        outputSettings13.setindentAmount(1);
        java.nio.charset.Charset charset16 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings22.encoder();
        outputSettings17.charsetEncoder = charsetEncoder23;
        outputSettings13.setcharsetEncoder(charsetEncoder23);
        int int26 = outputSettings13.getindentAmount();
        boolean boolean27 = outputSettings13.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings13.encoder();
        outputSettings13.setindentAmount((int) '#');
        java.nio.charset.Charset charset31 = outputSettings13.charset;
        outputSettings0.charset = charset31;
        java.lang.Class<?> wildcardClass33 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.gettext();
        textNode2.text = "#text";
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings19.escapeMode;
        outputSettings18.escapeMode = escapeMode21;
        outputSettings16.setescapeMode(escapeMode21);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        outputSettings24.prettyPrint = false;
        java.nio.charset.Charset charset28 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings13.escapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings31.prettyPrint;
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode37.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = textNode37.parent();
        java.lang.String str41 = textNode37.getWholeText();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        textNode37.outerHtmlTail(stringBuilder42, 100, outputSettings44);
        outputSettings44.prettyPrint = true;
        outputSettings44.indentAmount = 52;
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings44.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings51.escapeMode;
        outputSettings51.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings51.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings51.getescapeMode();
        outputSettings44.escapeMode = escapeMode57;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings44.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        outputSettings61.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings61.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings65.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings65.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings68.escapeMode();
        outputSettings68.setindentAmount(0);
        java.nio.charset.Charset charset72 = outputSettings68.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings65.charset(charset72);
        outputSettings60.charset = charset72;
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings31.charset(charset72);
        textNode2.outerHtmlTail(stringBuilder11, (-1), outputSettings31);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings31.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings78.getescapeMode();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodesCopy();
        java.lang.String str17 = textNode2.getTEXT_KEY();
        java.lang.String str18 = textNode2.baseUri();
        java.lang.String str19 = textNode2.toString();
        int int20 = textNode2.siblingIndex();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        outputSettings15.setescapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        outputSettings23.prettyPrint = false;
        java.nio.charset.Charset charset27 = outputSettings23.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings15.charset(charset27);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        outputSettings8.setescapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode;
        outputSettings36.escapeMode = escapeMode39;
        outputSettings34.setescapeMode(escapeMode39);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        outputSettings42.prettyPrint = false;
        java.nio.charset.Charset charset46 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings34.charset(charset46);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings31.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings8.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = null;
        outputSettings51.escapeMode = escapeMode52;
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings51.charsetEncoder;
        java.nio.charset.Charset charset55 = outputSettings51.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings50.charset(charset55);
        outputSettings56.indentAmount = (short) 0;
        outputSettings56.setindentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings56.indentAmount(1);
        boolean boolean63 = outputSettings62.prettyPrint();
        boolean boolean64 = outputSettings62.prettyPrint();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        java.lang.String str16 = textNode12.getWholeText();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        textNode12.outerHtmlTail(stringBuilder17, 100, outputSettings19);
        textNode7.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings19);
        java.lang.String str22 = textNode7.getWholeText();
        java.lang.String str23 = textNode7.outerHtml();
        org.jsoup.nodes.TextNode textNode25 = textNode7.text("");
        java.lang.String str26 = textNode25.nodeName();
        boolean boolean27 = textNode2.equals((java.lang.Object) textNode25);
        textNode2.settext("#text");
        int int30 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node33 = textNode2.attr("#", "i!");
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode38.setBaseUri("hi!");
        org.jsoup.nodes.Node node41 = textNode38.parent();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = null;
        outputSettings44.escapeMode = escapeMode45;
        java.nio.charset.Charset charset47 = outputSettings44.charset();
        textNode38.outerHtmlTail(stringBuilder42, 10, outputSettings44);
        outputSettings44.prettyPrint = false;
        java.nio.charset.Charset charset51 = outputSettings44.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = null;
        outputSettings44.escapeMode = escapeMode52;
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings44.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings58.escapeMode;
        outputSettings57.escapeMode = escapeMode60;
        outputSettings55.setescapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings44.escapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings44.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder34, (int) (byte) 1, outputSettings64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "text" + "'", str22, "text");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "text" + "'", str23, "text");
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#text" + "'", str26, "#text");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings64);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        int int8 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        outputSettings9.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings9.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings9.getcharsetEncoder();
        java.nio.charset.Charset charset15 = outputSettings9.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings9.getescapeMode();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str20 = textNode19.text;
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        outputSettings23.prettyPrint = true;
        textNode19.outerHtmlTail(stringBuilder21, (int) 'a', outputSettings23);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode;
        outputSettings33.escapeMode = escapeMode36;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode;
        outputSettings23.escapeMode = escapeMode38;
        outputSettings9.escapeMode = escapeMode38;
        outputSettings0.setescapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode;
        java.nio.charset.Charset charset45 = outputSettings42.charset();
        java.nio.charset.Charset charset46 = outputSettings42.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings0.charset(charset46);
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        outputSettings50.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings50.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings50.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings50.clone();
        boolean boolean57 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings58.escapeMode;
        java.nio.charset.Charset charset61 = outputSettings58.charset;
        java.nio.charset.CharsetEncoder charsetEncoder62 = outputSettings58.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings58.indentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings64.charsetEncoder;
        outputSettings50.charsetEncoder = charsetEncoder65;
        outputSettings50.prettyPrint = false;
        outputSettings50.indentAmount = (byte) 10;
        java.nio.charset.Charset charset71 = outputSettings50.charset;
        outputSettings49.setcharset(charset71);
        java.nio.charset.Charset charset73 = outputSettings49.charset;
        java.nio.charset.Charset charset74 = outputSettings49.charset();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(charsetEncoder62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(charset74);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        textNode2.outerHtmlTail(stringBuilder16, (int) (byte) 100, outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings24.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings24.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings24.getescapeMode();
        boolean boolean31 = textNode2.equals((java.lang.Object) outputSettings24);
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings24.escapeMode;
        outputSettings24.prettyPrint = false;
        java.nio.charset.Charset charset35 = outputSettings24.charset();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        boolean boolean16 = textNode2.hasAttr("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        boolean boolean7 = outputSettings0.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings0.encoder();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode11.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = textNode11.parent();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        outputSettings17.escapeMode = escapeMode18;
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        textNode11.outerHtmlTail(stringBuilder15, 10, outputSettings17);
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings17.getcharsetEncoder();
        outputSettings17.indentAmount = '4';
        outputSettings17.setprettyPrint(false);
        outputSettings17.indentAmount = ' ';
        java.nio.charset.Charset charset29 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings30.clone();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charsetEncoder22);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        outputSettings5.prettyPrint = false;
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 100, outputSettings5);
        int int10 = outputSettings5.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings5.prettyPrint(true);
        boolean boolean13 = outputSettings5.getprettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        int int13 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        textNode2.settext("hi!");
        boolean boolean17 = textNode2.isBlank();
        java.lang.String str18 = textNode2.gettext();
        int int19 = textNode2.siblingIndex();
        java.lang.String str20 = textNode2.getTEXT_KEY();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        textNode2.text = "text";
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.siblingNodes();
        java.lang.String str19 = textNode2.nodeName();
        java.lang.String str20 = textNode2.text;
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("hi!");
        java.lang.String str23 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.siblingNodes();
        textNode2.settext("h");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset(charset12);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.getescapeMode();
        outputSettings13.setprettyPrint(false);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        outputSettings0.setprettyPrint(false);
        int int6 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = null;
        outputSettings7.escapeMode = escapeMode8;
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        int int11 = outputSettings7.indentAmount();
        outputSettings7.prettyPrint = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings7.indentAmount((int) (byte) 1);
        int int17 = outputSettings16.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings18.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset;
        int int26 = outputSettings22.indentAmount();
        boolean boolean27 = outputSettings22.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings22.encoder();
        outputSettings18.charsetEncoder = charsetEncoder28;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings16.escapeMode(escapeMode30);
        outputSettings0.escapeMode = escapeMode30;
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings0.charsetEncoder;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(escapeMode14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charsetEncoder33);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, (int) 'a', outputSettings8);
        textNode2.text = "text";
        textNode2.ensureAttributes();
        textNode2.settext("hi!");
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodes();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode26.setBaseUri("hi!");
        org.jsoup.nodes.Node node29 = textNode26.parent();
        java.lang.String str30 = textNode26.getWholeText();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        textNode26.outerHtmlTail(stringBuilder31, 100, outputSettings33);
        org.jsoup.nodes.Node node36 = textNode26.removeAttr("hi!");
        java.lang.String str37 = textNode26.baseUri();
        java.lang.String str38 = textNode26.getWholeText();
        java.lang.String str39 = textNode26.getWholeText();
        int int40 = textNode26.childNodeSize();
        org.jsoup.nodes.Node node41 = textNode26.previousSibling();
        org.jsoup.nodes.Node node42 = textNode26.parent();
        java.lang.String str43 = textNode26.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = textNode26.siblingNodes();
        boolean boolean45 = textNode22.equals((java.lang.Object) nodeList44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode22.childNodes();
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings55.escapeMode;
        outputSettings54.escapeMode = escapeMode57;
        outputSettings52.setescapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings60.escapeMode();
        outputSettings60.prettyPrint = false;
        java.nio.charset.Charset charset64 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings52.charset(charset64);
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings65.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings49.escapeMode(escapeMode66);
        org.jsoup.nodes.TextNode textNode70 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode70.setBaseUri("hi!");
        org.jsoup.nodes.Node node73 = textNode70.parent();
        java.lang.StringBuilder stringBuilder74 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = null;
        outputSettings76.escapeMode = escapeMode77;
        java.nio.charset.Charset charset79 = outputSettings76.charset();
        textNode70.outerHtmlTail(stringBuilder74, 10, outputSettings76);
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings76.getcharsetEncoder();
        outputSettings67.charsetEncoder = charsetEncoder81;
        boolean boolean83 = outputSettings67.prettyPrint();
        outputSettings67.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder86 = outputSettings67.charsetEncoder;
        int int87 = outputSettings67.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = outputSettings67.escapeMode();
        java.nio.charset.Charset charset89 = outputSettings67.charset();
        boolean boolean90 = outputSettings67.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode22.outerHtmlHead(stringBuilder47, (int) (short) 100, outputSettings67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(charsetEncoder86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode88 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode88.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.nodeName();
        int int20 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node21 = textNode2.clone();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.Node node24 = textNode2.nextSibling();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        java.lang.String str14 = textNode12.absUrl("hi!");
        textNode12.text = "hi!";
        org.jsoup.nodes.Document document17 = textNode12.ownerDocument();
        java.lang.String str19 = textNode12.attr("#text");
        org.jsoup.nodes.Node node20 = textNode12.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode24 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        org.jsoup.nodes.Node node25 = textNode24.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode24.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings32.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode;
        outputSettings34.escapeMode = escapeMode37;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings32.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings31.escapeMode(escapeMode37);
        boolean boolean41 = outputSettings40.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings42.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder47 = outputSettings46.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings46.encoder();
        org.jsoup.nodes.TextNode textNode51 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode51.setBaseUri("hi!");
        boolean boolean55 = textNode51.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings56.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings62.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings62.escapeMode;
        outputSettings61.escapeMode = escapeMode64;
        outputSettings59.setescapeMode(escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings67.escapeMode();
        outputSettings67.prettyPrint = false;
        java.nio.charset.Charset charset71 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings59.charset(charset71);
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings72.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings56.escapeMode(escapeMode73);
        boolean boolean75 = textNode51.equals((java.lang.Object) escapeMode73);
        outputSettings46.escapeMode = escapeMode73;
        outputSettings40.setescapeMode(escapeMode73);
        java.nio.charset.CharsetEncoder charsetEncoder78 = outputSettings40.getcharsetEncoder();
        boolean boolean79 = textNode24.equals((java.lang.Object) charsetEncoder78);
        org.jsoup.nodes.Node node82 = textNode24.attr("hi!", "");
        java.lang.StringBuilder stringBuilder83 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = null;
        textNode24.outerHtmlTail(stringBuilder83, (int) (short) 10, outputSettings85);
        boolean boolean87 = textNode12.equals((java.lang.Object) stringBuilder83);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charsetEncoder47);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(charsetEncoder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings7.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings7.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings0.escapeMode(escapeMode13);
        boolean boolean15 = outputSettings14.getprettyPrint();
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        boolean boolean17 = outputSettings14.prettyPrint();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str21 = textNode20.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode;
        outputSettings29.escapeMode = escapeMode32;
        outputSettings27.setescapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        outputSettings35.prettyPrint = false;
        java.nio.charset.Charset charset39 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset39);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings24.escapeMode(escapeMode41);
        org.jsoup.nodes.TextNode textNode45 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode45.setBaseUri("hi!");
        org.jsoup.nodes.Node node48 = textNode45.parent();
        java.lang.StringBuilder stringBuilder49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = null;
        outputSettings51.escapeMode = escapeMode52;
        java.nio.charset.Charset charset54 = outputSettings51.charset();
        textNode45.outerHtmlTail(stringBuilder49, 10, outputSettings51);
        java.nio.charset.CharsetEncoder charsetEncoder56 = outputSettings51.getcharsetEncoder();
        outputSettings42.charsetEncoder = charsetEncoder56;
        textNode20.outerHtmlTail(stringBuilder22, (int) (byte) 0, outputSettings42);
        int int59 = outputSettings42.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder60 = outputSettings42.getcharsetEncoder();
        int int61 = outputSettings42.getindentAmount();
        outputSettings42.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder64 = outputSettings42.encoder();
        outputSettings14.setcharsetEncoder(charsetEncoder64);
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings14.encoder();
        boolean boolean67 = outputSettings14.prettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(charsetEncoder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder64);
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        outputSettings5.escapeMode = escapeMode8;
        outputSettings3.setescapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        outputSettings11.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset15);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings0.escapeMode(escapeMode17);
        int int19 = outputSettings18.indentAmount;
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode22.setBaseUri("hi!");
        org.jsoup.nodes.Node node25 = textNode22.parent();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        outputSettings28.escapeMode = escapeMode29;
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        textNode22.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        outputSettings28.prettyPrint = false;
        outputSettings28.indentAmount = 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode;
        outputSettings39.escapeMode = escapeMode42;
        outputSettings37.setescapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings37.indentAmount((int) (short) 0);
        org.jsoup.nodes.TextNode textNode49 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode49.setBaseUri("hi!");
        org.jsoup.nodes.Node node52 = textNode49.parent();
        java.lang.StringBuilder stringBuilder53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = null;
        outputSettings55.escapeMode = escapeMode56;
        java.nio.charset.Charset charset58 = outputSettings55.charset();
        textNode49.outerHtmlTail(stringBuilder53, 10, outputSettings55);
        outputSettings55.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings62.escapeMode();
        outputSettings62.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings62.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder67 = outputSettings62.getcharsetEncoder();
        outputSettings55.setcharsetEncoder(charsetEncoder67);
        outputSettings46.setcharsetEncoder(charsetEncoder67);
        java.nio.charset.Charset charset70 = outputSettings46.getcharset();
        outputSettings28.charset = charset70;
        outputSettings18.charset = charset70;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings18.indentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings18.clone();
        int int76 = outputSettings18.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder77 = outputSettings18.charsetEncoder;
        outputSettings18.setprettyPrint(false);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertNotNull(charsetEncoder67);
        org.junit.Assert.assertNotNull(charset70);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertNotNull(charsetEncoder77);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean22 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document document23 = textNode2.ownerDocument();
        java.lang.String str24 = textNode2.gettext();
        textNode2.settext("text");
        textNode2.settext("text");
        java.lang.String str29 = textNode2.text();
        java.lang.String str30 = textNode2.nodeName();
        org.jsoup.nodes.Node node33 = textNode2.attr("text", "hi!");
        int int34 = node33.childNodeSize();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#text" + "'", str30, "#text");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean22 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str23 = textNode2.text;
        textNode2.settext("");
        java.lang.String str26 = textNode2.getTEXT_KEY();
        int int27 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode2.attr("hi!", "#text");
        textNode2.settext("");
        org.jsoup.nodes.TextNode textNode34 = textNode2.text("text");
        java.lang.String str35 = textNode34.gettext();
        java.lang.String str37 = textNode34.absUrl("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = textNode34.wrap("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "text" + "'", str26, "text");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "text" + "'", str35, "text");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings4.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings4.encoder();
        boolean boolean7 = outputSettings4.prettyPrint;
        boolean boolean8 = outputSettings4.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings4.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings4.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings4.escapeMode();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        java.lang.String str16 = textNode12.getWholeText();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        textNode12.outerHtmlTail(stringBuilder17, 100, outputSettings19);
        org.jsoup.nodes.Node node22 = textNode12.removeAttr("hi!");
        java.lang.String str23 = textNode12.baseUri();
        java.lang.String str24 = textNode12.getWholeText();
        textNode12.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode12.childNodesCopy();
        boolean boolean28 = textNode2.equals((java.lang.Object) nodeList27);
        boolean boolean29 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = textNode2.wrap("t");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode17.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = textNode17.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = null;
        outputSettings23.escapeMode = escapeMode24;
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        textNode17.outerHtmlTail(stringBuilder21, 10, outputSettings23);
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings23.getcharsetEncoder();
        java.nio.charset.Charset charset29 = outputSettings23.getcharset();
        boolean boolean30 = textNode2.equals((java.lang.Object) outputSettings23);
        java.lang.String str31 = textNode2.text;
        org.jsoup.nodes.TextNode textNode33 = textNode2.text("");
        java.lang.String str34 = textNode33.text();
        org.jsoup.nodes.Node node35 = textNode33.nextSibling();
        java.lang.String str36 = textNode33.nodeName();
        boolean boolean38 = textNode33.hasAttr("ext");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#text" + "'", str36, "#text");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings8.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = null;
        outputSettings8.escapeMode = escapeMode16;
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings8.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings8.prettyPrint(true);
        boolean boolean21 = outputSettings20.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode;
        outputSettings22.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings22.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings22.getescapeMode();
        outputSettings20.setescapeMode(escapeMode28);
        int int30 = outputSettings20.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        outputSettings31.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings31.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings31.getcharsetEncoder();
        java.nio.charset.Charset charset37 = outputSettings31.charset();
        boolean boolean38 = outputSettings31.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        outputSettings39.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder43 = outputSettings39.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder44 = outputSettings39.getcharsetEncoder();
        java.nio.charset.Charset charset45 = outputSettings39.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings39.escapeMode();
        outputSettings31.escapeMode = escapeMode46;
        org.jsoup.nodes.TextNode textNode50 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode50.setBaseUri("hi!");
        org.jsoup.nodes.Node node53 = textNode50.parent();
        java.lang.String str54 = textNode50.getWholeText();
        java.lang.StringBuilder stringBuilder55 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        textNode50.outerHtmlTail(stringBuilder55, 100, outputSettings57);
        outputSettings57.prettyPrint = true;
        outputSettings57.indentAmount = 52;
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings57.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings64.escapeMode;
        outputSettings64.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings64.getescapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings64.getescapeMode();
        outputSettings57.escapeMode = escapeMode70;
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings57.prettyPrint(true);
        boolean boolean74 = outputSettings57.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder75 = outputSettings57.getcharsetEncoder();
        outputSettings31.charsetEncoder = charsetEncoder75;
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings31.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings20.escapeMode(escapeMode77);
        boolean boolean79 = outputSettings20.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings20.indentAmount((int) (short) 1);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings20.prettyPrint(false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder43);
        org.junit.Assert.assertNotNull(charsetEncoder44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charsetEncoder63);
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(charsetEncoder75);
        org.junit.Assert.assertTrue("'" + escapeMode77 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode77.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings83);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        int int4 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount(35);
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        outputSettings9.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings9.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings9.getcharsetEncoder();
        java.nio.charset.Charset charset15 = outputSettings9.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings9.getescapeMode();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str20 = textNode19.text;
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        outputSettings23.prettyPrint = true;
        textNode19.outerHtmlTail(stringBuilder21, (int) 'a', outputSettings23);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode;
        outputSettings33.escapeMode = escapeMode36;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode;
        outputSettings23.escapeMode = escapeMode38;
        outputSettings9.escapeMode = escapeMode38;
        org.jsoup.nodes.TextNode textNode43 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode43.setBaseUri("hi!");
        org.jsoup.nodes.Node node46 = textNode43.parent();
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = null;
        outputSettings49.escapeMode = escapeMode50;
        java.nio.charset.Charset charset52 = outputSettings49.charset();
        textNode43.outerHtmlTail(stringBuilder47, 10, outputSettings49);
        java.nio.charset.CharsetEncoder charsetEncoder54 = outputSettings49.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings49.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings59.escapeMode;
        outputSettings58.escapeMode = escapeMode61;
        outputSettings56.setescapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        outputSettings64.prettyPrint = false;
        java.nio.charset.Charset charset68 = outputSettings64.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings56.charset(charset68);
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        outputSettings49.setescapeMode(escapeMode70);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings72.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings72.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings75.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings78.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings78.escapeMode;
        outputSettings77.escapeMode = escapeMode80;
        outputSettings75.setescapeMode(escapeMode80);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings83.escapeMode();
        outputSettings83.prettyPrint = false;
        java.nio.charset.Charset charset87 = outputSettings83.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings75.charset(charset87);
        org.jsoup.nodes.Entities.EscapeMode escapeMode89 = outputSettings88.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings72.escapeMode(escapeMode89);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings49.escapeMode(escapeMode89);
        org.jsoup.nodes.Entities.EscapeMode escapeMode92 = outputSettings91.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings93 = outputSettings9.escapeMode(escapeMode92);
        java.nio.charset.CharsetEncoder charsetEncoder94 = outputSettings9.getcharsetEncoder();
        outputSettings6.charsetEncoder = charsetEncoder94;
        java.nio.charset.Charset charset96 = outputSettings6.getcharset();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNull(escapeMode7);
        org.junit.Assert.assertNull(escapeMode8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset87);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertTrue("'" + escapeMode89 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode89.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertTrue("'" + escapeMode92 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode92.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings93);
        org.junit.Assert.assertNotNull(charsetEncoder94);
        org.junit.Assert.assertNotNull(charset96);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        outputSettings5.escapeMode = escapeMode8;
        outputSettings3.setescapeMode(escapeMode8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        outputSettings11.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset15);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings0.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        boolean boolean21 = outputSettings18.prettyPrint;
        java.nio.charset.Charset charset22 = outputSettings18.getcharset();
        java.nio.charset.Charset charset23 = outputSettings18.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings24.setprettyPrint(false);
        int int29 = outputSettings24.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings24.escapeMode();
        outputSettings24.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings24.clone();
        int int34 = outputSettings33.indentAmount();
        int int35 = outputSettings33.indentAmount;
        outputSettings33.setindentAmount((int) ' ');
        java.nio.charset.Charset charset38 = outputSettings33.charset;
        outputSettings18.setcharset(charset38);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(charset38);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        textNode2.settext("text");
        java.lang.String str17 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node20 = textNode2.attr("text", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodes();
        java.lang.String str22 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node23 = textNode2.clone();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "text" + "'", str22, "text");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.indentAmount((int) (short) 0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings16.getcharsetEncoder();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNull(escapeMode17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charsetEncoder19);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "");
        java.lang.String str18 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean22 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str23 = textNode2.text;
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        outputSettings26.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings26.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings26.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode;
        java.nio.charset.Charset charset35 = outputSettings32.charset;
        outputSettings26.setcharset(charset35);
        textNode2.outerHtmlTail(stringBuilder24, (int) (short) 100, outputSettings26);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings26.getcharsetEncoder();
        int int39 = outputSettings26.indentAmount;
        java.nio.charset.CharsetEncoder charsetEncoder40 = outputSettings26.charsetEncoder;
        int int41 = outputSettings26.getindentAmount();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.clone();
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings12.encoder();
        outputSettings12.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode23.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = textNode23.parent();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        outputSettings29.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        textNode23.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings29.getcharsetEncoder();
        outputSettings20.charsetEncoder = charsetEncoder34;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings39.escapeMode;
        outputSettings38.escapeMode = escapeMode41;
        outputSettings36.setescapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode();
        outputSettings44.prettyPrint = false;
        java.nio.charset.Charset charset48 = outputSettings44.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings36.charset(charset48);
        outputSettings20.charset = charset48;
        java.nio.charset.CharsetEncoder charsetEncoder51 = outputSettings20.getcharsetEncoder();
        outputSettings12.charsetEncoder = charsetEncoder51;
        outputSettings0.charsetEncoder = charsetEncoder51;
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode;
        outputSettings56.escapeMode = escapeMode59;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings56.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings56.indentAmount((int) (byte) 100);
        boolean boolean65 = outputSettings56.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings66.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings66.escapeMode;
        outputSettings66.setprettyPrint(false);
        outputSettings66.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = null;
        outputSettings73.escapeMode = escapeMode74;
        java.nio.charset.CharsetEncoder charsetEncoder76 = outputSettings73.charsetEncoder;
        java.nio.charset.Charset charset77 = outputSettings73.charset;
        outputSettings66.setcharset(charset77);
        outputSettings66.prettyPrint = false;
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings66.getescapeMode();
        outputSettings56.setescapeMode(escapeMode81);
        outputSettings0.escapeMode = escapeMode81;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(charsetEncoder51);
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder76);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        int int5 = outputSettings0.getindentAmount();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = null;
        outputSettings0.escapeMode = escapeMode7;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode;
        outputSettings11.escapeMode = escapeMode14;
        outputSettings9.setescapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        outputSettings17.prettyPrint = false;
        java.nio.charset.Charset charset21 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings9.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings9.escapeMode(escapeMode26);
        outputSettings0.escapeMode = escapeMode26;
        int int30 = outputSettings0.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode;
        outputSettings33.escapeMode = escapeMode36;
        outputSettings31.setescapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        outputSettings39.prettyPrint = false;
        java.nio.charset.Charset charset43 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings31.charset(charset43);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings49.escapeMode;
        outputSettings48.escapeMode = escapeMode51;
        outputSettings46.setescapeMode(escapeMode51);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        outputSettings54.prettyPrint = false;
        java.nio.charset.Charset charset58 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings46.charset(charset58);
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings44.escapeMode(escapeMode60);
        outputSettings0.setescapeMode(escapeMode60);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        outputSettings63.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings63.clone();
        java.nio.charset.CharsetEncoder charsetEncoder68 = outputSettings63.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings69.escapeMode;
        outputSettings69.setprettyPrint(false);
        int int74 = outputSettings69.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings69.escapeMode();
        outputSettings63.setescapeMode(escapeMode75);
        boolean boolean77 = outputSettings63.prettyPrint;
        boolean boolean78 = outputSettings63.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings63.indentAmount((int) (byte) 0);
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings80.getcharsetEncoder();
        outputSettings0.setcharsetEncoder(charsetEncoder81);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(charsetEncoder68);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(charsetEncoder81);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        int int14 = textNode2.childNodeSize();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("#text");
        java.lang.String str19 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode;
        outputSettings26.escapeMode = escapeMode29;
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings26.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings22.escapeMode(escapeMode31);
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings32.encoder();
        textNode18.outerHtmlTail(stringBuilder20, (int) 'a', outputSettings32);
        java.lang.String str35 = textNode18.getWholeText();
        int int36 = textNode18.siblingIndex();
        org.jsoup.nodes.Node node37 = textNode18.parent();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#text" + "'", str35, "#text");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.gettext();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode7.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        textNode7.outerHtmlTail(stringBuilder12, 100, outputSettings14);
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 0, outputSettings14);
        textNode2.text = "hi!";
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        java.lang.String str20 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        java.lang.String str23 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode25 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.setindentAmount(0);
        java.nio.charset.Charset charset4 = outputSettings0.getcharset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings9.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings9.encoder();
        outputSettings0.setcharsetEncoder(charsetEncoder11);
        int int13 = outputSettings0.indentAmount;
        outputSettings0.prettyPrint = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode23.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = textNode23.parent();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        outputSettings29.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        textNode23.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        outputSettings29.prettyPrint = false;
        java.nio.charset.Charset charset36 = outputSettings29.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = null;
        outputSettings37.escapeMode = escapeMode38;
        java.nio.charset.Charset charset40 = outputSettings37.charset;
        int int41 = outputSettings37.indentAmount();
        java.nio.charset.Charset charset42 = outputSettings37.charset();
        outputSettings29.setcharset(charset42);
        java.nio.charset.Charset charset44 = outputSettings29.charset;
        outputSettings20.charset = charset44;
        outputSettings20.indentAmount = (short) 0;
        int int48 = outputSettings20.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings49.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode;
        outputSettings51.escapeMode = escapeMode54;
        outputSettings49.setescapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode();
        outputSettings57.prettyPrint = false;
        java.nio.charset.Charset charset61 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings49.charset(charset61);
        java.nio.charset.Charset charset63 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings20.charset(charset63);
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings64.encoder();
        boolean boolean66 = outputSettings64.prettyPrint();
        outputSettings64.setindentAmount(52);
        int int69 = outputSettings64.indentAmount;
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings64.escapeMode();
        outputSettings0.escapeMode = escapeMode70;
        outputSettings0.indentAmount = (byte) 100;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(charset63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(charsetEncoder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }
}

