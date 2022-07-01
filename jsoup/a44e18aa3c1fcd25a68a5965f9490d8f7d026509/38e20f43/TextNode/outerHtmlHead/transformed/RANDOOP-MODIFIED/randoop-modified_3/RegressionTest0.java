import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.charset(charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
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
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            textNode0.ensureAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.Charset charset12 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, (int) 'a', outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode15.parent();
        java.lang.String str19 = textNode15.getWholeText();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        textNode15.outerHtmlTail(stringBuilder20, 100, outputSettings22);
        org.jsoup.nodes.Node node25 = textNode15.removeAttr("hi!");
        java.lang.String str26 = textNode15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.lang.Class<?> wildcardClass6 = charset5.getClass();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("text");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        java.lang.Class<?> wildcardClass7 = charsetEncoder6.getClass();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = textNode0.hasAttr("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.childNodes();
        java.lang.String str24 = textNode20.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.before((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
        java.lang.Class<?> wildcardClass15 = outputSettings8.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode;
        outputSettings7.escapeMode = escapeMode10;
        outputSettings5.setescapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        outputSettings13.prettyPrint = false;
        java.nio.charset.Charset charset17 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings5.charset(charset17);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        boolean boolean20 = outputSettings18.getprettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder3, (int) 'a', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("text", "text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = textNode0.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList1);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str0 = org.jsoup.nodes.TextNode.TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text" + "'", str0, "text");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
        java.lang.String str17 = textNode2.gettext();
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
        boolean boolean19 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.attr("", "text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        java.lang.Class<?> wildcardClass8 = escapeMode7.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode15.parent();
        java.lang.String str19 = textNode15.getWholeText();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        textNode15.outerHtmlTail(stringBuilder20, 100, outputSettings22);
        java.lang.String str24 = textNode15.outerHtml();
        java.lang.String str25 = textNode15.toString();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        int int3 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = textNode0.attr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList1);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.parent();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = null;
        outputSettings14.escapeMode = escapeMode15;
        java.nio.charset.Charset charset17 = outputSettings14.charset();
        textNode8.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        int int19 = textNode8.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.before((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
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
        textNode2.text = "";
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode17.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = textNode17.parent();
        java.lang.String str21 = textNode17.getWholeText();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        textNode17.outerHtmlTail(stringBuilder22, 100, outputSettings24);
        org.jsoup.nodes.Node node27 = textNode17.removeAttr("hi!");
        java.lang.String str28 = textNode17.baseUri();
        java.lang.String str29 = textNode17.getWholeText();
        org.jsoup.nodes.Node node32 = textNode17.attr("text", "");
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = textNode2.after((org.jsoup.nodes.Node) document33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        int int5 = textNode2.childNodeSize();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
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
        java.lang.Class<?> wildcardClass33 = charsetEncoder30.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
        outputSettings16.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings24.encoder();
        outputSettings16.setcharsetEncoder(charsetEncoder25);
        java.lang.Class<?> wildcardClass27 = outputSettings16.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("#text");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#text" + "'", str1, "#text");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
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
        node17.setBaseUri("text");
        node17.setBaseUri("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node17.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
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
        outputSettings8.indentAmount = '4';
        boolean boolean16 = outputSettings8.getprettyPrint();
        java.lang.Class<?> wildcardClass17 = outputSettings8.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
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
        textNode2.settext("#text");
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str23 = textNode22.text;
        org.jsoup.nodes.TextNode textNode25 = textNode22.splitText(0);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textNode25);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
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
        java.lang.String str16 = textNode2.text();
        java.lang.String str17 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
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
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.charsetEncoder;
        boolean boolean4 = outputSettings0.prettyPrint;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) (short) 0);
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
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        outputSettings19.escapeMode = escapeMode20;
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        textNode13.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        java.lang.String str24 = textNode13.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
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
        textNode2.settext("text");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node18.setBaseUri("");
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        java.lang.Class<?> wildcardClass4 = outputSettings0.getClass();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
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
        java.lang.Class<?> wildcardClass19 = outputSettings0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.String str17 = textNode13.getWholeText();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        textNode13.outerHtmlTail(stringBuilder18, 100, outputSettings20);
        org.jsoup.nodes.Node node23 = textNode13.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode12.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
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
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode24.setBaseUri("hi!");
        org.jsoup.nodes.Node node27 = textNode24.parent();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        outputSettings30.escapeMode = escapeMode31;
        java.nio.charset.Charset charset33 = outputSettings30.charset();
        textNode24.outerHtmlTail(stringBuilder28, 10, outputSettings30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = textNode2.after((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(charset33);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
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
        org.jsoup.nodes.Node node21 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode24.setBaseUri("hi!");
        org.jsoup.nodes.Node node27 = textNode24.parent();
        org.jsoup.nodes.Attributes attributes28 = textNode24.attributes();
        textNode24.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes31 = textNode24.attributes();
        java.lang.String str32 = textNode24.text;
        java.lang.String str33 = textNode24.text();
        // The following exception was thrown during execution in test generation
        try {
            node21.replaceWith((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        int int8 = outputSettings0.indentAmount();
        java.lang.Class<?> wildcardClass9 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        java.lang.String str11 = textNode2.baseUri();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        textNode16.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings22.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings22.getcharsetEncoder();
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
        outputSettings22.setescapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings51.escapeMode;
        outputSettings50.escapeMode = escapeMode53;
        outputSettings48.setescapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode();
        outputSettings56.prettyPrint = false;
        java.nio.charset.Charset charset60 = outputSettings56.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings48.charset(charset60);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings45.escapeMode(escapeMode62);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings22.escapeMode(escapeMode62);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder66 = outputSettings65.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings68.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings68.escapeMode;
        outputSettings67.escapeMode = escapeMode70;
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings65.escapeMode(escapeMode70);
        java.nio.charset.Charset charset73 = outputSettings72.getcharset();
        outputSettings64.charset = charset73;
        java.nio.charset.Charset charset75 = outputSettings64.charset();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder12, (int) (short) 10, outputSettings64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(charsetEncoder66);
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(charset75);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
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
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings8.charsetEncoder;
        outputSettings8.prettyPrint = true;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder6, (int) (byte) 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder11);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
        java.lang.String str15 = textNode2.getWholeText();
        int int16 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setprettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        outputSettings5.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings5.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings5.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode;
        java.nio.charset.Charset charset14 = outputSettings11.charset;
        outputSettings5.setcharset(charset14);
        outputSettings0.charset = charset14;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        java.lang.Class<?> wildcardClass7 = outputSettings0.getClass();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings6.escapeMode = escapeMode9;
        outputSettings6.prettyPrint = true;
        textNode2.outerHtmlTail(stringBuilder4, (int) 'a', outputSettings6);
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        textNode16.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings22.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings22.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        outputSettings29.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings29.charset;
        int int33 = outputSettings29.indentAmount();
        java.nio.charset.Charset charset34 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings22.charset(charset34);
        boolean boolean36 = textNode2.equals((java.lang.Object) outputSettings35);
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean40 = textNode39.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = textNode2.after((org.jsoup.nodes.Node) textNode39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings18.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings18.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNotNull(outputSettings35);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
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
        boolean boolean20 = textNode2.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = textNode0.attr("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList1);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.getescapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings0.charsetEncoder;
        java.lang.Class<?> wildcardClass9 = charsetEncoder8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node43.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode15.parent();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = null;
        outputSettings21.escapeMode = escapeMode22;
        java.nio.charset.Charset charset24 = outputSettings21.charset();
        textNode15.outerHtmlTail(stringBuilder19, 10, outputSettings21);
        int int26 = textNode15.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
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
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode29.setBaseUri("hi!");
        org.jsoup.nodes.Node node32 = textNode29.parent();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = null;
        outputSettings35.escapeMode = escapeMode36;
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        textNode29.outerHtmlTail(stringBuilder33, 10, outputSettings35);
        java.nio.charset.CharsetEncoder charsetEncoder40 = outputSettings35.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder41 = outputSettings35.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings45.escapeMode;
        outputSettings44.escapeMode = escapeMode47;
        outputSettings42.setescapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        outputSettings50.prettyPrint = false;
        java.nio.charset.Charset charset54 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings42.charset(charset54);
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings55.escapeMode();
        outputSettings35.setescapeMode(escapeMode56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode65 = outputSettings64.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings64.escapeMode;
        outputSettings63.escapeMode = escapeMode66;
        outputSettings61.setescapeMode(escapeMode66);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode70 = outputSettings69.escapeMode();
        outputSettings69.prettyPrint = false;
        java.nio.charset.Charset charset73 = outputSettings69.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings61.charset(charset73);
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings74.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings58.escapeMode(escapeMode75);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings35.escapeMode(escapeMode75);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = null;
        outputSettings78.escapeMode = escapeMode79;
        java.nio.charset.CharsetEncoder charsetEncoder81 = outputSettings78.charsetEncoder;
        java.nio.charset.Charset charset82 = outputSettings78.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings77.charset(charset82);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder25, 1, outputSettings83);
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(charsetEncoder40);
        org.junit.Assert.assertNotNull(charsetEncoder41);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset54);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode65 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode65.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode70 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode70.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertNotNull(charsetEncoder81);
        org.junit.Assert.assertNotNull(charset82);
        org.junit.Assert.assertNotNull(outputSettings83);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
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
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode21.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode21.childNodes();
        java.lang.String str25 = textNode21.outerHtml();
        org.jsoup.nodes.Attributes attributes26 = textNode21.attributes();
        java.lang.String str27 = textNode21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode2.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.parent();
        java.lang.String str12 = textNode8.getWholeText();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        textNode8.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        org.jsoup.nodes.Node node18 = textNode8.removeAttr("hi!");
        java.lang.String str19 = textNode8.baseUri();
        java.lang.String str20 = textNode8.getWholeText();
        org.jsoup.nodes.Node node23 = textNode8.attr("text", "");
        node23.setBaseUri("text");
        node23.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode2.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode5.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode5.parent();
        java.lang.String str9 = textNode5.getWholeText();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        textNode5.outerHtmlTail(stringBuilder10, 100, outputSettings12);
        org.jsoup.nodes.Node node15 = textNode5.removeAttr("hi!");
        java.lang.String str16 = textNode5.baseUri();
        org.jsoup.nodes.Node node17 = textNode5.previousSibling();
        org.jsoup.nodes.Node node18 = textNode5.previousSibling();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode;
        textNode5.outerHtmlTail(stringBuilder19, (int) (byte) 100, outputSettings21);
        textNode5.settext("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.after((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("#text");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#text" + "'", str1, "#text");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        int int7 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodes();
        java.lang.String str24 = textNode22.toString();
        java.lang.String str25 = textNode22.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "text" + "'", str25, "text");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode6.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode6.childNodes();
        java.lang.String str10 = textNode6.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.siblingNodes();
        java.lang.String str13 = textNode6.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before((org.jsoup.nodes.Node) textNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode5.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        outputSettings0.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings0.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charsetEncoder9);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode18 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings4.charsetEncoder;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String str1 = org.jsoup.nodes.TextNode.stripLeadingWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
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
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str18 = textNode17.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode;
        outputSettings26.escapeMode = escapeMode29;
        outputSettings24.setescapeMode(escapeMode29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        outputSettings32.prettyPrint = false;
        java.nio.charset.Charset charset36 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings24.charset(charset36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings21.escapeMode(escapeMode38);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode42.setBaseUri("hi!");
        org.jsoup.nodes.Node node45 = textNode42.parent();
        java.lang.StringBuilder stringBuilder46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = null;
        outputSettings48.escapeMode = escapeMode49;
        java.nio.charset.Charset charset51 = outputSettings48.charset();
        textNode42.outerHtmlTail(stringBuilder46, 10, outputSettings48);
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings48.getcharsetEncoder();
        outputSettings39.charsetEncoder = charsetEncoder53;
        textNode17.outerHtmlTail(stringBuilder19, (int) (byte) 0, outputSettings39);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(charsetEncoder53);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode10.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.childNodes();
        java.lang.String str14 = textNode10.outerHtml();
        java.lang.String str16 = textNode10.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode10.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
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
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = null;
        outputSettings15.escapeMode = escapeMode16;
        java.nio.charset.Charset charset18 = outputSettings15.charset;
        int int19 = outputSettings15.indentAmount();
        java.nio.charset.Charset charset20 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings8.charset(charset20);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.getescapeMode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNull(escapeMode22);
        org.junit.Assert.assertNull(escapeMode23);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document4.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
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
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode28 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
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
        int int18 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        boolean boolean5 = outputSettings0.prettyPrint;
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.encoder();
        int int7 = outputSettings0.indentAmount;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = null;
        outputSettings4.escapeMode = escapeMode5;
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings4.charsetEncoder;
        boolean boolean8 = textNode2.equals((java.lang.Object) charsetEncoder7);
        java.lang.String str10 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
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
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = document18.nextSibling();
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
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.setindentAmount(0);
        outputSettings0.setindentAmount((int) (byte) -1);
        int int6 = outputSettings0.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String str1 = org.jsoup.nodes.TextNode.normaliseWhitespace("text");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "text" + "'", str1, "text");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
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
        java.lang.String str15 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        outputSettings18.setindentAmount(0);
        outputSettings18.setindentAmount((int) (byte) -1);
        int int24 = outputSettings18.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder16, (int) (short) 1, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        java.lang.String str14 = textNode12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        int int13 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        java.lang.String str16 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode18 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "text" + "'", str16, "text");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
        int int16 = textNode2.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.traverse(nodeVisitor17);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        outputSettings0.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode;
        outputSettings7.escapeMode = escapeMode10;
        outputSettings5.setescapeMode(escapeMode10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        outputSettings13.prettyPrint = false;
        java.nio.charset.Charset charset17 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings5.charset(charset17);
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
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings27.getcharsetEncoder();
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
        outputSettings27.setescapeMode(escapeMode48);
        outputSettings18.setescapeMode(escapeMode48);
        outputSettings0.setescapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings52.getescapeMode();
        outputSettings0.setescapeMode(escapeMode55);
        java.lang.Class<?> wildcardClass57 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings1.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode;
        outputSettings0.escapeMode = escapeMode3;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.indentAmount((int) (short) 1);
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings6.getcharsetEncoder();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node1 = textNode0.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
        java.lang.String str20 = textNode18.absUrl("#text");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode18.traverse(nodeVisitor21);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.String str11 = node10.baseUri();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str5 = textNode2.absUrl("text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
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
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings23.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        outputSettings30.escapeMode = escapeMode31;
        java.nio.charset.Charset charset33 = outputSettings30.charset;
        int int34 = outputSettings30.indentAmount();
        java.nio.charset.Charset charset35 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings23.charset(charset35);
        org.jsoup.nodes.TextNode textNode39 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode39.setBaseUri("hi!");
        org.jsoup.nodes.Node node42 = textNode39.parent();
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = null;
        outputSettings45.escapeMode = escapeMode46;
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        textNode39.outerHtmlTail(stringBuilder43, 10, outputSettings45);
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings45.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder51 = outputSettings45.getcharsetEncoder();
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
        outputSettings45.setescapeMode(escapeMode66);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode69 = outputSettings68.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings68.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings71.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings74.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings74.escapeMode;
        outputSettings73.escapeMode = escapeMode76;
        outputSettings71.setescapeMode(escapeMode76);
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings79.escapeMode();
        outputSettings79.prettyPrint = false;
        java.nio.charset.Charset charset83 = outputSettings79.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings71.charset(charset83);
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings84.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings68.escapeMode(escapeMode85);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings45.escapeMode(escapeMode85);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder89 = outputSettings88.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode92 = outputSettings91.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode93 = outputSettings91.escapeMode;
        outputSettings90.escapeMode = escapeMode93;
        org.jsoup.nodes.Document.OutputSettings outputSettings95 = outputSettings88.escapeMode(escapeMode93);
        java.nio.charset.Charset charset96 = outputSettings95.getcharset();
        outputSettings87.charset = charset96;
        outputSettings23.charset = charset96;
        org.jsoup.nodes.Document.OutputSettings outputSettings99 = outputSettings13.charset(charset96);
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertNotNull(charsetEncoder51);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode61 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode61.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode69 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode69.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset83);
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + escapeMode85 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode85.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(charsetEncoder89);
        org.junit.Assert.assertTrue("'" + escapeMode92 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode92.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode93 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode93.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings95);
        org.junit.Assert.assertNotNull(charset96);
        org.junit.Assert.assertNotNull(outputSettings99);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        int int13 = textNode12.childNodeSize();
        boolean boolean15 = textNode12.hasAttr("hi!");
        java.lang.Class<?> wildcardClass16 = textNode12.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings6.escapeMode;
        java.nio.charset.Charset charset9 = outputSettings6.charset;
        outputSettings0.setcharset(charset9);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        outputSettings19.prettyPrint = false;
        java.nio.charset.Charset charset23 = outputSettings19.charset();
        textNode13.outerHtmlTail(stringBuilder17, (int) 'a', outputSettings19);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset28 = outputSettings25.charset;
        outputSettings19.setcharset(charset28);
        outputSettings0.setcharset(charset28);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings0.escapeMode;
        java.lang.Class<?> wildcardClass32 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        int int12 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str23 = textNode22.gettext();
        java.lang.String str25 = textNode22.absUrl("#text");
        java.lang.String str26 = textNode22.toString();
        org.jsoup.nodes.Document document27 = textNode22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode2.after((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
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
        boolean boolean19 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str23 = textNode22.gettext();
        java.lang.String str25 = textNode22.absUrl("#text");
        boolean boolean26 = textNode22.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.before((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        outputSettings5.prettyPrint = false;
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 100, outputSettings5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str12 = textNode9.attr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode;
        outputSettings15.setprettyPrint(false);
        textNode2.outerHtmlTail(stringBuilder13, 52, outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode12.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
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
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode24.setBaseUri("hi!");
        org.jsoup.nodes.Node node27 = textNode24.parent();
        java.lang.String str28 = textNode24.getWholeText();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        textNode24.outerHtmlTail(stringBuilder29, 100, outputSettings31);
        java.lang.String str33 = textNode24.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = textNode2.after((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.attr("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
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
        org.jsoup.nodes.Node node16 = textNode2.clone();
        org.jsoup.nodes.Node node17 = node16.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        java.nio.charset.Charset charset10 = outputSettings7.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.indentAmount(1);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder5, (int) ' ', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.absUrl("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        boolean boolean16 = textNode2.hasAttr("#text");
        java.lang.String str17 = textNode2.outerHtml();
        java.lang.String str18 = textNode2.text();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str22 = textNode21.gettext();
        java.lang.String str24 = textNode21.absUrl("#text");
        java.lang.String str25 = textNode21.toString();
        org.jsoup.nodes.Node node27 = textNode21.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode2.after(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.nio.charset.Charset charset13 = outputSettings8.getcharset();
        outputSettings8.indentAmount = (byte) 10;
        int int16 = outputSettings8.indentAmount();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
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
        java.lang.String str22 = textNode2.attr("");
        textNode2.settext("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.gettext();
        boolean boolean14 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings1.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings1.escapeMode;
        outputSettings0.escapeMode = escapeMode3;
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        java.nio.charset.Charset charset6 = outputSettings0.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings7.prettyPrint(true);
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
        outputSettings11.charsetEncoder = charsetEncoder25;
        outputSettings0.charsetEncoder = charsetEncoder25;
        java.lang.Class<?> wildcardClass28 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        outputSettings5.prettyPrint = false;
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 100, outputSettings5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        java.lang.String str6 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode9.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode9.parent();
        java.lang.String str13 = textNode9.getWholeText();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        textNode9.outerHtmlTail(stringBuilder14, 100, outputSettings16);
        java.lang.String str18 = textNode9.getTEXT_KEY();
        java.lang.String str19 = textNode9.gettext();
        org.jsoup.nodes.Node node20 = textNode9.clone();
        org.jsoup.nodes.Node node21 = textNode9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        textNode2.text = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = document14.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str13 = textNode12.text();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "text");
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
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
        java.lang.String str18 = textNode2.getTEXT_KEY();
        java.lang.String str19 = textNode2.toString();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode24.setBaseUri("hi!");
        org.jsoup.nodes.Node node27 = textNode24.parent();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        outputSettings30.escapeMode = escapeMode31;
        java.nio.charset.Charset charset33 = outputSettings30.charset();
        textNode24.outerHtmlTail(stringBuilder28, 10, outputSettings30);
        outputSettings30.prettyPrint = false;
        outputSettings30.indentAmount = 10;
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
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings47.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings47.escapeMode;
        java.nio.charset.Charset charset55 = outputSettings47.charset();
        outputSettings30.charset = charset55;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder20, (int) (byte) 100, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertNotNull(charsetEncoder53);
        org.junit.Assert.assertNull(escapeMode54);
        org.junit.Assert.assertNotNull(charset55);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
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
        // The following exception was thrown during execution in test generation
        try {
            textNode15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = node18.outerHtml();
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str13 = textNode12.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode;
        outputSettings21.escapeMode = escapeMode24;
        outputSettings19.setescapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        outputSettings27.prettyPrint = false;
        java.nio.charset.Charset charset31 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings19.charset(charset31);
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings16.escapeMode(escapeMode33);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode37.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = textNode37.parent();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = null;
        outputSettings43.escapeMode = escapeMode44;
        java.nio.charset.Charset charset46 = outputSettings43.charset();
        textNode37.outerHtmlTail(stringBuilder41, 10, outputSettings43);
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings43.getcharsetEncoder();
        outputSettings34.charsetEncoder = charsetEncoder48;
        textNode12.outerHtmlTail(stringBuilder14, (int) (byte) 0, outputSettings34);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings34.prettyPrint(false);
        boolean boolean53 = outputSettings34.getprettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder8, (int) '#', outputSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "text" + "'", str13, "text");
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        int int7 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str3 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.settext("");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = null;
        outputSettings11.escapeMode = escapeMode12;
        java.nio.charset.Charset charset14 = outputSettings11.charset;
        int int15 = outputSettings11.indentAmount();
        java.nio.charset.Charset charset16 = outputSettings11.charset();
        boolean boolean17 = outputSettings11.prettyPrint();
        textNode2.outerHtmlTail(stringBuilder9, (int) (short) -1, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
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
        boolean boolean20 = textNode2.hasAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        outputSettings0.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode;
        outputSettings8.escapeMode = escapeMode11;
        outputSettings6.setescapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        outputSettings14.prettyPrint = false;
        java.nio.charset.Charset charset18 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings6.charset(charset18);
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode22.setBaseUri("hi!");
        org.jsoup.nodes.Node node25 = textNode22.parent();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        outputSettings28.escapeMode = escapeMode29;
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        textNode22.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings28.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings28.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode;
        outputSettings37.escapeMode = escapeMode40;
        outputSettings35.setescapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        outputSettings43.prettyPrint = false;
        java.nio.charset.Charset charset47 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.charset(charset47);
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        outputSettings28.setescapeMode(escapeMode49);
        outputSettings19.setescapeMode(escapeMode49);
        outputSettings19.indentAmount = 10;
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
        java.nio.charset.CharsetEncoder charsetEncoder68 = outputSettings62.charsetEncoder;
        outputSettings19.setcharsetEncoder(charsetEncoder68);
        outputSettings0.setcharsetEncoder(charsetEncoder68);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(charsetEncoder67);
        org.junit.Assert.assertNotNull(charsetEncoder68);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        int int5 = outputSettings0.indentAmount();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
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
        textNode2.settext("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str16 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode18 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        java.lang.String str14 = textNode10.getWholeText();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        textNode10.outerHtmlTail(stringBuilder15, 100, outputSettings17);
        java.lang.String str19 = textNode10.outerHtml();
        org.jsoup.nodes.Document document20 = textNode10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        textNode2.settext("text");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode11.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = textNode11.parent();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        outputSettings17.escapeMode = escapeMode18;
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        textNode11.outerHtmlTail(stringBuilder15, 10, outputSettings17);
        outputSettings17.prettyPrint = false;
        outputSettings17.indentAmount = 10;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode;
        outputSettings28.escapeMode = escapeMode31;
        outputSettings26.setescapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings26.indentAmount((int) (short) 0);
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
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        outputSettings51.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder55 = outputSettings51.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder56 = outputSettings51.getcharsetEncoder();
        outputSettings44.setcharsetEncoder(charsetEncoder56);
        outputSettings35.setcharsetEncoder(charsetEncoder56);
        java.nio.charset.Charset charset59 = outputSettings35.getcharset();
        outputSettings17.charset = charset59;
        boolean boolean61 = outputSettings17.prettyPrint;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder7, (int) (byte) 1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder55);
        org.junit.Assert.assertNotNull(charsetEncoder56);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
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
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        java.lang.String str18 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.parent();
        java.lang.String str12 = textNode8.getWholeText();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        textNode8.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        org.jsoup.nodes.Node node18 = textNode8.removeAttr("hi!");
        java.lang.String str19 = textNode8.baseUri();
        java.lang.String str20 = textNode8.getWholeText();
        org.jsoup.nodes.Node node23 = textNode8.attr("text", "");
        java.lang.String str24 = textNode8.gettext();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean28 = textNode8.equals((java.lang.Object) "hi!");
        java.lang.String str29 = textNode8.text;
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        outputSettings32.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder36 = outputSettings32.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings32.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode;
        java.nio.charset.Charset charset41 = outputSettings38.charset;
        outputSettings32.setcharset(charset41);
        textNode8.outerHtmlTail(stringBuilder30, (int) (short) 100, outputSettings32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = textNode2.after((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder36);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.absUrl("text");
        boolean boolean8 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.text;
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.attr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str9 = textNode8.gettext();
        org.jsoup.nodes.Node node11 = textNode8.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode5.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        boolean boolean10 = outputSettings7.prettyPrint;
        textNode2.outerHtmlTail(stringBuilder5, 10, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode;
        outputSettings10.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings10.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.escapeMode(escapeMode15);
        int int17 = outputSettings16.indentAmount;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
        java.lang.String str18 = textNode2.getTEXT_KEY();
        boolean boolean19 = textNode2.isBlank();
        org.jsoup.nodes.Node node20 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
        int int17 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        java.lang.String str44 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "text" + "'", str44, "text");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode5.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode5.parent();
        java.lang.String str9 = textNode5.getWholeText();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        textNode5.outerHtmlTail(stringBuilder10, 100, outputSettings12);
        org.jsoup.nodes.Node node15 = textNode5.removeAttr("hi!");
        java.lang.String str16 = textNode5.baseUri();
        java.lang.String str17 = textNode5.getWholeText();
        org.jsoup.nodes.Attributes attributes18 = textNode5.attributes();
        textNode5.text = "text";
        java.lang.String str21 = textNode5.getTEXT_KEY();
        boolean boolean22 = textNode5.isBlank();
        org.jsoup.nodes.Node node23 = textNode5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = textNode2.after((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "text" + "'", str21, "text");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset8 = outputSettings5.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.indentAmount(1);
        boolean boolean12 = textNode2.equals((java.lang.Object) outputSettings11);
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder13, (int) '#', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode20.parent();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings26.escapeMode = escapeMode27;
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        textNode20.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings26.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder32 = outputSettings26.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings26.escapeMode;
        boolean boolean34 = textNode2.equals((java.lang.Object) escapeMode33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNull(escapeMode33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "text");
        java.lang.String str3 = textNode2.baseUri();
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
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
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
        java.lang.String str18 = textNode2.gettext();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "text");
        java.lang.String str4 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str8 = textNode7.gettext();
        java.lang.String str10 = textNode7.absUrl("#text");
        boolean boolean11 = textNode7.isBlank();
        org.jsoup.nodes.Node node12 = textNode7.parent();
        java.lang.String str13 = textNode7.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.after((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        textNode2.text = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        int int11 = node10.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
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
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node23 = textNode21.removeAttr("text");
        java.lang.String str24 = textNode21.toString();
        java.lang.String str25 = textNode21.nodeName();
        org.jsoup.nodes.Attributes attributes26 = textNode21.attributes();
        org.jsoup.nodes.Node node27 = textNode21.parent();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings7.escapeMode;
        outputSettings6.escapeMode = escapeMode9;
        outputSettings6.prettyPrint = true;
        textNode2.outerHtmlTail(stringBuilder4, (int) 'a', outputSettings6);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings6.indentAmount(100);
        outputSettings15.setprettyPrint(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
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
        java.lang.String str17 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
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
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.attr("", "text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder8, (int) '#', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
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
        org.jsoup.nodes.Node node25 = textNode2.attr("text", "#text");
        java.lang.Class<?> wildcardClass26 = textNode2.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str6 = textNode5.getTEXT_KEY();
        java.lang.StringBuilder stringBuilder7 = null;
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
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode30.setBaseUri("hi!");
        org.jsoup.nodes.Node node33 = textNode30.parent();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = null;
        outputSettings36.escapeMode = escapeMode37;
        java.nio.charset.Charset charset39 = outputSettings36.charset();
        textNode30.outerHtmlTail(stringBuilder34, 10, outputSettings36);
        java.nio.charset.CharsetEncoder charsetEncoder41 = outputSettings36.getcharsetEncoder();
        outputSettings27.charsetEncoder = charsetEncoder41;
        textNode5.outerHtmlTail(stringBuilder7, (int) (byte) 0, outputSettings27);
        org.jsoup.nodes.Node node46 = textNode5.attr("text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = textNode2.after(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
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
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(charsetEncoder41);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
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
        java.lang.String str15 = textNode2.getWholeText();
        int int16 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = textNode20.parent();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = null;
        outputSettings26.escapeMode = escapeMode27;
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        textNode20.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        int int31 = textNode20.siblingIndex();
        textNode20.ensureAttributes();
        boolean boolean33 = textNode2.equals((java.lang.Object) textNode20);
        // The following exception was thrown during execution in test generation
        try {
            textNode20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
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
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.settext("");
        textNode2.setBaseUri("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = node4.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean10 = textNode2.hasAttr("#text");
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        outputSettings0.setprettyPrint(true);
        int int5 = outputSettings0.getindentAmount();
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset(charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        boolean boolean7 = outputSettings0.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        outputSettings8.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder12 = outputSettings8.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder13 = outputSettings8.getcharsetEncoder();
        java.nio.charset.Charset charset14 = outputSettings8.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings8.escapeMode();
        outputSettings0.escapeMode = escapeMode15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder12);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode14.setBaseUri("hi!");
        org.jsoup.nodes.Node node17 = textNode14.parent();
        java.lang.String str18 = textNode14.getWholeText();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        textNode14.outerHtmlTail(stringBuilder19, 100, outputSettings21);
        org.jsoup.nodes.Node node24 = textNode14.removeAttr("hi!");
        java.lang.String str25 = textNode14.baseUri();
        org.jsoup.nodes.Node node26 = textNode14.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode14.childNodes();
        org.jsoup.nodes.Node node28 = textNode14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode2.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
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
        java.lang.String str20 = textNode18.absUrl("#text");
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode23.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = textNode23.parent();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = null;
        outputSettings29.escapeMode = escapeMode30;
        java.nio.charset.Charset charset32 = outputSettings29.charset();
        textNode23.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        java.lang.String str35 = textNode23.attr("");
        boolean boolean37 = textNode23.hasAttr("#text");
        java.lang.String str38 = textNode23.outerHtml();
        org.jsoup.nodes.Node node39 = textNode23.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = textNode18.before(node39);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
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
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        textNode16.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings22.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings22.getcharsetEncoder();
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
        outputSettings22.setescapeMode(escapeMode43);
        outputSettings13.setescapeMode(escapeMode43);
        outputSettings13.indentAmount = 10;
        int int48 = outputSettings13.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings13.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
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
        java.lang.String str18 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("text", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode18.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = textNode18.parent();
        java.lang.String str22 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        textNode18.outerHtmlTail(stringBuilder23, 100, outputSettings25);
        java.lang.String str27 = textNode18.outerHtml();
        org.jsoup.nodes.Node node29 = textNode18.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = textNode2.after((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.absUrl("text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode17.setBaseUri("hi!");
        boolean boolean21 = textNode17.hasAttr("text");
        textNode17.ensureAttributes();
        java.lang.String str23 = textNode17.text;
        org.jsoup.nodes.TextNode textNode25 = textNode17.text("");
        textNode25.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node14.after((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(textNode25);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
        boolean boolean15 = outputSettings14.prettyPrint;
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode18.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = textNode18.parent();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = null;
        outputSettings24.escapeMode = escapeMode25;
        java.nio.charset.Charset charset27 = outputSettings24.charset();
        textNode18.outerHtmlTail(stringBuilder22, 10, outputSettings24);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings24.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings24.getcharsetEncoder();
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
        outputSettings24.setescapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings53.escapeMode;
        outputSettings52.escapeMode = escapeMode55;
        outputSettings50.setescapeMode(escapeMode55);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        outputSettings58.prettyPrint = false;
        java.nio.charset.Charset charset62 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings50.charset(charset62);
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings47.escapeMode(escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings24.escapeMode(escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder68 = outputSettings67.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = outputSettings70.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode72 = outputSettings70.escapeMode;
        outputSettings69.escapeMode = escapeMode72;
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings67.escapeMode(escapeMode72);
        java.nio.charset.Charset charset75 = outputSettings74.getcharset();
        outputSettings66.charset = charset75;
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings66.indentAmount((int) '#');
        org.jsoup.nodes.TextNode textNode81 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode81.setBaseUri("hi!");
        org.jsoup.nodes.Node node84 = textNode81.parent();
        java.lang.StringBuilder stringBuilder85 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode88 = null;
        outputSettings87.escapeMode = escapeMode88;
        java.nio.charset.Charset charset90 = outputSettings87.charset();
        textNode81.outerHtmlTail(stringBuilder85, 10, outputSettings87);
        outputSettings87.prettyPrint = false;
        outputSettings87.indentAmount = 10;
        java.nio.charset.CharsetEncoder charsetEncoder96 = outputSettings87.getcharsetEncoder();
        outputSettings66.charsetEncoder = charsetEncoder96;
        outputSettings14.setcharsetEncoder(charsetEncoder96);
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
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(charsetEncoder68);
        org.junit.Assert.assertTrue("'" + escapeMode71 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode71.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode72 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode72.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(charset75);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(charset90);
        org.junit.Assert.assertNotNull(charsetEncoder96);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
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
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode19.setBaseUri("hi!");
        org.jsoup.nodes.Node node22 = textNode19.parent();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = null;
        outputSettings25.escapeMode = escapeMode26;
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        textNode19.outerHtmlTail(stringBuilder23, 10, outputSettings25);
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings25.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings25.charset();
        outputSettings8.charset = charset33;
        outputSettings8.prettyPrint = false;
        java.lang.Class<?> wildcardClass37 = outputSettings8.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertNull(escapeMode32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode5.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodes();
        java.lang.String str9 = textNode5.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = textNode5.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.siblingNodes();
        java.lang.String str12 = textNode5.baseUri();
        org.jsoup.nodes.Node node13 = textNode5.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.text;
        java.lang.String str6 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        outputSettings19.escapeMode = escapeMode20;
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        textNode13.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        java.lang.String str24 = textNode13.text();
        textNode13.ensureAttributes();
        org.jsoup.nodes.Node node27 = textNode13.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode13.siblingNodes();
        java.lang.String str29 = textNode13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.clone();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings4.getcharsetEncoder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = document3.equals((java.lang.Object) outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = textNode15.parent();
        java.lang.String str19 = textNode15.getWholeText();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        textNode15.outerHtmlTail(stringBuilder20, 100, outputSettings22);
        org.jsoup.nodes.Node node25 = textNode15.removeAttr("hi!");
        java.lang.String str26 = textNode15.baseUri();
        org.jsoup.nodes.Node node27 = textNode15.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode15.childNodes();
        org.jsoup.nodes.Node node29 = textNode15.clone();
        boolean boolean31 = textNode15.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
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
        java.lang.String str22 = textNode2.attr("");
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        outputSettings35.setindentAmount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings35.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.attr("");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        outputSettings9.escapeMode = escapeMode10;
        java.nio.charset.Charset charset12 = outputSettings9.charset;
        int int13 = outputSettings9.indentAmount();
        java.nio.charset.Charset charset14 = outputSettings9.charset();
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings9.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = null;
        outputSettings16.escapeMode = escapeMode17;
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings16.charsetEncoder;
        java.nio.charset.Charset charset20 = outputSettings16.charset;
        boolean boolean21 = outputSettings16.getprettyPrint();
        outputSettings16.setindentAmount(1);
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode26.setBaseUri("hi!");
        org.jsoup.nodes.Node node29 = textNode26.parent();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = null;
        outputSettings32.escapeMode = escapeMode33;
        java.nio.charset.Charset charset35 = outputSettings32.charset();
        textNode26.outerHtmlTail(stringBuilder30, 10, outputSettings32);
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings32.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings32.charsetEncoder;
        outputSettings16.setcharsetEncoder(charsetEncoder38);
        outputSettings9.charsetEncoder = charsetEncoder38;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder7, 10, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(charsetEncoder37);
        org.junit.Assert.assertNotNull(charsetEncoder38);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode9.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode9.parent();
        java.lang.String str13 = textNode9.getWholeText();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        textNode9.outerHtmlTail(stringBuilder14, 100, outputSettings16);
        org.jsoup.nodes.Node node19 = textNode9.removeAttr("hi!");
        java.lang.String str20 = textNode9.baseUri();
        java.lang.String str21 = textNode9.getWholeText();
        org.jsoup.nodes.Attributes attributes22 = textNode9.attributes();
        textNode9.text = "text";
        textNode9.settext("#text");
        int int27 = textNode9.childNodeSize();
        boolean boolean28 = textNode2.equals((java.lang.Object) int27);
        textNode2.text = "";
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
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
        java.lang.String str17 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
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
        java.lang.String str17 = textNode2.gettext();
        textNode2.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.text;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        java.lang.String str18 = textNode2.getWholeText();
        org.jsoup.nodes.Node node19 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
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
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
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
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
        org.jsoup.nodes.Node node25 = textNode2.attr("text", "#text");
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode28.setBaseUri("hi!");
        org.jsoup.nodes.Node node31 = textNode28.parent();
        java.lang.String str32 = textNode28.getWholeText();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        textNode28.outerHtmlTail(stringBuilder33, 100, outputSettings35);
        org.jsoup.nodes.Node node38 = textNode28.removeAttr("hi!");
        java.lang.String str39 = textNode28.baseUri();
        java.lang.String str40 = textNode28.getWholeText();
        org.jsoup.nodes.Node node43 = textNode28.attr("text", "");
        org.jsoup.nodes.Document document44 = node43.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node25.after(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(document44);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        org.jsoup.nodes.Attributes attributes16 = textNode12.attributes();
        org.jsoup.nodes.TextNode textNode18 = textNode12.text("");
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Attributes attributes23 = textNode22.attributes();
        org.jsoup.nodes.Document document24 = textNode22.ownerDocument();
        java.lang.String str25 = textNode22.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#text" + "'", str25, "#text");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
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
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode18.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = textNode18.parent();
        java.lang.String str22 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        textNode18.outerHtmlTail(stringBuilder23, 100, outputSettings25);
        org.jsoup.nodes.Node node28 = textNode18.removeAttr("hi!");
        java.lang.String str29 = textNode18.baseUri();
        int int30 = textNode18.childNodeSize();
        textNode18.ensureAttributes();
        org.jsoup.nodes.Document document32 = textNode18.ownerDocument();
        int int33 = textNode18.childNodeSize();
        java.lang.String str34 = textNode18.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node15.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings0.charsetEncoder;
        java.nio.charset.Charset charset7 = outputSettings0.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = node1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        java.lang.String str16 = textNode12.getWholeText();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        textNode12.outerHtmlTail(stringBuilder17, 100, outputSettings19);
        org.jsoup.nodes.Node node22 = textNode12.removeAttr("hi!");
        java.lang.String str23 = textNode12.baseUri();
        java.lang.String str24 = textNode12.getTEXT_KEY();
        java.lang.String str25 = textNode12.toString();
        java.lang.String str26 = textNode12.gettext();
        org.jsoup.nodes.Node node29 = textNode12.attr("text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "text" + "'", str24, "text");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.Charset charset5 = outputSettings0.charset();
        int int6 = outputSettings0.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = null;
        outputSettings7.escapeMode = escapeMode8;
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings7.charsetEncoder;
        outputSettings0.setcharsetEncoder(charsetEncoder10);
        outputSettings0.indentAmount = (short) -1;
        outputSettings0.prettyPrint = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings0.escapeMode;
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder10);
        org.junit.Assert.assertNull(escapeMode16);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        org.jsoup.nodes.Attributes attributes14 = textNode10.attributes();
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode10.attributes();
        java.lang.String str18 = textNode10.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
        int int43 = outputSettings42.getindentAmount();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = null;
        outputSettings22.escapeMode = escapeMode23;
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        textNode16.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings22.getcharsetEncoder();
        boolean boolean28 = outputSettings22.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder12, (int) (short) -1, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
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
        java.lang.String str16 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder17 = null;
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
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings27.getcharsetEncoder();
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
        outputSettings27.setescapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings53.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings56.escapeMode;
        outputSettings55.escapeMode = escapeMode58;
        outputSettings53.setescapeMode(escapeMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        outputSettings61.prettyPrint = false;
        java.nio.charset.Charset charset65 = outputSettings61.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings53.charset(charset65);
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings66.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings50.escapeMode(escapeMode67);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings27.escapeMode(escapeMode67);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode71 = null;
        outputSettings70.escapeMode = escapeMode71;
        java.nio.charset.CharsetEncoder charsetEncoder73 = outputSettings70.charsetEncoder;
        java.nio.charset.Charset charset74 = outputSettings70.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings69.charset(charset74);
        org.jsoup.nodes.Entities.EscapeMode escapeMode76 = outputSettings75.getescapeMode();
        boolean boolean77 = outputSettings75.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder17, 1, outputSettings75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertTrue("'" + escapeMode67 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode67.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(charsetEncoder73);
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertTrue("'" + escapeMode76 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode76.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
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
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = null;
        outputSettings25.escapeMode = escapeMode26;
        java.nio.charset.Charset charset28 = outputSettings25.charset;
        int int29 = outputSettings25.indentAmount();
        java.nio.charset.Charset charset30 = outputSettings25.charset();
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings25.indentAmount((int) (byte) 0);
        textNode2.outerHtmlTail(stringBuilder23, (int) (short) 1, outputSettings33);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode37.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = textNode37.parent();
        java.lang.String str41 = textNode37.getWholeText();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        textNode37.outerHtmlTail(stringBuilder42, 100, outputSettings44);
        org.jsoup.nodes.Node node47 = textNode37.removeAttr("hi!");
        java.lang.String str48 = textNode37.baseUri();
        java.lang.String str49 = textNode37.getWholeText();
        org.jsoup.nodes.Node node52 = textNode37.attr("text", "");
        java.lang.String str53 = textNode37.gettext();
        textNode37.setBaseUri("");
        org.jsoup.nodes.Node node56 = textNode37.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = textNode37.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = textNode2.after((org.jsoup.nodes.Node) textNode37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(nodeList57);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
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
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        org.jsoup.nodes.Node node23 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode25 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.CharsetEncoder charsetEncoder3 = outputSettings0.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = null;
        outputSettings4.escapeMode = escapeMode5;
        java.nio.charset.Charset charset7 = outputSettings4.charset;
        int int8 = outputSettings4.indentAmount();
        java.nio.charset.Charset charset9 = outputSettings4.charset();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings4.charsetEncoder;
        outputSettings0.setcharsetEncoder(charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charsetEncoder3);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList1 = textNode0.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            textNode0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList1);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str13 = textNode2.text;
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.String str20 = textNode16.getWholeText();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        textNode16.outerHtmlTail(stringBuilder21, 100, outputSettings23);
        org.jsoup.nodes.TextNode textNode26 = textNode16.text("");
        int int27 = textNode26.childNodeSize();
        org.jsoup.nodes.Node node28 = textNode26.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode2.before((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode11.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = textNode11.parent();
        java.lang.String str15 = textNode11.getWholeText();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        textNode11.outerHtmlTail(stringBuilder16, 100, outputSettings18);
        java.lang.String str20 = textNode11.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
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
        java.lang.String str16 = textNode2.text();
        java.lang.String str17 = textNode2.text;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder9, 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
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
        java.lang.String str15 = textNode2.getWholeText();
        int int16 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        boolean boolean18 = textNode2.isBlank();
        org.jsoup.nodes.Node node21 = textNode2.attr("text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.attr("#text");
        java.lang.String str7 = textNode2.nodeName();
        int int8 = textNode2.siblingIndex();
        int int9 = textNode2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        boolean boolean16 = textNode2.hasAttr("#text");
        java.lang.String str17 = textNode2.outerHtml();
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.outerHtml();
        textNode2.text = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "text" + "'", str5, "text");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        textNode2.settext("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode18.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = textNode18.parent();
        java.lang.String str22 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        textNode18.outerHtmlTail(stringBuilder23, 100, outputSettings25);
        org.jsoup.nodes.Node node28 = textNode18.removeAttr("hi!");
        java.lang.String str29 = textNode18.baseUri();
        org.jsoup.nodes.Node node30 = textNode18.previousSibling();
        org.jsoup.nodes.Node node31 = textNode18.previousSibling();
        java.lang.String str32 = textNode18.text();
        java.lang.String str33 = textNode18.baseUri();
        java.lang.String str34 = textNode18.text();
        textNode18.settext("text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
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
        org.jsoup.nodes.Node node21 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode23 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "text" + "'", str19, "text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        int int7 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        org.jsoup.nodes.Node node25 = textNode2.attr("text", "#text");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass13 = textNode2.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings0.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.getcharsetEncoder();
        java.nio.charset.Charset charset6 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings0.escapeMode();
        outputSettings0.setprettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings0.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        textNode2.settext("text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode2.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        textNode2.text = "";
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode23.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = textNode23.parent();
        java.lang.String str27 = textNode23.getWholeText();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        textNode23.outerHtmlTail(stringBuilder28, 100, outputSettings30);
        org.jsoup.nodes.Node node33 = textNode23.removeAttr("hi!");
        java.lang.String str34 = textNode23.baseUri();
        org.jsoup.nodes.TextNode textNode36 = textNode23.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = textNode20.after((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(textNode36);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.StringBuilder stringBuilder5 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder5, 1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
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
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings51.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings54.escapeMode;
        outputSettings53.escapeMode = escapeMode56;
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings51.escapeMode(escapeMode56);
        java.nio.charset.Charset charset59 = outputSettings58.getcharset();
        outputSettings50.charset = charset59;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings50.indentAmount((int) '#');
        java.nio.charset.CharsetEncoder charsetEncoder63 = outputSettings62.charsetEncoder;
        outputSettings62.indentAmount = (byte) 1;
        int int66 = outputSettings62.getindentAmount();
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
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charset59);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(charsetEncoder63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode12.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
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
        java.lang.String str16 = textNode2.toString();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings0.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.encoder();
        java.lang.Class<?> wildcardClass6 = charsetEncoder5.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        boolean boolean20 = textNode2.hasAttr("text");
        java.lang.String str21 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
        outputSettings18.setprettyPrint(true);
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
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
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
        boolean boolean55 = textNode2.equals((java.lang.Object) outputSettings38);
        outputSettings38.indentAmount = (short) -1;
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        outputSettings0.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.charsetEncoder;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charsetEncoder5);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
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
        java.lang.String str18 = textNode2.nodeName();
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
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
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        java.nio.charset.Charset charset22 = outputSettings21.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings21.getcharsetEncoder();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder16, 100, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charsetEncoder23);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        outputSettings0.prettyPrint = false;
        java.nio.charset.Charset charset4 = outputSettings0.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings0.escapeMode;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode;
        outputSettings14.escapeMode = escapeMode17;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.escapeMode(escapeMode17);
        boolean boolean20 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "text");
        java.lang.String str6 = textNode5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "text" + "'", str6, "text");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
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
        java.lang.String str17 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        outputSettings15.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings15.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings15.getcharsetEncoder();
        outputSettings8.setcharsetEncoder(charsetEncoder20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
        java.nio.charset.CharsetEncoder charsetEncoder51 = outputSettings50.encoder();
        boolean boolean52 = outputSettings50.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings50.clone();
        outputSettings53.setindentAmount((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(charsetEncoder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(outputSettings53);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        int int13 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
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
        int int15 = outputSettings8.indentAmount();
        boolean boolean16 = outputSettings8.prettyPrint();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        outputSettings11.prettyPrint = false;
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        outputSettings9.setcharset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings9.prettyPrint(false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.childNodesCopy();
        boolean boolean11 = textNode8.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str14 = textNode13.text;
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings17.escapeMode = escapeMode20;
        outputSettings17.prettyPrint = true;
        textNode13.outerHtmlTail(stringBuilder15, (int) 'a', outputSettings17);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings17.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings27.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings26.escapeMode(escapeMode29);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder9, (int) (byte) 0, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
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
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode;
        outputSettings23.escapeMode = escapeMode26;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset29 = outputSettings23.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings30.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings30.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode37.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = textNode37.parent();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = null;
        outputSettings43.escapeMode = escapeMode44;
        java.nio.charset.Charset charset46 = outputSettings43.charset();
        textNode37.outerHtmlTail(stringBuilder41, 10, outputSettings43);
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings43.getcharsetEncoder();
        outputSettings34.charsetEncoder = charsetEncoder48;
        outputSettings23.charsetEncoder = charsetEncoder48;
        int int51 = outputSettings23.getindentAmount();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder21, (int) (short) 0, outputSettings23);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(charsetEncoder48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
        outputSettings15.prettyPrint = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings15.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
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
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "text");
        org.jsoup.nodes.Node node18 = textNode2.parent();
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode22.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode22.childNodes();
        java.lang.String str26 = textNode22.outerHtml();
        org.jsoup.nodes.Attributes attributes27 = textNode22.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode22.siblingNodes();
        java.lang.String str29 = textNode22.baseUri();
        textNode22.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings3.escapeMode;
        outputSettings2.escapeMode = escapeMode5;
        outputSettings0.setescapeMode(escapeMode5);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings0.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode;
        outputSettings10.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings10.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings9.escapeMode(escapeMode15);
        outputSettings16.setindentAmount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode;
        outputSettings10.escapeMode = escapeMode13;
        outputSettings8.setescapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings8.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode;
        outputSettings18.setprettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings17.escapeMode(escapeMode23);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder6, (int) ' ', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode();
        java.lang.String str17 = textNode16.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode15.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str16 = textNode15.text;
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode;
        outputSettings19.escapeMode = escapeMode22;
        outputSettings19.prettyPrint = true;
        textNode15.outerHtmlTail(stringBuilder17, (int) 'a', outputSettings19);
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode29.setBaseUri("hi!");
        org.jsoup.nodes.Node node32 = textNode29.parent();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = null;
        outputSettings35.escapeMode = escapeMode36;
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        textNode29.outerHtmlTail(stringBuilder33, 10, outputSettings35);
        java.nio.charset.CharsetEncoder charsetEncoder40 = outputSettings35.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder41 = outputSettings35.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = null;
        outputSettings42.escapeMode = escapeMode43;
        java.nio.charset.Charset charset45 = outputSettings42.charset;
        int int46 = outputSettings42.indentAmount();
        java.nio.charset.Charset charset47 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.charset(charset47);
        boolean boolean49 = textNode15.equals((java.lang.Object) outputSettings48);
        int int50 = outputSettings48.getindentAmount();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder11, (int) '#', outputSettings48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(charsetEncoder40);
        org.junit.Assert.assertNotNull(charsetEncoder41);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.text();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str18 = textNode17.getTEXT_KEY();
        java.lang.String str19 = textNode17.text;
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str16 = textNode2.attr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = null;
        outputSettings17.escapeMode = escapeMode18;
        java.nio.charset.Charset charset20 = outputSettings17.charset;
        boolean boolean21 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings17.getescapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = null;
        outputSettings23.escapeMode = escapeMode24;
        java.nio.charset.Charset charset26 = outputSettings23.charset;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode;
        outputSettings27.escapeMode = escapeMode30;
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings27.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings23.escapeMode(escapeMode32);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings17.escapeMode(escapeMode32);
        boolean boolean35 = textNode2.equals((java.lang.Object) outputSettings34);
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.TextNode textNode43 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode43.setBaseUri("hi!");
        org.jsoup.nodes.Node node46 = textNode43.parent();
        java.lang.String str47 = textNode43.getWholeText();
        java.lang.StringBuilder stringBuilder48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        textNode43.outerHtmlTail(stringBuilder48, 100, outputSettings50);
        textNode38.outerHtmlTail(stringBuilder39, (int) (byte) 0, outputSettings50);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(escapeMode22);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
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
        org.jsoup.nodes.Node node17 = textNode2.attr("text", "text");
        org.jsoup.nodes.Node node18 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        java.lang.Object obj8 = null;
        boolean boolean9 = textNode2.equals(obj8);
        java.lang.String str11 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("");
        java.lang.String str16 = textNode13.text();
        java.lang.String str18 = textNode13.absUrl("text");
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
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
        java.nio.charset.Charset charset14 = outputSettings0.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.parent();
        java.lang.String str12 = textNode8.getWholeText();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        textNode8.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        org.jsoup.nodes.TextNode textNode18 = textNode8.text("");
        int int19 = textNode18.childNodeSize();
        java.lang.String str20 = textNode18.nodeName();
        textNode18.settext("");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset26 = outputSettings23.charset;
        java.nio.charset.CharsetEncoder charsetEncoder27 = outputSettings23.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount((int) (short) 10);
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings23.charsetEncoder;
        boolean boolean31 = textNode18.equals((java.lang.Object) charsetEncoder30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
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
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node21 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode25.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = textNode25.parent();
        java.lang.String str29 = textNode25.getWholeText();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        textNode25.outerHtmlTail(stringBuilder30, 100, outputSettings32);
        org.jsoup.nodes.TextNode textNode35 = textNode25.text("");
        int int36 = textNode35.childNodeSize();
        org.jsoup.nodes.Node node37 = textNode35.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = textNode2.before(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        java.lang.String str9 = textNode2.text;
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
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
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode19.setBaseUri("hi!");
        org.jsoup.nodes.Node node22 = textNode19.parent();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = null;
        outputSettings25.escapeMode = escapeMode26;
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        textNode19.outerHtmlTail(stringBuilder23, 10, outputSettings25);
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings25.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder31 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings25.escapeMode;
        java.nio.charset.Charset charset33 = outputSettings25.charset();
        outputSettings8.charset = charset33;
        java.lang.Class<?> wildcardClass35 = charset33.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertNull(escapeMode32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
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
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node17.childNode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        textNode2.outerHtmlTail(stringBuilder15, (int) (byte) 10, outputSettings17);
        int int20 = outputSettings17.getindentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
        org.jsoup.nodes.Node node15 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.wrap("text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "text" + "'", str14, "text");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
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
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings0.escapeMode;
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.parent();
        java.lang.String str12 = textNode8.getWholeText();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        textNode8.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        org.jsoup.nodes.Node node18 = textNode8.removeAttr("hi!");
        java.lang.String str19 = textNode8.baseUri();
        java.lang.String str20 = textNode8.getTEXT_KEY();
        java.lang.String str21 = textNode8.toString();
        int int22 = textNode8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
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
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode;
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings20.charsetEncoder;
        outputSettings20.setindentAmount(1);
        outputSettings20.prettyPrint = true;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder18, (-1), outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder23);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
        node9.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset8 = outputSettings5.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.indentAmount(1);
        boolean boolean12 = textNode2.equals((java.lang.Object) outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.before(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        java.lang.String str6 = textNode2.attr("");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode10.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        java.lang.String str14 = textNode10.getWholeText();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        textNode10.outerHtmlTail(stringBuilder15, 100, outputSettings17);
        java.lang.String str19 = textNode10.outerHtml();
        java.lang.String str20 = textNode10.toString();
        java.lang.String str21 = textNode10.toString();
        org.jsoup.nodes.TextNode textNode23 = textNode10.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            document7.replaceWith((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(textNode23);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode18.setBaseUri("hi!");
        org.jsoup.nodes.Node node21 = textNode18.parent();
        java.lang.String str22 = textNode18.getWholeText();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        textNode18.outerHtmlTail(stringBuilder23, 100, outputSettings25);
        outputSettings25.prettyPrint = true;
        boolean boolean29 = outputSettings25.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder30 = outputSettings25.getcharsetEncoder();
        textNode2.outerHtmlTail(stringBuilder14, (int) (byte) 1, outputSettings25);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charsetEncoder30);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode14.setBaseUri("hi!");
        org.jsoup.nodes.Node node17 = textNode14.parent();
        java.lang.String str18 = textNode14.getWholeText();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        textNode14.outerHtmlTail(stringBuilder19, 100, outputSettings21);
        org.jsoup.nodes.Node node24 = textNode14.removeAttr("hi!");
        java.lang.String str25 = textNode14.baseUri();
        java.lang.String str26 = textNode14.getWholeText();
        java.lang.String str27 = textNode14.getWholeText();
        int int28 = textNode14.childNodeSize();
        org.jsoup.nodes.Node node29 = textNode14.previousSibling();
        boolean boolean30 = textNode14.isBlank();
        org.jsoup.nodes.Node node31 = textNode14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
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
        java.lang.String str17 = textNode2.gettext();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode;
        outputSettings22.escapeMode = escapeMode25;
        outputSettings20.setescapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings20.indentAmount((int) (short) 0);
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode32.setBaseUri("hi!");
        org.jsoup.nodes.Node node35 = textNode32.parent();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = null;
        outputSettings38.escapeMode = escapeMode39;
        java.nio.charset.Charset charset41 = outputSettings38.charset();
        textNode32.outerHtmlTail(stringBuilder36, 10, outputSettings38);
        outputSettings38.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        outputSettings45.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder49 = outputSettings45.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder50 = outputSettings45.getcharsetEncoder();
        outputSettings38.setcharsetEncoder(charsetEncoder50);
        outputSettings29.setcharsetEncoder(charsetEncoder50);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings29.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder18, 0, outputSettings53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder49);
        org.junit.Assert.assertNotNull(charsetEncoder50);
        org.junit.Assert.assertNotNull(outputSettings53);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
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
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
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
        java.lang.String str15 = textNode2.getWholeText();
        int int16 = textNode2.childNodeSize();
        java.lang.String str17 = textNode2.text();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode20.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        outputSettings26.prettyPrint = false;
        java.nio.charset.Charset charset30 = outputSettings26.charset();
        textNode20.outerHtmlTail(stringBuilder24, (int) 'a', outputSettings26);
        textNode20.text = "text";
        textNode20.ensureAttributes();
        textNode20.text = "";
        org.jsoup.nodes.TextNode textNode38 = textNode20.text("#text");
        java.lang.String str40 = textNode38.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(textNode38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
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
        textNode2.ensureAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings6.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings9.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode;
        outputSettings8.escapeMode = escapeMode11;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.escapeMode(escapeMode11);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder4, (int) (short) 1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        int int15 = textNode2.childNodeSize();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
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
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.after((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
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
        java.lang.String str20 = textNode18.absUrl("#text");
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode23.isBlank();
        java.lang.String str26 = textNode23.attr("hi!");
        java.lang.String str27 = textNode23.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = textNode18.before((org.jsoup.nodes.Node) textNode23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode17.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = textNode17.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = null;
        outputSettings23.escapeMode = escapeMode24;
        java.nio.charset.Charset charset26 = outputSettings23.charset();
        textNode17.outerHtmlTail(stringBuilder21, 10, outputSettings23);
        int int28 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode17.removeAttr("#text");
        textNode17.settext("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = textNode2.before((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
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
        org.jsoup.nodes.Node node21 = textNode2.parent();
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        boolean boolean23 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str27 = textNode26.getTEXT_KEY();
        org.jsoup.nodes.Node node28 = textNode26.nextSibling();
        java.lang.String str29 = textNode26.text();
        textNode26.text = "";
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "text" + "'", str20, "text");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "text" + "'", str27, "text");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode19.setBaseUri("hi!");
        org.jsoup.nodes.Node node22 = textNode19.parent();
        java.lang.String str23 = textNode19.getWholeText();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        textNode19.outerHtmlTail(stringBuilder24, 100, outputSettings26);
        org.jsoup.nodes.Node node29 = textNode19.removeAttr("hi!");
        java.lang.String str30 = textNode19.baseUri();
        java.lang.String str31 = textNode19.getWholeText();
        org.jsoup.nodes.Attributes attributes32 = textNode19.attributes();
        textNode19.text = "text";
        java.lang.String str35 = textNode19.getTEXT_KEY();
        boolean boolean36 = textNode19.isBlank();
        org.jsoup.nodes.Node node37 = textNode19.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node16.before(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "text" + "'", str35, "text");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // The following exception was thrown during execution in test generation
        try {
            textNode0.ensureAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings46.escapeMode;
        outputSettings45.escapeMode = escapeMode48;
        outputSettings43.setescapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        outputSettings51.prettyPrint = false;
        java.nio.charset.Charset charset55 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings43.charset(charset55);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings56.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings40.escapeMode(escapeMode57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(10);
        java.nio.charset.CharsetEncoder charsetEncoder61 = outputSettings60.encoder();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.outerHtmlHead(stringBuilder38, 100, outputSettings60);
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
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder30);
        org.junit.Assert.assertNotNull(charsetEncoder31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + escapeMode57 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode57.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charsetEncoder61);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str19 = textNode18.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode18.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset24 = outputSettings21.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings21.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings21.indentAmount(1);
        boolean boolean28 = textNode18.equals((java.lang.Object) outputSettings27);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
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
        java.lang.String str18 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode21.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode21.childNodes();
        java.lang.String str25 = textNode21.outerHtml();
        org.jsoup.nodes.Attributes attributes26 = textNode21.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode21.siblingNodes();
        java.lang.String str28 = textNode21.baseUri();
        org.jsoup.nodes.Node node29 = textNode21.clone();
        java.lang.String str30 = textNode21.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = textNode2.before((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "text" + "'", str17, "text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "text" + "'", str30, "text");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
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
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings24.escapeMode;
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
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
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
        java.lang.String str18 = textNode2.getTEXT_KEY();
        java.lang.String str19 = textNode2.toString();
        boolean boolean21 = textNode2.hasAttr("");
        textNode2.text = "text";
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "text" + "'", str3, "text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
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
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
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
        java.lang.String str15 = textNode2.getWholeText();
        boolean boolean17 = textNode2.hasAttr("#text");
        java.lang.StringBuilder stringBuilder18 = null;
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
        java.nio.charset.Charset charset35 = outputSettings28.charset;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = null;
        outputSettings28.escapeMode = escapeMode36;
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings28.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings39.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode;
        outputSettings41.escapeMode = escapeMode44;
        outputSettings39.setescapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings28.escapeMode(escapeMode44);
        textNode2.outerHtmlTail(stringBuilder18, (int) (byte) 100, outputSettings47);
        java.lang.String str49 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode51 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = textNode2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(charsetEncoder38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(textNode51);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
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
        int int16 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode2.splitText(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        outputSettings16.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings16.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings16.getcharsetEncoder();
        java.nio.charset.Charset charset22 = outputSettings16.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings16.getescapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder24 = outputSettings16.charsetEncoder;
        boolean boolean25 = textNode2.equals((java.lang.Object) charsetEncoder24);
        org.jsoup.nodes.Node node26 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = node26.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(charsetEncoder21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        int int13 = textNode2.childNodeSize();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before("text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str10 = textNode9.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode12 = textNode9.text("#text");
        org.jsoup.nodes.Document document13 = textNode9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) document13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "text" + "'", str10, "text");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
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
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.after("");
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = null;
        outputSettings0.escapeMode = escapeMode1;
        java.nio.charset.Charset charset3 = outputSettings0.charset;
        int int4 = outputSettings0.indentAmount();
        boolean boolean5 = outputSettings0.prettyPrint;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset("text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: text");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        int int11 = textNode2.siblingIndex();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.text;
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.lang.String str17 = textNode2.attr("");
        java.lang.String str18 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.settext("");
        int int9 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        textNode2.outerHtmlTail(stringBuilder7, 100, outputSettings9);
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "text" + "'", str11, "text");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        outputSettings5.prettyPrint = false;
        textNode2.outerHtmlTail(stringBuilder3, (int) (byte) 100, outputSettings5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        java.lang.Object obj8 = null;
        boolean boolean9 = textNode2.equals(obj8);
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = null; // flaky: node12.childNode((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode16.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.String str20 = textNode16.getWholeText();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        textNode16.outerHtmlTail(stringBuilder21, 100, outputSettings23);
        org.jsoup.nodes.Node node26 = textNode16.removeAttr("hi!");
        java.lang.String str27 = textNode16.baseUri();
        org.jsoup.nodes.Node node28 = textNode16.previousSibling();
        org.jsoup.nodes.Node node29 = textNode16.previousSibling();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings32.escapeMode;
        textNode16.outerHtmlTail(stringBuilder30, (int) (byte) 100, outputSettings32);
        textNode16.settext("text");
        java.lang.String str39 = textNode16.absUrl("#text");
        java.lang.String str41 = textNode16.attr("text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = textNode2.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = outputSettings0.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
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
        outputSettings4.charsetEncoder = charsetEncoder18;
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode22.setBaseUri("hi!");
        org.jsoup.nodes.Node node25 = textNode22.parent();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = null;
        outputSettings28.escapeMode = escapeMode29;
        java.nio.charset.Charset charset31 = outputSettings28.charset();
        textNode22.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        java.nio.charset.CharsetEncoder charsetEncoder33 = outputSettings28.getcharsetEncoder();
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings28.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = outputSettings38.escapeMode;
        outputSettings37.escapeMode = escapeMode40;
        outputSettings35.setescapeMode(escapeMode40);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        outputSettings43.prettyPrint = false;
        java.nio.charset.Charset charset47 = outputSettings43.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.charset(charset47);
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        outputSettings28.setescapeMode(escapeMode49);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings54.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings57.escapeMode;
        outputSettings56.escapeMode = escapeMode59;
        outputSettings54.setescapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings62.escapeMode();
        outputSettings62.prettyPrint = false;
        java.nio.charset.Charset charset66 = outputSettings62.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings54.charset(charset66);
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings67.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings51.escapeMode(escapeMode68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings28.escapeMode(escapeMode68);
        outputSettings4.escapeMode = escapeMode68;
        boolean boolean72 = outputSettings4.prettyPrint();
        int int73 = outputSettings4.getindentAmount();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(charsetEncoder33);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + escapeMode55 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode55.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode59 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode59.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertTrue("'" + escapeMode68 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode68.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
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
        java.lang.String str32 = textNode13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = textNode13.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        textNode2.settext("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        outputSettings15.prettyPrint = false;
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings15.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder20 = outputSettings15.getcharsetEncoder();
        outputSettings8.setcharsetEncoder(charsetEncoder20);
        java.lang.Class<?> wildcardClass22 = charsetEncoder20.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
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
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        java.lang.String str18 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        textNode22.settext("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.after((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "text" + "'", str18, "text");
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        textNode2.settext("#text");
        boolean boolean6 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
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
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings8.charsetEncoder;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = null;
        outputSettings15.escapeMode = escapeMode16;
        java.nio.charset.Charset charset18 = outputSettings15.charset;
        int int19 = outputSettings15.indentAmount();
        java.nio.charset.Charset charset20 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings8.charset(charset20);
        java.nio.charset.Charset charset22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.charset(charset22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        outputSettings19.escapeMode = escapeMode20;
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        textNode13.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        int int24 = textNode13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode13.siblingNodes();
        textNode13.settext("hi!");
        java.lang.String str28 = textNode13.getTEXT_KEY();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node10.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "text" + "'", str28, "text");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
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
        org.jsoup.nodes.Node node23 = textNode22.clone();
        java.lang.String str24 = node23.baseUri();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
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
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean33 = textNode13.equals((java.lang.Object) "hi!");
        textNode13.setBaseUri("");
        boolean boolean36 = textNode13.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node9.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = null;
        outputSettings8.escapeMode = escapeMode9;
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        textNode2.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        java.lang.String str14 = textNode2.attr("");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }
}
