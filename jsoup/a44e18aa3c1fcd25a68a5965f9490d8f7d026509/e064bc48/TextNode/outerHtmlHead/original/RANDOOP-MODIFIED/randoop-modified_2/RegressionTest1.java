import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str9 = textNode8.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodes();
        java.lang.String str11 = textNode8.toString();
        java.lang.String str12 = textNode8.nodeName();
        java.lang.String str14 = textNode8.absUrl("#text");
        int int15 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings0.indentAmount((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = outputSettings0.getClass();
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
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean12 = textNode11.isBlank();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.clone();
        boolean boolean27 = textNode11.equals((java.lang.Object) outputSettings26);
        textNode11.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = textNode8.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode14.clone();
        java.lang.String str18 = textNode14.attr("hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode14.text("hi!");
        org.jsoup.nodes.TextNode textNode22 = textNode20.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node24.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = textNode11.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
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
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode21.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(textNode21);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.Node node13 = textNode8.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node17 = textNode16.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.baseUri();
        org.jsoup.nodes.Node node15 = textNode12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.siblingNodes();
        boolean boolean18 = textNode12.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node13 = textNode12.clone();
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        org.jsoup.nodes.Node node15 = node13.parent();
        org.jsoup.nodes.Document document16 = node13.ownerDocument();
        org.jsoup.nodes.Document document17 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node9.after((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.before(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node8 = textNode6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode6.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.lang.String str11 = textNode8.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        java.lang.String str12 = textNode8.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode8.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode4 = textNode2.splitText(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.absUrl("#text");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean13 = textNode11.hasAttr("#text");
        java.lang.String str14 = textNode11.text();
        java.lang.String str16 = textNode11.attr("");
        org.jsoup.nodes.Document document17 = textNode11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.toString();
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        boolean boolean11 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.escapeMode(escapeMode12);
        boolean boolean14 = outputSettings13.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset4 = outputSettings3.charset();
        boolean boolean5 = outputSettings3.forceAllElementAsBlock();
        boolean boolean6 = outputSettings3.prettyPrint();
        java.lang.Class<?> wildcardClass7 = outputSettings3.getClass();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(false);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.indentAmount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings5.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
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
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount(10);
        boolean boolean39 = outputSettings38.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings38.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount(10);
        java.nio.charset.Charset charset49 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.indentAmount(10);
        boolean boolean53 = outputSettings52.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.indentAmount(10);
        java.nio.charset.Charset charset57 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings52.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings46.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings45.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings35.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.indentAmount(10);
        java.nio.charset.Charset charset65 = outputSettings62.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings66.indentAmount(10);
        boolean boolean69 = outputSettings68.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings70.indentAmount(10);
        java.nio.charset.Charset charset73 = outputSettings70.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings68.charset(charset73);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings62.charset(charset73);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings76.indentAmount(10);
        boolean boolean79 = outputSettings78.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings78.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings62.escapeMode(escapeMode80);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings35.escapeMode(escapeMode80);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings33.escapeMode(escapeMode80);
        boolean boolean84 = outputSettings83.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings83.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(charset57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertNotNull(charset73);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + escapeMode80 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode80.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        textNode2.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        textNode2.setBaseUri("#text");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.indentAmount(10);
        boolean boolean44 = outputSettings43.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings27.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings0.escapeMode(escapeMode45);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings47.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings47.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
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
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.traverse(nodeVisitor20);
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        boolean boolean38 = outputSettings37.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings32.escapeMode(escapeMode39);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings0.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(32);
        java.lang.Class<?> wildcardClass45 = outputSettings42.getClass();
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
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        org.jsoup.nodes.Node node10 = textNode8.nextSibling();
        java.lang.String str11 = textNode8.baseUri();
        org.jsoup.nodes.TextNode textNode13 = textNode8.text("");
        boolean boolean14 = textNode8.isBlank();
        org.jsoup.nodes.Node node17 = textNode8.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Attributes attributes12 = textNode10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode10.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        java.lang.String str15 = textNode10.text();
        boolean boolean17 = textNode10.hasAttr("#text");
        org.jsoup.nodes.Node node19 = textNode10.removeAttr("#text");
        java.lang.String str20 = node19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode7.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        boolean boolean10 = textNode8.isBlank();
        java.lang.String str12 = textNode8.attr("#text");
        java.lang.String str14 = textNode8.absUrl("#text");
        boolean boolean15 = textNode8.isBlank();
        org.jsoup.nodes.Node node17 = textNode8.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document6.setBaseUri("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str22 = textNode2.attr("hi!");
        java.lang.String str23 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node27 = textNode26.parent();
        java.lang.String str28 = textNode26.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode2.before((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode6.childNode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount(10);
        boolean boolean5 = outputSettings4.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings4.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings18.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings14.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings0.escapeMode(escapeMode25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.absUrl("#text");
        java.lang.String str11 = textNode6.attr("hi!");
        java.lang.String str13 = textNode6.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode6.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document12 = textNode11.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode11);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.absUrl("#text");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "#text");
        java.lang.String str14 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        boolean boolean11 = textNode10.isBlank();
        org.jsoup.nodes.Attributes attributes12 = textNode10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            textNode10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        java.lang.String str14 = textNode10.attr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode10.text("hi!");
        java.lang.String str17 = textNode16.baseUri();
        java.lang.String str18 = textNode16.getWholeText();
        org.jsoup.nodes.TextNode textNode20 = textNode16.splitText((int) (short) 1);
        org.jsoup.nodes.TextNode textNode22 = textNode20.splitText((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
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
        java.lang.Class<?> wildcardClass20 = escapeMode17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str14 = textNode13.outerHtml();
        java.lang.String str15 = textNode13.nodeName();
        java.lang.String str16 = textNode13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        boolean boolean17 = outputSettings16.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        org.jsoup.nodes.Document document11 = textNode9.ownerDocument();
        java.lang.String str13 = textNode9.attr("#text");
        org.jsoup.nodes.Node node14 = textNode9.parent();
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        boolean boolean4 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode16.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str11 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str9 = textNode6.text();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("hi!");
        java.lang.Class<?> wildcardClass12 = textNode11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodes();
        java.lang.Class<?> wildcardClass8 = textNode6.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode8.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = node3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        boolean boolean25 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings18.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings17.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings7.charset(charset29);
        boolean boolean34 = textNode2.equals((java.lang.Object) outputSettings7);
        java.lang.Class<?> wildcardClass35 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodes();
        java.lang.String str9 = textNode7.toString();
        org.jsoup.nodes.Node node10 = textNode7.parent();
        java.lang.String str11 = textNode7.toString();
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceWith((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings6.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.escapeMode(escapeMode13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings9.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str9 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node13 = textNode12.nextSibling();
        java.lang.String str15 = textNode12.absUrl("hi!");
        java.lang.String str17 = textNode12.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass8 = nodeList7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        java.lang.String str13 = textNode6.text();
        java.lang.String str14 = textNode6.nodeName();
        boolean boolean15 = textNode6.isBlank();
        java.lang.String str16 = textNode6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode6.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str16 = textNode14.absUrl("#text");
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        int int2 = outputSettings0.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
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
        java.lang.Class<?> wildcardClass49 = textNode2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        org.jsoup.nodes.Node node10 = textNode8.nextSibling();
        java.lang.String str11 = textNode8.baseUri();
        org.jsoup.nodes.Node node13 = textNode8.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
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
        boolean boolean14 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings12.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("#text");
        java.lang.String str15 = textNode11.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode11.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        java.nio.charset.Charset charset12 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings7.charset(charset12);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) outputSettings17);
        textNode2.setBaseUri("");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        int int6 = node5.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str11 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
        boolean boolean13 = outputSettings12.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        boolean boolean9 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        int int11 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.forceAllElementAsBlock(false);
        int int14 = outputSettings13.indentAmount();
        java.lang.Class<?> wildcardClass15 = outputSettings13.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        boolean boolean30 = outputSettings29.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        java.nio.charset.Charset charset34 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings29.charset(charset34);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings35.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings35.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        boolean boolean51 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings45.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount((int) ' ');
        boolean boolean56 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings57.indentAmount(10);
        java.nio.charset.Charset charset60 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount(10);
        boolean boolean64 = outputSettings63.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.indentAmount(10);
        java.nio.charset.Charset charset68 = outputSettings65.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings63.charset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings57.charset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings71.indentAmount(10);
        boolean boolean74 = outputSettings73.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode75 = outputSettings73.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings57.escapeMode(escapeMode75);
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = outputSettings77.indentAmount(10);
        boolean boolean80 = outputSettings79.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings79.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = outputSettings82.indentAmount(10);
        boolean boolean85 = outputSettings84.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode86 = outputSettings84.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings79.escapeMode(escapeMode86);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings57.escapeMode(escapeMode86);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings53.escapeMode(escapeMode86);
        org.jsoup.nodes.Document.OutputSettings outputSettings90 = outputSettings44.escapeMode(escapeMode86);
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings41.escapeMode(escapeMode86);
        org.jsoup.nodes.Document.OutputSettings outputSettings92 = outputSettings26.escapeMode(escapeMode86);
        boolean boolean93 = outputSettings26.forceAllElementAsBlock();
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
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(outputSettings59);
        org.junit.Assert.assertNotNull(charset60);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + escapeMode75 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode75.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + escapeMode81 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode81.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + escapeMode86 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode86.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings89);
        org.junit.Assert.assertNotNull(outputSettings90);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(outputSettings92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
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
        java.lang.Class<?> wildcardClass31 = outputSettings29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
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
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
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
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode6.traverse(nodeVisitor22);
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
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        org.jsoup.nodes.Node node13 = textNode11.nextSibling();
        boolean boolean15 = textNode11.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode8.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        java.nio.charset.Charset charset11 = outputSettings8.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(10);
        java.nio.charset.Charset charset23 = outputSettings20.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings18.charset(charset23);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings8.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings7.escapeMode(escapeMode25);
        java.lang.Class<?> wildcardClass28 = outputSettings27.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode11.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("");
        boolean boolean10 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node14 = textNode13.clone();
        org.jsoup.nodes.Node node15 = textNode13.nextSibling();
        java.lang.String str16 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("");
        java.lang.String str20 = textNode18.absUrl("hi!");
        java.lang.String str22 = textNode18.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.after((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        boolean boolean11 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.escapeMode(escapeMode12);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.forceAllElementAsBlock(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.indentAmount((int) (byte) 100);
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str16 = textNode11.text();
        boolean boolean18 = textNode11.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode20 = textNode11.text("#text");
        java.lang.String str21 = textNode20.toString();
        org.jsoup.nodes.TextNode textNode23 = textNode20.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode20);
        org.jsoup.nodes.Node node26 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node26.traverse(nodeVisitor27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node17 = textNode16.nextSibling();
        boolean boolean18 = textNode16.isBlank();
        java.lang.String str20 = textNode16.attr("#text");
        java.lang.String str22 = textNode16.absUrl("#text");
        boolean boolean23 = textNode16.isBlank();
        org.jsoup.nodes.Node node25 = textNode16.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = document13.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str9 = textNode7.absUrl("hi!");
        java.lang.String str11 = textNode7.attr("");
        java.lang.String str12 = textNode7.nodeName();
        org.jsoup.nodes.Node node13 = textNode7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode7.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount((int) ' ');
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.prettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        java.lang.String str15 = textNode13.outerHtml();
        java.lang.String str16 = textNode13.getWholeText();
        int int17 = textNode13.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode13.attr("#text", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = node5.outerHtml();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        java.lang.String str13 = textNode11.getWholeText();
        org.jsoup.nodes.Node node15 = textNode11.removeAttr("#text");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        boolean boolean12 = textNode2.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("#text");
        java.lang.String str15 = textNode13.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode13.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node13 = textNode12.clone();
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        org.jsoup.nodes.Node node16 = textNode14.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode11.before((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode6.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.absUrl("#text");
        java.lang.String str11 = textNode6.attr("hi!");
        java.lang.String str13 = textNode6.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode6.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        org.jsoup.nodes.TextNode textNode14 = textNode12.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode14.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount(10);
        java.nio.charset.Charset charset15 = outputSettings12.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings10.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        boolean boolean19 = outputSettings16.prettyPrint();
        boolean boolean20 = textNode2.equals((java.lang.Object) outputSettings16);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean14 = textNode12.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode12.childNodes();
        java.lang.String str16 = textNode12.text();
        org.jsoup.nodes.TextNode textNode18 = textNode12.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("");
        boolean boolean10 = textNode2.hasAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode8.parent();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str14 = textNode12.absUrl("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode8.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        java.lang.String str12 = textNode8.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode8.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        java.lang.String str13 = textNode10.nodeName();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
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
        boolean boolean42 = textNode10.equals((java.lang.Object) outputSettings15);
        java.lang.String str44 = textNode10.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = textNode2.after((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertNull(document14);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = textNode10.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        int int3 = outputSettings2.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.forceAllElementAsBlock(true);
        boolean boolean6 = outputSettings5.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        int int6 = textNode2.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode6.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        org.jsoup.nodes.Attributes attributes13 = textNode11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode10.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node10 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("hi!");
        java.lang.String str13 = textNode9.attr("hi!");
        int int14 = textNode9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.baseUri();
        org.jsoup.nodes.Node node15 = textNode12.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.baseUri();
        int int11 = textNode8.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode8.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node13 = textNode12.clone();
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        java.lang.String str15 = textNode12.baseUri();
        org.jsoup.nodes.TextNode textNode17 = textNode12.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node6.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        org.jsoup.nodes.Node node10 = textNode8.nextSibling();
        java.lang.String str11 = textNode8.nodeName();
        org.jsoup.nodes.Node node12 = textNode8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document5.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
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
        boolean boolean14 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.clone();
        int int16 = outputSettings15.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean14 = textNode12.hasAttr("");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Document document22 = textNode21.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode21.childNodes();
        boolean boolean24 = textNode12.equals((java.lang.Object) textNode21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node9.before((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        org.jsoup.nodes.Node node9 = node7.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node9.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = node3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document4.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.attr("");
        java.lang.String str12 = textNode2.baseUri();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(100);
        java.nio.charset.Charset charset13 = outputSettings12.charset();
        int int14 = outputSettings12.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        org.jsoup.nodes.Attributes attributes14 = textNode6.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount(10);
        boolean boolean5 = outputSettings4.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount(10);
        boolean boolean10 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings4.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.indentAmount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = node7.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        java.lang.String str12 = textNode9.getWholeText();
        java.lang.String str13 = textNode9.toString();
        java.lang.String str14 = textNode9.text();
        java.lang.String str16 = textNode9.absUrl("#text");
        org.jsoup.nodes.TextNode textNode18 = textNode9.text("");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean23 = textNode21.hasAttr("");
        org.jsoup.nodes.Node node24 = textNode21.clone();
        java.lang.String str25 = node24.outerHtml();
        boolean boolean26 = textNode18.equals((java.lang.Object) node24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        java.lang.String str12 = textNode10.outerHtml();
        java.lang.String str13 = textNode10.getWholeText();
        java.lang.String str14 = textNode10.toString();
        java.lang.String str15 = textNode10.text();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Attributes attributes19 = textNode18.attributes();
        boolean boolean20 = textNode10.equals((java.lang.Object) textNode18);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            document7.replaceWith((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.Object obj8 = null;
        boolean boolean9 = textNode2.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        boolean boolean14 = node9.equals((java.lang.Object) textNode12);
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode12.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        boolean boolean12 = textNode2.equals((java.lang.Object) textNode10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings29.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
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
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str17 = textNode15.absUrl("hi!");
        org.jsoup.nodes.Node node18 = textNode15.clone();
        org.jsoup.nodes.Node node19 = textNode15.previousSibling();
        java.lang.String str20 = textNode15.outerHtml();
        org.jsoup.nodes.Node node21 = textNode15.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode6.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Document document12 = textNode11.ownerDocument();
        boolean boolean14 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode16 = textNode11.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(textNode16);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode11.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode11.siblingNodes();
        boolean boolean15 = textNode11.isBlank();
        java.lang.String str16 = textNode11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.Node node10 = textNode6.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node7 = textNode5.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.jsoup.nodes.Document document9 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.clone();
        int int8 = outputSettings0.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.childNodes();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        java.lang.String str15 = textNode10.baseUri();
        java.lang.String str16 = textNode10.baseUri();
        org.jsoup.nodes.Node node17 = textNode10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = node3.clone();
        java.lang.Class<?> wildcardClass5 = node4.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = document8.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean14 = textNode12.hasAttr("");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        org.jsoup.nodes.Node node17 = textNode12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode12.childNodes();
        java.lang.String str20 = textNode12.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node10 = textNode9.parent();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.outerHtml();
        org.jsoup.nodes.Node node13 = textNode9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        textNode2.setBaseUri("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        org.jsoup.nodes.Attributes attributes14 = textNode12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node6.setBaseUri("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean16 = textNode14.hasAttr("");
        org.jsoup.nodes.Node node17 = textNode14.clone();
        java.lang.String str18 = node17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode11.clone();
        java.lang.String str14 = textNode11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode11.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
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
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node23 = textNode22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode22.childNodes();
        org.jsoup.nodes.Node node27 = textNode22.attr("hi!", "");
        java.lang.String str28 = node27.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        boolean boolean14 = node9.equals((java.lang.Object) textNode12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode12.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str9 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        java.lang.String str14 = textNode12.getWholeText();
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        java.lang.String str17 = node16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        java.lang.String str16 = textNode14.absUrl("hi!");
        java.lang.String str18 = textNode14.attr("");
        textNode14.setBaseUri("hi!");
        org.jsoup.nodes.Document document21 = textNode14.ownerDocument();
        org.jsoup.nodes.Node node24 = textNode14.attr("#text", "");
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node28 = textNode27.clone();
        boolean boolean29 = textNode14.equals((java.lang.Object) textNode27);
        org.jsoup.nodes.Attributes attributes30 = textNode27.attributes();
        boolean boolean31 = textNode2.equals((java.lang.Object) attributes30);
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node35 = textNode34.parent();
        int int36 = textNode34.siblingIndex();
        java.lang.String str37 = textNode34.outerHtml();
        org.jsoup.nodes.Node node38 = textNode34.nextSibling();
        org.jsoup.nodes.Node node39 = textNode34.nextSibling();
        java.lang.String str41 = textNode34.attr("#text");
        org.jsoup.nodes.Attributes attributes42 = textNode34.attributes();
        java.lang.String str43 = textNode34.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = textNode2.after((org.jsoup.nodes.Node) textNode34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.indentAmount(10);
        boolean boolean8 = outputSettings7.forceAllElementAsBlock();
        boolean boolean9 = node4.equals((java.lang.Object) boolean8);
        org.jsoup.nodes.Node node10 = node4.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node14 = textNode13.parent();
        java.lang.String str15 = textNode13.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings18.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.prettyPrint(false);
        boolean boolean29 = textNode13.equals((java.lang.Object) outputSettings26);
        java.lang.String str30 = textNode13.nodeName();
        org.jsoup.nodes.TextNode textNode32 = textNode13.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node4.before((org.jsoup.nodes.Node) textNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#text" + "'", str30, "#text");
        org.junit.Assert.assertNotNull(textNode32);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
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
        boolean boolean17 = outputSettings9.forceAllElementAsBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings9.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        textNode10.setBaseUri("#text");
        int int13 = textNode10.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.outerHtml();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        java.lang.String str14 = textNode2.toString();
        java.lang.String str15 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        boolean boolean12 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.baseUri();
        java.lang.String str8 = textNode6.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("");
        java.lang.String str14 = textNode11.toString();
        java.lang.String str15 = textNode11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode6.replaceWith((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
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
        java.lang.String str18 = textNode2.absUrl("hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str22 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean27 = textNode25.hasAttr("");
        org.jsoup.nodes.TextNode textNode29 = textNode25.text("");
        textNode25.setBaseUri("hi!");
        org.jsoup.nodes.Node node34 = textNode25.attr("#text", "hi!");
        int int35 = textNode25.siblingIndex();
        org.jsoup.nodes.Node node36 = textNode25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        boolean boolean20 = textNode2.isBlank();
        org.jsoup.nodes.Node node21 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node25 = textNode24.clone();
        org.jsoup.nodes.Attributes attributes26 = textNode24.attributes();
        textNode24.setBaseUri("hi!");
        boolean boolean30 = textNode24.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node32 = textNode24.removeAttr("hi!");
        org.jsoup.nodes.Node node33 = node32.parent();
        // The following exception was thrown during execution in test generation
        try {
            node21.replaceWith(node32);
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        boolean boolean8 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        node12.setBaseUri("#text");
        org.jsoup.nodes.Node node15 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.Object obj8 = null;
        boolean boolean9 = textNode2.equals(obj8);
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings6.escapeMode(escapeMode13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings5.escapeMode(escapeMode13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        textNode10.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode10.text("");
        org.jsoup.nodes.TextNode textNode18 = textNode16.text("#text");
        org.jsoup.nodes.Node node19 = textNode16.parent();
        java.lang.String str21 = textNode16.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        boolean boolean20 = outputSettings19.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings26.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings16.charset(charset38);
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings16.escapeMode();
        boolean boolean44 = outputSettings16.prettyPrint();
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
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        boolean boolean20 = outputSettings19.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings19.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings26.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings16.charset(charset38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings2.indentAmount((int) (byte) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings2.forceAllElementAsBlock(false);
        int int7 = outputSettings2.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings2.indentAmount((int) (byte) 10);
        boolean boolean10 = outputSettings2.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        java.lang.String str13 = textNode11.outerHtml();
        java.lang.String str14 = textNode11.getWholeText();
        java.lang.String str16 = textNode11.attr("hi!");
        java.lang.String str17 = textNode11.nodeName();
        java.lang.String str18 = textNode11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
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
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings11.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.indentAmount(10);
        java.nio.charset.Charset charset38 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings33.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings27.charset(charset38);
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
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings40.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings26.escapeMode(escapeMode52);
        boolean boolean55 = textNode9.equals((java.lang.Object) outputSettings54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = textNode2.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean11 = textNode10.isBlank();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount(10);
        boolean boolean16 = outputSettings15.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings15.charset(charset20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.clone();
        boolean boolean26 = textNode10.equals((java.lang.Object) outputSettings25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = textNode2.before((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str8 = textNode5.outerHtml();
        java.lang.String str9 = textNode5.baseUri();
        org.jsoup.nodes.Attributes attributes10 = textNode5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.before((org.jsoup.nodes.Node) textNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Document document7 = textNode6.ownerDocument();
        java.lang.String str8 = textNode6.getWholeText();
        java.lang.String str9 = textNode6.toString();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode6.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        textNode6.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("#text");
        java.lang.Class<?> wildcardClass17 = textNode16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
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
        java.lang.Class<?> wildcardClass13 = escapeMode11.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean7 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings24.charset("");
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
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str9 = textNode6.text();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str8 = textNode7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount(1);
        boolean boolean5 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.forceAllElementAsBlock(false);
        int int8 = outputSettings0.indentAmount();
        boolean boolean9 = outputSettings0.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        textNode10.setBaseUri("#text");
        java.lang.Class<?> wildcardClass15 = textNode10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset8 = outputSettings5.charset();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.indentAmount(10);
        boolean boolean32 = outputSettings31.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings31.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        boolean boolean37 = outputSettings36.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings31.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings9.escapeMode(escapeMode38);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings46.indentAmount(10);
        boolean boolean49 = outputSettings48.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings43.escapeMode(escapeMode50);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings51.indentAmount((int) ' ');
        boolean boolean54 = outputSettings51.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(10);
        java.nio.charset.Charset charset58 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(10);
        boolean boolean62 = outputSettings61.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings63.indentAmount(10);
        java.nio.charset.Charset charset66 = outputSettings63.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings61.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings55.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings69.indentAmount(10);
        boolean boolean72 = outputSettings71.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode73 = outputSettings71.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings55.escapeMode(escapeMode73);
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings77 = outputSettings75.indentAmount(10);
        boolean boolean78 = outputSettings77.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode79 = outputSettings77.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings80.indentAmount(10);
        boolean boolean83 = outputSettings82.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode84 = outputSettings82.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings85 = outputSettings77.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings55.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings87 = outputSettings51.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = outputSettings42.escapeMode(escapeMode84);
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings5.escapeMode(escapeMode84);
        java.nio.charset.Charset charset90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings5.charset(charset90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charset8);
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
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(charset58);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + escapeMode73 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode73.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertNotNull(outputSettings77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + escapeMode79 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode79.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + escapeMode84 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode84.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings85);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(outputSettings87);
        org.junit.Assert.assertNotNull(outputSettings88);
        org.junit.Assert.assertNotNull(outputSettings89);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.baseUri();
        java.lang.String str7 = textNode4.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str16 = textNode11.text();
        boolean boolean18 = textNode11.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode20 = textNode11.text("#text");
        java.lang.String str21 = textNode20.toString();
        org.jsoup.nodes.TextNode textNode23 = textNode20.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        boolean boolean25 = textNode2.equals((java.lang.Object) textNode20);
        java.lang.String str26 = textNode20.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = textNode20.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#text" + "'", str26, "#text");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        org.jsoup.nodes.Node node13 = textNode11.nextSibling();
        boolean boolean15 = textNode11.hasAttr("");
        java.lang.String str17 = textNode11.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode6.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        boolean boolean12 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node13 = textNode10.parent();
        boolean boolean14 = textNode10.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = textNode10.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        node3.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = node3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node3.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node14 = textNode13.parent();
        java.lang.String str15 = textNode13.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        boolean boolean19 = outputSettings18.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings18.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.prettyPrint(false);
        boolean boolean29 = textNode13.equals((java.lang.Object) outputSettings26);
        org.jsoup.nodes.Node node30 = textNode13.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str4 = textNode2.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean10 = textNode8.hasAttr("");
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("");
        java.lang.String str14 = textNode12.absUrl("hi!");
        java.lang.String str16 = textNode12.attr("");
        textNode12.setBaseUri("hi!");
        org.jsoup.nodes.Document document19 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node22 = textNode12.attr("#text", "");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings2.forceAllElementAsBlock(false);
        boolean boolean8 = outputSettings2.prettyPrint();
        java.nio.charset.Charset charset9 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("#text");
        java.lang.String str15 = textNode11.baseUri();
        java.lang.String str16 = textNode11.toString();
        org.jsoup.nodes.Attributes attributes17 = textNode11.attributes();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node21 = textNode20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode20.childNodes();
        java.lang.String str23 = textNode20.baseUri();
        org.jsoup.nodes.Node node24 = textNode20.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode11.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.parent();
        java.lang.String str12 = node10.baseUri();
        java.lang.Class<?> wildcardClass13 = node10.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
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
        java.util.List<org.jsoup.nodes.Node> nodeList49 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node10 = textNode9.nextSibling();
        boolean boolean11 = textNode9.isBlank();
        boolean boolean13 = textNode9.hasAttr("hi!");
        boolean boolean15 = textNode9.hasAttr("");
        java.lang.String str16 = textNode9.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode9.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode2.before((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str6 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str9 = textNode6.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode6.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset1 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        textNode2.setBaseUri("#text");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.outerHtml();
        org.jsoup.nodes.Node node11 = textNode9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode9.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        java.lang.String str9 = node8.outerHtml();
        java.lang.String str10 = node8.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
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
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean20 = textNode18.hasAttr("");
        textNode18.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode24 = textNode18.text("");
        org.jsoup.nodes.TextNode textNode26 = textNode24.text("#text");
        boolean boolean27 = textNode26.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            textNode11.replaceWith((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean8 = textNode6.hasAttr("");
        org.jsoup.nodes.Attributes attributes9 = textNode6.attributes();
        java.lang.String str10 = textNode6.nodeName();
        org.jsoup.nodes.Node node11 = textNode6.clone();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
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
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.Node node20 = textNode2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.prettyPrint();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.prettyPrint(false);
        boolean boolean7 = outputSettings0.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        boolean boolean9 = textNode8.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode8.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.text();
        textNode7.setBaseUri("");
        java.lang.String str14 = textNode7.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str18 = textNode17.nodeName();
        java.lang.String str20 = textNode17.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = textNode7.before((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) "#text");
        java.lang.String str9 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.absUrl("#text");
        boolean boolean10 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings11.escapeMode(escapeMode18);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.prettyPrint(false);
        boolean boolean28 = textNode2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = textNode2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean12 = textNode10.hasAttr("#text");
        java.lang.String str13 = textNode10.text();
        java.lang.String str15 = textNode10.attr("");
        org.jsoup.nodes.Document document16 = textNode10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode2.before((org.jsoup.nodes.Node) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str21 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
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
        java.nio.charset.Charset charset14 = outputSettings13.charset();
        java.lang.Class<?> wildcardClass15 = charset14.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str10 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        node3.setBaseUri("#text");
        int int6 = node3.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        java.lang.String str12 = textNode9.getWholeText();
        java.lang.String str14 = textNode9.attr("hi!");
        java.lang.String str15 = textNode9.nodeName();
        org.jsoup.nodes.Node node16 = textNode9.clone();
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        int int17 = outputSettings16.indentAmount();
        java.lang.Class<?> wildcardClass18 = outputSettings16.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.forceAllElementAsBlock(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        org.jsoup.nodes.Node node16 = textNode11.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) node16);
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node22 = textNode21.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode21.childNodes();
        org.jsoup.nodes.Node node26 = textNode21.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode21.childNodes();
        org.jsoup.nodes.TextNode textNode30 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean32 = textNode30.hasAttr("");
        org.jsoup.nodes.TextNode textNode34 = textNode30.text("");
        java.lang.String str35 = textNode30.text();
        boolean boolean37 = textNode30.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode39 = textNode30.text("#text");
        java.lang.String str40 = textNode39.toString();
        org.jsoup.nodes.TextNode textNode42 = textNode39.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode39.siblingNodes();
        boolean boolean44 = textNode21.equals((java.lang.Object) textNode39);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node16.after((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#text" + "'", str40, "#text");
        org.junit.Assert.assertNotNull(textNode42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.forceAllElementAsBlock(true);
        int int9 = outputSettings5.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.absUrl("#text");
        boolean boolean10 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings11.escapeMode(escapeMode18);
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings19.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.forceAllElementAsBlock(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.prettyPrint(false);
        boolean boolean28 = textNode2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        boolean boolean12 = outputSettings8.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.getWholeText();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.text();
        textNode7.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode7.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.baseUri();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean10 = textNode8.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.childNodes();
        java.lang.String str12 = textNode8.text();
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("hi!");
        java.lang.String str15 = textNode8.text();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode8.siblingNodes();
        org.jsoup.nodes.Node node17 = textNode8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = textNode4.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings9);
        int int17 = textNode2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = node4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        java.nio.charset.Charset charset7 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings2.charset(charset7);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.prettyPrint(true);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.splitText((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode8.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textNode12);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.lang.String str9 = textNode7.absUrl("hi!");
        java.lang.String str11 = textNode7.attr("");
        java.lang.String str12 = textNode7.nodeName();
        org.jsoup.nodes.Node node13 = textNode7.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode7.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.outerHtml();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document13.wrap("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        java.lang.Class<?> wildcardClass4 = outputSettings0.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        boolean boolean4 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings2.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        boolean boolean25 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings18.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings17.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings7.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount(10);
        boolean boolean41 = outputSettings40.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(10);
        java.nio.charset.Charset charset45 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings40.charset(charset45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings34.charset(charset45);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        boolean boolean51 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings34.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings7.escapeMode(escapeMode52);
        java.nio.charset.Charset charset55 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings2.charset(charset55);
        int int57 = outputSettings2.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings0.clone();
        java.nio.charset.Charset charset17 = outputSettings0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings0.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        java.lang.String str10 = textNode8.baseUri();
        int int11 = textNode8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode8.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings11.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode12.clone();
        java.lang.String str16 = textNode12.attr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode12.text("hi!");
        java.lang.String str19 = textNode18.baseUri();
        java.lang.String str20 = textNode18.getWholeText();
        org.jsoup.nodes.TextNode textNode22 = textNode18.splitText((int) (short) 1);
        org.jsoup.nodes.TextNode textNode24 = textNode22.splitText((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean11 = textNode9.hasAttr("");
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("");
        java.lang.String str15 = textNode13.absUrl("hi!");
        java.lang.String str16 = textNode13.text();
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.after((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodes();
        int int14 = textNode12.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
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
        boolean boolean14 = outputSettings13.forceAllElementAsBlock();
        boolean boolean15 = outputSettings13.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = document5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        java.lang.String str15 = textNode13.outerHtml();
        java.lang.String str16 = textNode13.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode13.siblingNodes();
        java.lang.String str20 = textNode13.toString();
        int int21 = textNode13.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = textNode10.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode8.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str21 = textNode2.baseUri();
        org.jsoup.nodes.Node node24 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = node11.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        int int3 = textNode2.siblingIndex();
        boolean boolean5 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.setBaseUri("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Document document9 = textNode8.ownerDocument();
        java.lang.Class<?> wildcardClass10 = textNode8.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.lang.String str3 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings11.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        java.nio.charset.Charset charset22 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(10);
        boolean boolean26 = outputSettings25.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(10);
        java.nio.charset.Charset charset30 = outputSettings27.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings25.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings19.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings18.charset(charset30);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings5.charset(charset30);
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
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount(10);
        boolean boolean52 = outputSettings51.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode53 = outputSettings51.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings35.escapeMode(escapeMode53);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.indentAmount(10);
        boolean boolean58 = outputSettings57.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings57.prettyPrint(true);
        java.nio.charset.Charset charset61 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings60.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset65 = outputSettings64.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings64.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset68 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings60.charset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings54.charset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings34.charset(charset68);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings71.clone();
        boolean boolean73 = outputSettings72.forceAllElementAsBlock();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + escapeMode53 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode53.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(charset68);
        org.junit.Assert.assertNotNull(outputSettings69);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(outputSettings71);
        org.junit.Assert.assertNotNull(outputSettings72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.childNodes();
        java.lang.String str14 = textNode10.text();
        org.jsoup.nodes.TextNode textNode16 = textNode10.text("hi!");
        java.lang.String str17 = textNode10.text();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode10.siblingNodes();
        org.jsoup.nodes.Node node19 = textNode10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode7.after((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        boolean boolean7 = outputSettings6.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(true);
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean13 = outputSettings9.forceAllElementAsBlock();
        boolean boolean14 = textNode2.equals((java.lang.Object) boolean13);
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        boolean boolean14 = textNode6.hasAttr("hi!");
        java.lang.String str15 = textNode6.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = textNode6.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.outerHtml();
        boolean boolean9 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        java.nio.charset.Charset charset13 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings16.charset(charset21);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings10.charset(charset21);
        java.nio.charset.Charset charset24 = outputSettings23.charset();
        boolean boolean25 = textNode2.equals((java.lang.Object) charset24);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        java.lang.String str14 = textNode12.getWholeText();
        org.jsoup.nodes.Attributes attributes15 = textNode12.attributes();
        org.jsoup.nodes.Node node16 = textNode12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str5 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount(10);
        boolean boolean6 = outputSettings5.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount(10);
        boolean boolean13 = outputSettings12.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        java.nio.charset.Charset charset17 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings12.charset(charset17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings8.charset(charset20);
        boolean boolean22 = outputSettings8.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings8.indentAmount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean8 = textNode6.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode6.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = node6.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str10 = textNode2.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode11.clone();
        java.lang.String str15 = textNode11.attr("hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("hi!");
        java.lang.String str18 = textNode17.baseUri();
        java.lang.String str19 = textNode17.getWholeText();
        org.jsoup.nodes.Node node22 = textNode17.attr("hi!", "");
        boolean boolean23 = textNode2.equals((java.lang.Object) node22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        textNode2.setBaseUri("");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        boolean boolean12 = textNode2.equals((java.lang.Object) textNode10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode10.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode6.siblingNodes();
        org.jsoup.nodes.Attributes attributes15 = textNode6.attributes();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.siblingNodes();
        org.jsoup.nodes.Node node20 = textNode18.clone();
        java.lang.String str22 = textNode18.attr("hi!");
        org.jsoup.nodes.TextNode textNode24 = textNode18.text("hi!");
        java.lang.String str25 = textNode24.baseUri();
        org.jsoup.nodes.Node node28 = textNode24.attr("#text", "");
        java.lang.String str30 = textNode24.attr("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode6.replaceWith((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode8.parent();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node11 = textNode10.clone();
        org.jsoup.nodes.Node node12 = textNode10.nextSibling();
        boolean boolean14 = textNode10.hasAttr("");
        java.lang.String str16 = textNode10.attr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode10.text("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = textNode2.before((org.jsoup.nodes.Node) textNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textNode18);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset31 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings0.charset(charset31);
        int int33 = outputSettings0.indentAmount();
        java.lang.Class<?> wildcardClass34 = outputSettings0.getClass();
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
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str10 = textNode9.outerHtml();
        java.lang.String str11 = textNode9.text();
        java.lang.Object obj12 = null;
        boolean boolean13 = textNode9.equals(obj12);
        boolean boolean15 = textNode9.hasAttr("");
        java.lang.String str16 = textNode9.toString();
        org.jsoup.nodes.Node node18 = textNode9.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean10 = textNode2.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean11 = textNode9.hasAttr("#text");
        java.lang.String str12 = textNode9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#text" + "'", str12, "#text");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node10 = textNode9.clone();
        org.jsoup.nodes.Node node11 = textNode9.nextSibling();
        java.lang.String str12 = textNode9.baseUri();
        org.jsoup.nodes.TextNode textNode14 = textNode9.text("");
        boolean boolean15 = textNode9.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(10);
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings16.prettyPrint(false);
        int int22 = outputSettings16.indentAmount();
        boolean boolean23 = textNode9.equals((java.lang.Object) outputSettings16);
        boolean boolean24 = textNode2.equals((java.lang.Object) boolean23);
        textNode2.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode28 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        java.lang.String str9 = textNode8.baseUri();
        org.jsoup.nodes.Node node12 = textNode8.attr("#text", "");
        org.jsoup.nodes.Document document13 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode8.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode7 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "");
        java.lang.String str8 = textNode2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = document7.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str15 = textNode14.text();
        java.lang.String str16 = textNode14.baseUri();
        java.lang.String str17 = textNode14.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            document11.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount(10);
        boolean boolean22 = outputSettings21.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings21.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings21.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount((int) ' ');
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
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings28.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings18.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.indentAmount(10);
        java.nio.charset.Charset charset48 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.indentAmount(10);
        boolean boolean52 = outputSettings51.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.indentAmount(10);
        java.nio.charset.Charset charset56 = outputSettings53.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings51.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings45.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(10);
        boolean boolean62 = outputSettings61.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings61.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings45.escapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings18.escapeMode(escapeMode63);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings17.escapeMode(escapeMode63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings17.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + escapeMode63 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode63.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings64);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings66);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.absUrl("hi!");
        boolean boolean9 = textNode6.isBlank();
        textNode6.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode6.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode6.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean10 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode7.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        java.lang.String str14 = textNode12.outerHtml();
        java.lang.String str15 = textNode12.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode12.siblingNodes();
        org.jsoup.nodes.Node node19 = textNode12.previousSibling();
        java.lang.String str20 = textNode12.outerHtml();
        org.jsoup.nodes.Document document21 = textNode12.ownerDocument();
        boolean boolean22 = textNode12.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.outerHtml();
        org.jsoup.nodes.Node node11 = textNode9.previousSibling();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode14.clone();
        java.lang.String str18 = textNode14.attr("hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode14.text("hi!");
        org.jsoup.nodes.Node node21 = textNode14.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node11.equals((java.lang.Object) node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
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
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes20 = textNode2.attributes();
        java.lang.String str22 = textNode2.attr("hi!");
        java.lang.String str23 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#text" + "'", str23, "#text");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str16 = textNode15.outerHtml();
        java.lang.String str17 = textNode15.text();
        java.lang.Object obj18 = null;
        boolean boolean19 = textNode15.equals(obj18);
        boolean boolean21 = textNode15.hasAttr("");
        java.lang.String str22 = textNode15.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = document12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = node11.baseUri();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.siblingNodes();
        java.lang.String str17 = textNode15.outerHtml();
        java.lang.String str18 = textNode15.getWholeText();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node11.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str6 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.prettyPrint(true);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings4.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.forceAllElementAsBlock(true);
        int int11 = outputSettings10.indentAmount();
        java.nio.charset.Charset charset12 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings2.charset(charset12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings2.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#text" + "'", str9, "#text");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.outerHtml();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        java.lang.Class<?> wildcardClass8 = outputSettings6.getClass();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
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
        boolean boolean14 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings0.charset("#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        boolean boolean4 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings2.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.indentAmount(10);
        boolean boolean11 = outputSettings10.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.indentAmount(10);
        java.nio.charset.Charset charset21 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        boolean boolean25 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        java.nio.charset.Charset charset29 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings18.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings17.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings7.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount(10);
        java.nio.charset.Charset charset37 = outputSettings34.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.indentAmount(10);
        boolean boolean41 = outputSettings40.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.indentAmount(10);
        java.nio.charset.Charset charset45 = outputSettings42.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings40.charset(charset45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings34.charset(charset45);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.indentAmount(10);
        boolean boolean51 = outputSettings50.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings34.escapeMode(escapeMode52);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings7.escapeMode(escapeMode52);
        java.nio.charset.Charset charset55 = outputSettings54.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings2.charset(charset55);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings58.indentAmount(10);
        boolean boolean61 = outputSettings60.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings60.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings60.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings65.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings68.indentAmount(10);
        java.nio.charset.Charset charset71 = outputSettings68.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings74 = outputSettings72.indentAmount(10);
        boolean boolean75 = outputSettings74.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings76.indentAmount(10);
        java.nio.charset.Charset charset79 = outputSettings76.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings80 = outputSettings74.charset(charset79);
        org.jsoup.nodes.Document.OutputSettings outputSettings81 = outputSettings68.charset(charset79);
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = outputSettings67.charset(charset79);
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = outputSettings57.charset(charset79);
        java.nio.charset.Charset charset84 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings86 = outputSettings57.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset87 = outputSettings57.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings88 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset89 = outputSettings88.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings88.indentAmount((int) (byte) 100);
        java.nio.charset.Charset charset92 = outputSettings91.charset();
        boolean boolean93 = outputSettings91.forceAllElementAsBlock();
        boolean boolean94 = outputSettings91.prettyPrint();
        java.nio.charset.Charset charset95 = outputSettings91.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings96 = outputSettings57.charset(charset95);
        org.jsoup.nodes.Document.OutputSettings outputSettings97 = outputSettings2.charset(charset95);
        org.jsoup.nodes.Document.OutputSettings outputSettings99 = outputSettings97.indentAmount(0);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertNotNull(outputSettings56);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings70);
        org.junit.Assert.assertNotNull(charset71);
        org.junit.Assert.assertNotNull(outputSettings74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertNotNull(outputSettings80);
        org.junit.Assert.assertNotNull(outputSettings81);
        org.junit.Assert.assertNotNull(outputSettings82);
        org.junit.Assert.assertNotNull(outputSettings83);
        org.junit.Assert.assertNotNull(charset84);
        org.junit.Assert.assertNotNull(outputSettings86);
        org.junit.Assert.assertNotNull(charset87);
        org.junit.Assert.assertNotNull(charset89);
        org.junit.Assert.assertNotNull(outputSettings91);
        org.junit.Assert.assertNotNull(charset92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(charset95);
        org.junit.Assert.assertNotNull(outputSettings96);
        org.junit.Assert.assertNotNull(outputSettings97);
        org.junit.Assert.assertNotNull(outputSettings99);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node10 = textNode9.clone();
        org.jsoup.nodes.Node node11 = textNode9.nextSibling();
        java.lang.String str12 = textNode9.baseUri();
        org.jsoup.nodes.TextNode textNode14 = textNode9.text("");
        boolean boolean16 = textNode9.hasAttr("#text");
        org.jsoup.nodes.Node node18 = textNode9.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode6.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass11 = textNode2.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode12.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode2.text();
        boolean boolean9 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        java.nio.charset.Charset charset3 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.prettyPrint(false);
        int int6 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.indentAmount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings0.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
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
        java.lang.String str19 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("hi!");
        java.lang.String str22 = textNode21.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            textNode21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount(10);
        java.nio.charset.Charset charset20 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount(10);
        boolean boolean24 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.indentAmount(10);
        java.nio.charset.Charset charset28 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings17.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(10);
        boolean boolean34 = outputSettings33.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings17.escapeMode(escapeMode35);
        int int37 = outputSettings36.indentAmount();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings16.charset(charset38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings16.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        textNode2.setBaseUri("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode6.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.indentAmount(10);
        boolean boolean3 = outputSettings2.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(true);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.forceAllElementAsBlock(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount(10);
        boolean boolean12 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount(10);
        boolean boolean17 = outputSettings16.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings11.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings11.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        java.nio.charset.Charset charset25 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(10);
        boolean boolean29 = outputSettings28.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount(10);
        java.nio.charset.Charset charset33 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings28.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings22.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount(10);
        boolean boolean39 = outputSettings38.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.indentAmount(10);
        java.nio.charset.Charset charset43 = outputSettings40.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings38.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings44.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings44.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings35.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings11.escapeMode(escapeMode47);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings8.escapeMode(escapeMode47);
        boolean boolean51 = outputSettings50.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.absUrl("#text");
        java.lang.String str11 = textNode6.attr("hi!");
        java.lang.String str13 = textNode6.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean9 = textNode7.hasAttr("#text");
        java.lang.String str10 = textNode7.text();
        textNode7.setBaseUri("");
        java.lang.String str13 = textNode7.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            textNode7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node11 = textNode10.clone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        java.lang.String str13 = node11.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = textNode2.after(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        java.lang.String str10 = textNode6.attr("hi!");
        boolean boolean12 = textNode6.hasAttr("hi!");
        java.lang.String str13 = textNode6.text();
        java.lang.String str14 = textNode6.nodeName();
        boolean boolean15 = textNode6.isBlank();
        java.lang.String str16 = textNode6.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = textNode6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = textNode6.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.absUrl("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = textNode2.attr("", "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }
}

