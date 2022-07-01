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
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode11.wrap("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Node node10 = textNode9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str5 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str5 = textNode2.absUrl("text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.attr("text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode;
        outputSettings12.escapeMode = escapeMode15;
        outputSettings10.setescapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        outputSettings18.prettyPrint = false;
        java.nio.charset.Charset charset22 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings7.escapeMode(escapeMode24);
        boolean boolean26 = textNode2.equals((java.lang.Object) escapeMode24);
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document30 = textNode29.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode29.siblingNodes();
        boolean boolean32 = textNode2.equals((java.lang.Object) textNode29);
        int int33 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = textNode2.wrap("text");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("text");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.String str11 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode5.wrap("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.absUrl("text");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("hi!");
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.getTEXT_KEY();
        org.jsoup.nodes.Document document2 = textNode0.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.text();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode7.attr("text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        boolean boolean4 = textNode2.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Node node10 = textNode9.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode9.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("#text");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        java.lang.String str9 = textNode2.text;
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        textNode10.ensureAttributes();
        boolean boolean12 = textNode10.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode10.wrap("text");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str7 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.toString();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode;
        outputSettings12.escapeMode = escapeMode15;
        outputSettings10.setescapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        outputSettings18.prettyPrint = false;
        java.nio.charset.Charset charset22 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings7.escapeMode(escapeMode24);
        boolean boolean26 = textNode2.equals((java.lang.Object) escapeMode24);
        int int27 = textNode2.siblingIndex();
        java.lang.String str28 = textNode2.text();
        java.lang.String str30 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode2.wrap("#text");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        int int12 = textNode2.childNodeSize();
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("text");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        textNode2.text = "hi!";
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        outputSettings6.prettyPrint = false;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.clone();
        outputSettings10.setindentAmount(1);
        java.nio.charset.Charset charset13 = outputSettings10.charset();
        boolean boolean14 = textNode2.equals((java.lang.Object) outputSettings10);
        java.lang.String str15 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("#text");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        int int10 = node9.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("text");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        textNode2.settext("hi!");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.text();
        java.lang.String str7 = textNode2.absUrl("text");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("hi!");
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode11.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode11.wrap("#");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("text");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.gettext();
        java.lang.String str6 = textNode2.attr("hi!");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        textNode2.settext("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("text");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.Node node12 = textNode9.attr("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.siblingNodes();
        textNode9.ensureAttributes();
        int int15 = textNode9.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode9.wrap("#text");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.text();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        org.jsoup.nodes.Node node20 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodesCopy();
        java.lang.String str22 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        textNode2.settext("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getWholeText();
        textNode2.setBaseUri("hi!");
        java.lang.String str8 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("text");
        java.lang.String str13 = textNode2.attr("");
        int int14 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode;
        outputSettings12.escapeMode = escapeMode15;
        outputSettings10.setescapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        outputSettings18.prettyPrint = false;
        java.nio.charset.Charset charset22 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings7.escapeMode(escapeMode24);
        boolean boolean26 = textNode2.equals((java.lang.Object) escapeMode24);
        int int27 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document28 = textNode2.ownerDocument();
        java.lang.String str29 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode2.wrap("text");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode9.wrap("text");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("text");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str12 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList2 = textNode0.childNodes();
        org.jsoup.nodes.Document document3 = textNode0.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode0.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.toString();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        java.lang.String str11 = textNode2.text();
        textNode2.text = "hi!";
        java.lang.String str14 = textNode2.outerHtml();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.lang.String str17 = textNode2.attr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList2 = textNode0.childNodes();
        int int3 = textNode0.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.toString();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode4.siblingNodes();
        java.lang.String str6 = textNode4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode4.wrap("#text");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.getTEXT_KEY();
        org.jsoup.nodes.Document document2 = textNode0.ownerDocument();
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings10.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode;
        outputSettings12.escapeMode = escapeMode15;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings10.escapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings9.escapeMode(escapeMode15);
        boolean boolean19 = outputSettings18.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings20.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings20.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings24.charsetEncoder;
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings24.encoder();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode29.setBaseUri("hi!");
        boolean boolean33 = textNode29.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings37.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings40.escapeMode;
        outputSettings39.escapeMode = escapeMode42;
        outputSettings37.setescapeMode(escapeMode42);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings45.escapeMode();
        outputSettings45.prettyPrint = false;
        java.nio.charset.Charset charset49 = outputSettings45.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings37.charset(charset49);
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings34.escapeMode(escapeMode51);
        boolean boolean53 = textNode29.equals((java.lang.Object) escapeMode51);
        outputSettings24.escapeMode = escapeMode51;
        outputSettings18.setescapeMode(escapeMode51);
        java.nio.charset.CharsetEncoder charsetEncoder56 = outputSettings18.getcharsetEncoder();
        boolean boolean57 = textNode2.equals((java.lang.Object) charsetEncoder56);
        org.jsoup.nodes.Node node60 = textNode2.attr("hi!", "");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode77 = outputSettings76.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode80 = outputSettings79.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode81 = outputSettings79.escapeMode;
        outputSettings78.escapeMode = escapeMode81;
        outputSettings76.setescapeMode(escapeMode81);
        org.jsoup.nodes.Document.OutputSettings outputSettings84 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode85 = outputSettings84.escapeMode();
        outputSettings84.prettyPrint = false;
        java.nio.charset.Charset charset88 = outputSettings84.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings89 = outputSettings76.charset(charset88);
        org.jsoup.nodes.Entities.EscapeMode escapeMode90 = outputSettings89.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings91 = outputSettings74.escapeMode(escapeMode90);
        java.nio.charset.CharsetEncoder charsetEncoder92 = outputSettings91.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings94 = outputSettings91.prettyPrint(false);
        boolean boolean95 = textNode2.equals((java.lang.Object) outputSettings91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node97 = textNode2.wrap("hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        java.lang.String str6 = textNode2.attr("");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.attr("text");
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text;
        textNode2.text = "text";
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        textNode2.ensureAttributes();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        boolean boolean4 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str4 = textNode2.attr("#text");
        boolean boolean5 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings10.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode;
        outputSettings12.escapeMode = escapeMode15;
        outputSettings10.setescapeMode(escapeMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        outputSettings18.prettyPrint = false;
        java.nio.charset.Charset charset22 = outputSettings18.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings10.charset(charset22);
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings7.escapeMode(escapeMode24);
        boolean boolean26 = textNode2.equals((java.lang.Object) escapeMode24);
        int int27 = textNode2.siblingIndex();
        java.lang.String str28 = textNode2.toString();
        int int29 = textNode2.siblingIndex();
        java.lang.String str30 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = textNode2.wrap("#");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("text");
        java.lang.String str13 = textNode2.attr("");
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("#");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        java.lang.String str8 = textNode7.gettext();
        java.lang.String str9 = textNode7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("#text");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str14 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.settext("");
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        java.lang.String str9 = textNode2.text;
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("text");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.attr("text", "hi!");
        java.lang.String str9 = textNode2.text;
        java.lang.String str11 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        textNode2.text = "#text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node8.wrap("text");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        java.lang.String str10 = textNode9.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("#text");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        textNode2.settext("#text");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        int int10 = textNode9.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("#");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("text");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.gettext();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("t");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        textNode2.settext("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("t");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.gettext();
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.settext("text");
        java.lang.String str5 = textNode2.getTEXT_KEY();
        textNode2.text = "";
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        textNode2.text = "#text";
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node16 = textNode2.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str8 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        textNode2.settext("#text");
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        java.lang.String str6 = textNode2.attr("");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        textNode2.setBaseUri("hi!");
        java.lang.String str11 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.attr("text");
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = textNode2.attr("#", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("t");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.lang.String str8 = textNode2.text;
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.absUrl("hi!");
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "t");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("t");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.Node node12 = textNode11.previousSibling();
        textNode11.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode11.wrap("#text");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode5.getTEXT_KEY();
        textNode5.text = "text";
        org.jsoup.nodes.Node node10 = textNode5.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode5.wrap("t");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str7 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        textNode2.settext("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("ext");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.attr("text");
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.settext("#text");
        boolean boolean8 = textNode2.hasAttr("text");
        java.lang.String str9 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.getTEXT_KEY();
        java.lang.String str9 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("t");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("text");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.text = "#";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("ext");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        org.jsoup.nodes.Node node13 = textNode12.clone();
        textNode12.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode12.wrap("h");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.gettext();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#text");
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("i!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        textNode2.text = "hi!";
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        int int3 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        boolean boolean9 = textNode2.hasAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "text");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("t");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        boolean boolean9 = textNode2.isBlank();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("hi!");
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.text;
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode10.wrap("h");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean9 = textNode2.hasAttr("hi!");
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }
}

