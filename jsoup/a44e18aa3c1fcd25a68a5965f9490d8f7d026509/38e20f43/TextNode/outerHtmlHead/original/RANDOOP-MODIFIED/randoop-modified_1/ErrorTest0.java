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
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("#text");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode8.wrap("#text");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        java.lang.String str65 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node67 = textNode2.wrap("#text");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#text");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        boolean boolean11 = textNode8.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#text");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        int int10 = node9.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("hi!");
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode6.text("hi!");
        int int13 = textNode6.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("#text");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.attr("#text");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        boolean boolean9 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.Node node14 = textNode8.removeAttr("hi!");
        node14.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node14.wrap("hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = node6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("#text");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node10 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("#text");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        boolean boolean7 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        boolean boolean9 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        java.lang.String str65 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node67 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node68 = node67.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node70 = node68.wrap("hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode14.wrap("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("#text");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        java.lang.String str14 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        java.lang.String str12 = textNode10.attr("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode10.wrap("#text");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("#text");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.Node node14 = textNode8.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node16 = textNode10.removeAttr("#text");
        int int17 = textNode10.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode10.wrap("#text");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(true);
        int int6 = outputSettings3.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings9.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings3.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount(1);
        boolean boolean18 = textNode2.equals((java.lang.Object) outputSettings15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("hi!");
        textNode9.setBaseUri("#text");
        java.lang.String str12 = textNode9.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode9.wrap("#text");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        int int5 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        java.lang.String str12 = textNode9.getWholeText();
        int int13 = textNode9.siblingIndex();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        boolean boolean18 = textNode16.isBlank();
        java.lang.String str20 = textNode16.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.siblingNodes();
        boolean boolean22 = textNode9.equals((java.lang.Object) nodeList21);
        boolean boolean23 = textNode2.equals((java.lang.Object) boolean22);
        org.jsoup.nodes.TextNode textNode25 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.baseUri();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        textNode2.setBaseUri("#text");
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.baseUri();
        int int8 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.TextNode textNode13 = textNode8.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("#text");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        int int8 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str9 = textNode8.text();
        java.lang.String str10 = textNode8.nodeName();
        java.lang.String str11 = textNode8.toString();
        java.lang.String str12 = textNode8.outerHtml();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str16 = textNode2.attr("hi!");
        boolean boolean17 = textNode2.isBlank();
        org.jsoup.nodes.Node node18 = textNode2.parent();
        java.lang.String str19 = textNode2.nodeName();
        boolean boolean20 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.getWholeText();
        java.lang.String str12 = textNode9.toString();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        org.jsoup.nodes.Node node14 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.attr("hi!");
        java.lang.String str6 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        java.lang.String str14 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode6.wrap("#text");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "hi!");
        boolean boolean10 = textNode2.equals((java.lang.Object) '#');
        java.lang.String str11 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode11.setBaseUri("");
        java.lang.String str15 = textNode11.absUrl("#text");
        java.lang.String str16 = textNode11.baseUri();
        org.jsoup.nodes.Node node17 = textNode11.clone();
        boolean boolean18 = textNode6.equals((java.lang.Object) node17);
        java.lang.String str19 = textNode6.toString();
        textNode6.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode6.wrap("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("#text");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node10 = node9.clone();
        org.jsoup.nodes.Node node11 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("#text");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node17 = textNode8.attr("#text", "");
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node17.wrap("hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node15 = textNode14.parent();
        java.lang.String str17 = textNode14.attr("#text");
        boolean boolean19 = textNode14.hasAttr("#text");
        java.lang.String str20 = textNode14.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(true);
        int int24 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings33.escapeMode();
        java.nio.charset.Charset charset40 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings28.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings45.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings52.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings52.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings49.escapeMode(escapeMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings60.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings62.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings62.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings62.escapeMode();
        java.nio.charset.Charset charset69 = outputSettings62.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings59.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings42.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings28.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings26.charset(charset69);
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings73.escapeMode();
        boolean boolean75 = textNode14.equals((java.lang.Object) outputSettings73);
        org.jsoup.nodes.Node node76 = textNode14.clone();
        boolean boolean77 = textNode2.equals((java.lang.Object) node76);
        java.lang.String str78 = textNode2.baseUri();
        org.jsoup.nodes.Node node79 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node81 = textNode2.wrap("hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("#text");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        boolean boolean6 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("#text");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        java.lang.String str10 = textNode8.baseUri();
        org.jsoup.nodes.Node node12 = textNode8.removeAttr("#text");
        java.lang.String str13 = textNode8.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode8.wrap("#text");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        java.lang.String str10 = textNode8.baseUri();
        org.jsoup.nodes.Node node12 = textNode8.removeAttr("#text");
        java.lang.String str13 = textNode8.getWholeText();
        boolean boolean15 = textNode8.equals((java.lang.Object) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode8.wrap("#text");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.equals((java.lang.Object) 1);
        boolean boolean7 = textNode2.isBlank();
        boolean boolean9 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("#text");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodesCopy();
        java.lang.String str14 = textNode6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode6.wrap("#text");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.siblingNodes();
        java.lang.String str9 = textNode7.outerHtml();
        java.lang.String str10 = textNode7.baseUri();
        java.lang.String str11 = textNode7.baseUri();
        org.jsoup.nodes.Node node12 = textNode7.nextSibling();
        java.lang.String str14 = textNode7.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode7.childNodesCopy();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str17 = textNode7.nodeName();
        org.jsoup.nodes.Document document18 = textNode7.ownerDocument();
        org.jsoup.nodes.Document document19 = textNode7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode7.wrap("#text");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        java.lang.String str14 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("hi!");
        int int13 = textNode12.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode12.wrap("#text");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Node node18 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node18.wrap("#text");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        boolean boolean11 = textNode6.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("text");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        int int14 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode6.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("#text");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = node3.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node3.wrap("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Node node11 = textNode10.parent();
        java.lang.String str13 = textNode10.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode10.wrap("hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        boolean boolean12 = outputSettings9.prettyPrint();
        boolean boolean13 = textNode2.equals((java.lang.Object) boolean12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings10.escapeMode();
        boolean boolean16 = textNode6.equals((java.lang.Object) escapeMode15);
        java.lang.String str17 = textNode6.text();
        java.lang.String str19 = textNode6.attr("");
        org.jsoup.nodes.Node node20 = textNode6.clone();
        java.lang.String str21 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode6.wrap("text");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.text();
        boolean boolean12 = textNode2.isBlank();
        int int13 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.nodeName();
        int int8 = textNode2.childNodeSize();
        int int9 = textNode2.childNodeSize();
        boolean boolean11 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.text();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.absUrl("#text");
        textNode2.setBaseUri("");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node6.wrap("#text");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.siblingNodes();
        java.lang.String str9 = textNode7.outerHtml();
        java.lang.String str10 = textNode7.baseUri();
        java.lang.String str11 = textNode7.baseUri();
        org.jsoup.nodes.Node node12 = textNode7.nextSibling();
        java.lang.String str14 = textNode7.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode7.childNodesCopy();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str17 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("text");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodesCopy();
        java.lang.String str12 = textNode6.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode6.wrap("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "#text");
        java.lang.String str7 = textNode2.toString();
        boolean boolean8 = textNode2.isBlank();
        int int9 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        org.jsoup.nodes.Attributes attributes12 = textNode9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.siblingNodes();
        boolean boolean14 = textNode2.equals((java.lang.Object) nodeList13);
        org.jsoup.nodes.Node node15 = textNode2.previousSibling();
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "#text");
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        java.lang.String str12 = textNode10.outerHtml();
        java.lang.String str13 = textNode10.baseUri();
        java.lang.String str14 = textNode10.baseUri();
        org.jsoup.nodes.Node node15 = textNode10.nextSibling();
        java.lang.String str17 = textNode10.attr("hi!");
        java.lang.String str19 = textNode10.attr("#text");
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.equals((java.lang.Object) 1);
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str13 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("");
        java.lang.String str15 = textNode14.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode14.wrap("hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "#text");
        int int12 = textNode11.siblingIndex();
        java.lang.String str13 = textNode11.baseUri();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        java.lang.String str18 = textNode16.outerHtml();
        java.lang.String str19 = textNode16.baseUri();
        java.lang.String str20 = textNode16.baseUri();
        org.jsoup.nodes.Node node21 = textNode16.nextSibling();
        java.lang.String str23 = textNode16.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode16.childNodesCopy();
        boolean boolean25 = textNode11.equals((java.lang.Object) textNode16);
        org.jsoup.nodes.Node node26 = textNode16.parent();
        boolean boolean27 = textNode2.equals((java.lang.Object) textNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode16.wrap("#text");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode2.equals((java.lang.Object) nodeList6);
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("");
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.nodeName();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node8.wrap("#text");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        boolean boolean14 = textNode10.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode10.childNodes();
        boolean boolean16 = textNode2.equals((java.lang.Object) nodeList15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("text");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node15 = textNode14.parent();
        java.lang.String str17 = textNode14.attr("#text");
        boolean boolean19 = textNode14.hasAttr("#text");
        java.lang.String str20 = textNode14.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(true);
        int int24 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings33.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings33.escapeMode();
        java.nio.charset.Charset charset40 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings28.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings45.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings52.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode57 = outputSettings52.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings49.escapeMode(escapeMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings60.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = outputSettings62.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings62.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode67 = outputSettings62.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode68 = outputSettings62.escapeMode();
        java.nio.charset.Charset charset69 = outputSettings62.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings59.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings42.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings28.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = outputSettings26.charset(charset69);
        org.jsoup.nodes.Entities.EscapeMode escapeMode74 = outputSettings73.escapeMode();
        boolean boolean75 = textNode14.equals((java.lang.Object) outputSettings73);
        org.jsoup.nodes.Node node76 = textNode14.clone();
        boolean boolean77 = textNode2.equals((java.lang.Object) node76);
        int int78 = textNode2.siblingIndex();
        java.lang.String str79 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node81 = textNode2.wrap("hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        org.jsoup.nodes.Document document10 = textNode8.ownerDocument();
        boolean boolean11 = textNode8.isBlank();
        boolean boolean13 = textNode8.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode8.wrap("text");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode6.setBaseUri("hi!");
        textNode6.setBaseUri("#text");
        java.lang.String str11 = textNode6.getWholeText();
        textNode6.setBaseUri("");
        java.lang.String str14 = textNode6.toString();
        org.jsoup.nodes.Node node17 = textNode6.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode6.wrap("hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.clone();
        boolean boolean19 = textNode2.equals((java.lang.Object) outputSettings15);
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("#text");
        java.lang.String str22 = textNode2.text();
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("#text");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        boolean boolean8 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        java.lang.String str65 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node67 = textNode2.removeAttr("hi!");
        java.lang.String str68 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node70 = textNode2.wrap("#text");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("#text");
        java.lang.String str12 = textNode10.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode10.wrap("text");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node16 = textNode10.removeAttr("#text");
        org.jsoup.nodes.Node node17 = node16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node16.wrap("hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.childNodeSize();
        boolean boolean67 = textNode2.hasAttr("");
        boolean boolean69 = textNode2.hasAttr("#text");
        int int70 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node72 = textNode2.wrap("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        int int7 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.childNodeSize();
        boolean boolean10 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("#text");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.equals((java.lang.Object) 1);
        boolean boolean7 = textNode2.isBlank();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("text");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.childNodeSize();
        boolean boolean67 = textNode2.hasAttr("");
        boolean boolean69 = textNode2.hasAttr("#text");
        int int70 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node71 = textNode2.previousSibling();
        int int72 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node74 = textNode2.wrap("text");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.Node node15 = textNode2.clone();
        java.lang.String str17 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode19.wrap("#text");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        org.jsoup.nodes.Attributes attributes11 = textNode6.attributes();
        org.jsoup.nodes.Node node12 = textNode6.clone();
        org.jsoup.nodes.Node node13 = textNode6.clone();
        org.jsoup.nodes.Node node14 = textNode6.parent();
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("#text");
        int int17 = textNode6.childNodeSize();
        java.lang.String str18 = textNode6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode6.wrap("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        java.lang.String str12 = textNode10.attr("hi!");
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        java.lang.String str17 = textNode10.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode10.wrap("#text");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        int int14 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node17 = textNode6.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode6.wrap("#text");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        boolean boolean12 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        int int16 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.attr("#text");
        int int10 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("text");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.nodeName();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str11 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str7 = textNode5.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode5.wrap("text");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.prettyPrint(false);
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings8);
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.siblingNodes();
        java.lang.String str21 = textNode19.outerHtml();
        java.lang.String str22 = textNode19.getWholeText();
        int int23 = textNode19.siblingIndex();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        boolean boolean28 = textNode26.isBlank();
        java.lang.String str30 = textNode26.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode26.siblingNodes();
        boolean boolean32 = textNode19.equals((java.lang.Object) nodeList31);
        boolean boolean33 = textNode2.equals((java.lang.Object) boolean32);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode2.siblingNodes();
        int int35 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode2.childNodes();
        java.lang.String str37 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = textNode2.wrap("#");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        java.lang.String str7 = node5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node5.wrap("hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node16 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str20 = textNode19.text();
        java.lang.String str21 = textNode19.nodeName();
        java.lang.String str22 = textNode19.toString();
        org.jsoup.nodes.Node node23 = textNode19.previousSibling();
        java.lang.String str24 = textNode19.toString();
        int int25 = textNode19.childNodeSize();
        boolean boolean26 = textNode8.equals((java.lang.Object) textNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode19.wrap("#");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str11 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        java.lang.String str65 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node67 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node68 = node67.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = node67.childNodes();
        java.lang.String str70 = node67.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node72 = node67.wrap("#");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("text");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode10.setBaseUri("");
        java.lang.String str14 = textNode10.absUrl("#text");
        java.lang.String str15 = textNode10.baseUri();
        org.jsoup.nodes.Node node16 = textNode10.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode10.siblingNodes();
        org.jsoup.nodes.Attributes attributes18 = textNode10.attributes();
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.siblingNodes();
        java.lang.String str24 = textNode22.outerHtml();
        java.lang.String str25 = textNode22.baseUri();
        org.jsoup.nodes.Node node28 = textNode22.attr("hi!", "hi!");
        boolean boolean29 = textNode22.isBlank();
        java.lang.String str30 = textNode22.baseUri();
        org.jsoup.nodes.Document document31 = textNode22.ownerDocument();
        org.jsoup.nodes.Node node33 = textNode22.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode22.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings35.clone();
        boolean boolean39 = textNode22.equals((java.lang.Object) outputSettings35);
        boolean boolean40 = textNode10.equals((java.lang.Object) textNode22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = textNode22.wrap("hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("text");
        org.jsoup.nodes.Document document17 = textNode16.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode16.wrap("#text");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        java.lang.String str13 = textNode8.attr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.prettyPrint(false);
        int int24 = outputSettings16.indentAmount();
        boolean boolean25 = textNode8.equals((java.lang.Object) outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode8.childNodes();
        int int27 = textNode8.childNodeSize();
        java.lang.String str28 = textNode8.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode8.wrap("#text");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("#text");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean10 = textNode9.isBlank();
        textNode9.setBaseUri("");
        int int13 = textNode9.siblingIndex();
        boolean boolean14 = textNode9.isBlank();
        org.jsoup.nodes.TextNode textNode16 = textNode9.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode9.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode9.wrap("#");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str5 = textNode2.absUrl("#text");
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode4.wrap("#");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.getWholeText();
        java.lang.String str12 = textNode9.toString();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node16 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("text");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("");
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        org.jsoup.nodes.Document document10 = textNode8.ownerDocument();
        org.jsoup.nodes.Node node13 = textNode8.attr("#text", "");
        boolean boolean14 = textNode8.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.clone();
        java.lang.String str10 = textNode7.attr("");
        java.lang.String str11 = textNode7.baseUri();
        java.lang.String str13 = textNode7.absUrl("#text");
        boolean boolean14 = textNode2.equals((java.lang.Object) "#text");
        java.lang.String str15 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("#");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.siblingIndex();
        boolean boolean11 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        java.lang.String str12 = textNode9.text();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode9.childNodesCopy();
        textNode9.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode9.wrap("#");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        boolean boolean11 = textNode8.hasAttr("");
        int int12 = textNode8.siblingIndex();
        java.lang.String str13 = textNode8.outerHtml();
        java.lang.String str14 = textNode8.baseUri();
        boolean boolean15 = textNode8.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode8.wrap("text");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode11.setBaseUri("");
        int int14 = textNode11.childNodeSize();
        java.lang.String str15 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("");
        org.jsoup.nodes.Node node18 = textNode11.clone();
        boolean boolean19 = textNode8.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node22 = textNode8.attr("#text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode8.wrap("#text");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        int int11 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("#text");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        java.lang.String str18 = textNode15.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode15.wrap("text");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean13 = textNode11.hasAttr("");
        boolean boolean15 = textNode11.equals((java.lang.Object) (byte) 1);
        boolean boolean16 = textNode11.isBlank();
        java.lang.String str17 = textNode11.nodeName();
        boolean boolean18 = textNode2.equals((java.lang.Object) str17);
        boolean boolean20 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("#text");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node16 = textNode10.removeAttr("#text");
        int int17 = textNode10.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode10.parent();
        java.lang.String str19 = textNode10.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode10.wrap("hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        org.jsoup.nodes.Node node11 = node8.nextSibling();
        org.jsoup.nodes.Node node12 = node8.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node8.wrap("#text");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#text");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.Node node10 = textNode8.clone();
        java.lang.String str12 = textNode8.attr("");
        org.jsoup.nodes.TextNode textNode14 = textNode8.text("");
        boolean boolean16 = textNode14.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode14.wrap("#");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.toString();
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("text");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        textNode2.setBaseUri("");
        boolean boolean10 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        node9.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("#");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.nodeName();
        int int9 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str5 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        int int3 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean8 = textNode2.hasAttr("hi!");
        java.lang.String str10 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode2.equals((java.lang.Object) textNode11);
        java.lang.String str13 = textNode11.toString();
        java.lang.String str14 = textNode11.text();
        java.lang.String str16 = textNode11.attr("#text");
        java.lang.String str18 = textNode11.attr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode11.wrap("#text");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        boolean boolean11 = textNode8.hasAttr("");
        java.lang.String str13 = textNode8.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode8.siblingNodes();
        org.jsoup.nodes.Node node15 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("#text");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode6.setBaseUri("hi!");
        textNode6.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("#text");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        org.jsoup.nodes.Node node11 = textNode8.attr("#text", "");
        java.lang.String str12 = textNode8.outerHtml();
        java.lang.String str13 = textNode8.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode8.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("text");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "");
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode9.wrap("#text");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        boolean boolean8 = textNode6.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode13.text();
        java.lang.String str15 = textNode13.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode13.text("");
        textNode17.setBaseUri("hi!");
        textNode17.setBaseUri("#text");
        boolean boolean23 = textNode17.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode17.siblingNodes();
        boolean boolean25 = textNode2.equals((java.lang.Object) nodeList24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("#");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode11.setBaseUri("");
        java.lang.String str15 = textNode11.absUrl("#text");
        java.lang.String str16 = textNode11.baseUri();
        org.jsoup.nodes.Node node17 = textNode11.clone();
        boolean boolean18 = textNode6.equals((java.lang.Object) node17);
        int int19 = textNode6.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode6.wrap("#");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean9 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node17 = textNode8.attr("#text", "");
        java.lang.String str18 = textNode8.getWholeText();
        java.lang.String str19 = textNode8.getWholeText();
        boolean boolean20 = textNode8.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode8.wrap("hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.text();
        boolean boolean14 = textNode2.isBlank();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode18.wrap("text");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        org.jsoup.nodes.Node node11 = textNode8.attr("#text", "");
        boolean boolean12 = textNode8.isBlank();
        java.lang.String str13 = textNode8.outerHtml();
        org.jsoup.nodes.Node node16 = textNode8.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode8.wrap("hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        int int8 = textNode7.siblingIndex();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("text");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.siblingNodes();
        java.lang.String str20 = textNode18.outerHtml();
        java.lang.String str21 = textNode18.baseUri();
        org.jsoup.nodes.Node node22 = textNode18.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode18.siblingNodes();
        org.jsoup.nodes.TextNode textNode25 = textNode18.text("#text");
        org.jsoup.nodes.TextNode textNode27 = textNode18.text("hi!");
        boolean boolean28 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node29 = textNode2.nextSibling();
        java.lang.String str30 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode2.wrap("#text");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.siblingNodes();
        java.lang.String str8 = textNode6.outerHtml();
        java.lang.String str9 = textNode6.baseUri();
        org.jsoup.nodes.Node node10 = textNode6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.text("#text");
        org.jsoup.nodes.TextNode textNode15 = textNode6.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings18.escapeMode();
        boolean boolean25 = textNode15.equals((java.lang.Object) outputSettings18);
        org.jsoup.nodes.Node node26 = textNode15.clone();
        boolean boolean27 = textNode2.equals((java.lang.Object) node26);
        org.jsoup.nodes.TextNode textNode29 = textNode2.text("#text");
        boolean boolean31 = textNode29.hasAttr("hi!");
        java.lang.String str32 = textNode29.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = textNode29.wrap("text");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode6.text("#text");
        java.lang.String str15 = textNode6.attr("hi!");
        org.jsoup.nodes.Node node16 = textNode6.clone();
        textNode6.setBaseUri("hi!");
        java.lang.String str19 = textNode6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode6.wrap("hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("#text");
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str14 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document15 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#text");
        textNode12.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode12.wrap("#text");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.siblingIndex();
        boolean boolean66 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node68 = textNode2.wrap("text");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        int int12 = textNode11.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode11.wrap("#text");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        java.lang.String str18 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.nodes.Document document19 = node17.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node17.wrap("hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        org.jsoup.nodes.Attributes attributes19 = textNode14.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode14.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode14.siblingNodes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("#text");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode9.wrap("hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings14.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings14.escapeMode();
        boolean boolean21 = textNode11.equals((java.lang.Object) outputSettings14);
        java.lang.String str22 = textNode11.nodeName();
        org.jsoup.nodes.Attributes attributes23 = textNode11.attributes();
        org.jsoup.nodes.Node node24 = textNode11.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode11.wrap("#text");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("text", "#");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str16 = textNode15.text();
        java.lang.String str17 = textNode15.nodeName();
        boolean boolean19 = textNode15.hasAttr("#text");
        boolean boolean20 = textNode15.isBlank();
        org.jsoup.nodes.Node node22 = textNode15.removeAttr("#text");
        org.jsoup.nodes.Node node23 = textNode15.previousSibling();
        java.lang.String str24 = textNode15.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(true);
        int int28 = outputSettings27.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.clone();
        boolean boolean30 = textNode15.equals((java.lang.Object) outputSettings27);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings36.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings36.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset43 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings31.charset(charset43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings44.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings47.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings49.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings54.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings54.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings49.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings46.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings27.escapeMode(escapeMode59);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings62.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        boolean boolean65 = node12.equals((java.lang.Object) outputSettings63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node67 = node12.wrap("#text");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.attr("");
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("#text");
        org.jsoup.nodes.Node node9 = textNode6.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        java.lang.String str12 = textNode6.absUrl("hi!");
        java.lang.String str13 = textNode6.getWholeText();
        org.jsoup.nodes.Node node15 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node16 = node15.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("text");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("#");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        int int15 = textNode8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode8.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode8.wrap("hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node18 = textNode2.parent();
        boolean boolean19 = textNode2.isBlank();
        java.lang.String str20 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("#text");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        java.lang.String str65 = textNode2.toString();
        java.lang.String str66 = textNode2.nodeName();
        java.lang.String str67 = textNode2.toString();
        java.lang.String str68 = textNode2.text();
        java.lang.String str69 = textNode2.toString();
        org.jsoup.nodes.Node node71 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node73 = node71.wrap("text");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(false);
        boolean boolean12 = outputSettings9.prettyPrint();
        boolean boolean13 = textNode2.equals((java.lang.Object) boolean12);
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        org.jsoup.nodes.Node node18 = textNode15.clone();
        node18.setBaseUri("hi!");
        org.jsoup.nodes.Document document21 = node18.ownerDocument();
        org.jsoup.nodes.Node node22 = node18.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node18.wrap("hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode7.setBaseUri("");
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("hi!");
        boolean boolean12 = textNode2.equals((java.lang.Object) textNode11);
        boolean boolean13 = textNode11.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode11.wrap("text");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode6.text("#text");
        java.lang.String str15 = textNode6.attr("hi!");
        org.jsoup.nodes.Node node16 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.siblingNodes();
        java.lang.String str9 = textNode7.toString();
        java.lang.String str11 = textNode7.absUrl("#text");
        java.lang.String str13 = textNode7.attr("");
        org.jsoup.nodes.Node node14 = textNode7.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode7.wrap("hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str13 = textNode2.absUrl("#text");
        java.lang.String str15 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node66 = textNode2.clone();
        org.jsoup.nodes.Node node67 = textNode2.clone();
        textNode2.setBaseUri("hi!");
        java.lang.String str70 = textNode2.toString();
        boolean boolean71 = textNode2.isBlank();
        org.jsoup.nodes.Node node73 = textNode2.removeAttr("hi!");
        java.lang.String str75 = textNode2.absUrl("#text");
        java.lang.String str76 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node78 = textNode2.wrap("#");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode11.setBaseUri("");
        int int14 = textNode11.childNodeSize();
        java.lang.String str15 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("");
        org.jsoup.nodes.Node node18 = textNode11.clone();
        boolean boolean19 = textNode8.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node22 = textNode8.attr("#text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node22.wrap("#");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode6.getWholeText();
        java.lang.String str10 = textNode6.toString();
        org.jsoup.nodes.Node node11 = textNode6.parent();
        java.lang.String str12 = textNode6.toString();
        java.lang.String str13 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("#");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings4.indentAmount(0);
        boolean boolean9 = textNode2.equals((java.lang.Object) 0);
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        java.lang.String str15 = textNode2.outerHtml();
        org.jsoup.nodes.Node node16 = textNode2.clone();
        java.lang.String str17 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "");
        boolean boolean17 = textNode2.isBlank();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("hi!");
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode6.text("hi!");
        java.lang.String str13 = textNode6.outerHtml();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode6.wrap("text");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        boolean boolean13 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        int int8 = textNode6.childNodeSize();
        boolean boolean9 = textNode6.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("hi!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.text();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str7 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings31.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings31.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings31.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings31.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings41.escapeMode();
        boolean boolean47 = outputSettings41.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings41.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings31.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings26.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings15.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings14.escapeMode(escapeMode48);
        boolean boolean53 = textNode2.equals((java.lang.Object) escapeMode48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node55 = textNode2.wrap("#text");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        textNode2.setBaseUri("hi!");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.toString();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("#");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        int int5 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode15.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode15.siblingNodes();
        org.jsoup.nodes.Attributes attributes20 = textNode15.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode15.wrap("#");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("text");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("hi!");
        int int14 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        org.jsoup.nodes.Node node12 = textNode11.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode11.wrap("#text");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        org.jsoup.nodes.Attributes attributes19 = textNode14.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode14.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode14.siblingNodes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node23 = textNode14.parent();
        java.lang.String str24 = textNode14.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode14.wrap("#text");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "#text");
        java.lang.String str10 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "");
        boolean boolean17 = textNode2.isBlank();
        org.jsoup.nodes.Node node18 = textNode2.previousSibling();
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node21.wrap("#text");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "#text");
        java.lang.String str7 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str10 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode2.equals((java.lang.Object) nodeList6);
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("text");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("text");
        java.lang.String str13 = textNode12.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode12.wrap("text");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.attr("");
        java.lang.String str10 = textNode2.attr("");
        java.lang.String str11 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node18 = textNode2.parent();
        java.lang.String str19 = textNode2.getWholeText();
        java.lang.String str20 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#text");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.childNodeSize();
        boolean boolean67 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node69 = textNode2.wrap("#");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "hi!");
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str12 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        node10.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node10.wrap("#text");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node15.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node15.wrap("#text");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode6.getWholeText();
        java.lang.String str10 = textNode6.toString();
        org.jsoup.nodes.Node node11 = textNode6.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("#");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode13.setBaseUri("");
        org.jsoup.nodes.Node node16 = textNode13.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode13.siblingNodes();
        org.jsoup.nodes.Node node20 = textNode13.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document24 = textNode23.ownerDocument();
        boolean boolean26 = textNode23.hasAttr("hi!");
        org.jsoup.nodes.Node node28 = textNode23.removeAttr("hi!");
        boolean boolean29 = node20.equals((java.lang.Object) node28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.prettyPrint(true);
        int int33 = outputSettings32.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings35.escapeMode();
        boolean boolean38 = node20.equals((java.lang.Object) escapeMode37);
        boolean boolean39 = textNode2.equals((java.lang.Object) boolean38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node41 = textNode2.wrap("#");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("text");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        java.lang.String str13 = textNode8.attr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.prettyPrint(false);
        int int24 = outputSettings16.indentAmount();
        boolean boolean25 = textNode8.equals((java.lang.Object) outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode8.childNodes();
        org.jsoup.nodes.Attributes attributes27 = textNode8.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode8.wrap("hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.getWholeText();
        java.lang.String str12 = textNode9.toString();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node16 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node16 = textNode8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = textNode8.attributes();
        org.jsoup.nodes.Node node20 = textNode8.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("#");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "hi!");
        boolean boolean10 = textNode2.equals((java.lang.Object) '#');
        java.lang.String str11 = textNode2.baseUri();
        int int12 = textNode2.siblingIndex();
        java.lang.String str14 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        java.lang.String str15 = textNode13.outerHtml();
        java.lang.String str16 = textNode13.baseUri();
        org.jsoup.nodes.Node node17 = textNode13.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) node17);
        java.lang.String str19 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodesCopy();
        java.lang.String str21 = textNode2.baseUri();
        boolean boolean22 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("text");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode11.setBaseUri("");
        int int14 = textNode11.childNodeSize();
        java.lang.String str15 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode17 = textNode11.text("");
        org.jsoup.nodes.Node node18 = textNode11.clone();
        boolean boolean19 = textNode8.equals((java.lang.Object) node18);
        int int20 = textNode8.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode8.wrap("i!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("i!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.text();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        java.lang.String str19 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#text");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.lang.String str17 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        java.lang.String str12 = textNode10.attr("hi!");
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("");
        boolean boolean16 = textNode10.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode10.wrap("hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean4 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Node node17 = textNode15.removeAttr("hi!");
        org.jsoup.nodes.Node node18 = textNode15.clone();
        node18.setBaseUri("hi!");
        org.jsoup.nodes.Document document21 = node18.ownerDocument();
        org.jsoup.nodes.Node node22 = node18.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node22.wrap("hi!");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        java.lang.String str12 = textNode9.getWholeText();
        int int13 = textNode9.siblingIndex();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        boolean boolean18 = textNode16.isBlank();
        java.lang.String str20 = textNode16.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode16.siblingNodes();
        boolean boolean22 = textNode9.equals((java.lang.Object) nodeList21);
        boolean boolean23 = textNode2.equals((java.lang.Object) boolean22);
        org.jsoup.nodes.TextNode textNode25 = textNode2.text("hi!");
        textNode25.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode25.wrap("text");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        org.jsoup.nodes.Node node11 = textNode8.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("i!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "");
        textNode2.setBaseUri("#text");
        java.lang.String str13 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.absUrl("hi!");
        java.lang.String str10 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        boolean boolean11 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings12.indentAmount((int) (byte) 100);
        boolean boolean17 = textNode5.equals((java.lang.Object) (byte) 100);
        org.jsoup.nodes.Node node20 = textNode5.attr("hi!", "hi!");
        java.lang.String str21 = textNode5.toString();
        java.lang.String str22 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode24 = textNode5.text("");
        org.jsoup.nodes.Node node27 = textNode5.attr("text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = node27.wrap("#");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        java.lang.String str13 = textNode8.attr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings16.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode21 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings16.prettyPrint(false);
        int int24 = outputSettings16.indentAmount();
        boolean boolean25 = textNode8.equals((java.lang.Object) outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode8.childNodes();
        int int27 = textNode8.childNodeSize();
        org.jsoup.nodes.TextNode textNode29 = textNode8.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode29.wrap("i!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.Node node18 = textNode2.parent();
        java.lang.String str19 = textNode2.getWholeText();
        org.jsoup.nodes.Node node22 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.wrap("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.baseUri();
        boolean boolean13 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode16.setBaseUri("");
        java.lang.String str20 = textNode16.absUrl("#text");
        java.lang.String str21 = textNode16.baseUri();
        org.jsoup.nodes.Node node22 = textNode16.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode16.siblingNodes();
        org.jsoup.nodes.Node node24 = textNode16.clone();
        org.jsoup.nodes.Node node25 = textNode16.parent();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode16.wrap("i!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        org.jsoup.nodes.Node node17 = textNode13.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodesCopy();
        org.jsoup.nodes.Node node19 = textNode13.clone();
        java.lang.String str20 = textNode13.toString();
        java.lang.Class<?> wildcardClass21 = textNode13.getClass();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode13.wrap("text");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        node7.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node7.wrap("#text");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        java.lang.String str9 = textNode6.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("text");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("i!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        org.jsoup.nodes.Node node11 = textNode6.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode6.childNodesCopy();
        java.lang.String str13 = textNode6.toString();
        java.lang.String str14 = textNode6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode6.wrap("text");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.text();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.equals((java.lang.Object) 1);
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.text();
        org.jsoup.nodes.TextNode textNode11 = textNode8.text("hi!");
        org.jsoup.nodes.Node node12 = textNode8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("#");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        boolean boolean10 = textNode9.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("#");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        java.lang.String str9 = textNode6.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = textNode6.text("#text");
        org.jsoup.nodes.Node node12 = textNode11.clone();
        org.jsoup.nodes.Node node13 = node12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("i!");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.text();
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        java.lang.String str12 = textNode2.text();
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.lang.String str15 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        boolean boolean11 = textNode8.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#text");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings14.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings14.escapeMode();
        boolean boolean21 = textNode11.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Node node22 = textNode11.clone();
        org.jsoup.nodes.TextNode textNode24 = textNode11.text("hi!");
        java.lang.String str25 = textNode11.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode11.wrap("text");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str7 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("i!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode6.setBaseUri("hi!");
        textNode6.setBaseUri("#text");
        java.lang.String str11 = textNode6.getWholeText();
        java.lang.String str12 = textNode6.getWholeText();
        java.lang.String str13 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("hi!");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "");
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        boolean boolean6 = textNode2.equals((java.lang.Object) (byte) 1);
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("text");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node5 = node4.parent();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node4.childNodes();
        java.lang.String str9 = node4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node4.wrap("i!");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode15.setBaseUri("");
        int int18 = textNode15.childNodeSize();
        java.lang.String str19 = textNode15.nodeName();
        org.jsoup.nodes.TextNode textNode21 = textNode15.text("");
        org.jsoup.nodes.Node node22 = textNode15.clone();
        boolean boolean23 = textNode2.equals((java.lang.Object) node22);
        org.jsoup.nodes.Document document24 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("i!");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        org.jsoup.nodes.Node node65 = textNode2.parent();
        org.jsoup.nodes.Node node66 = textNode2.previousSibling();
        boolean boolean67 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node69 = textNode2.wrap("hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        java.lang.String str12 = textNode10.attr("hi!");
        org.jsoup.nodes.Node node15 = textNode10.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("#text");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodesCopy();
        java.lang.String str13 = textNode6.attr("");
        java.lang.String str14 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.siblingNodes();
        boolean boolean19 = textNode17.isBlank();
        java.lang.String str21 = textNode17.attr("");
        textNode17.setBaseUri("hi!");
        java.lang.String str24 = textNode17.nodeName();
        boolean boolean26 = textNode17.hasAttr("");
        org.jsoup.nodes.Node node28 = textNode17.removeAttr("#text");
        boolean boolean29 = textNode6.equals((java.lang.Object) textNode17);
        java.lang.String str30 = textNode6.text();
        java.lang.String str31 = textNode6.toString();
        org.jsoup.nodes.Node node33 = textNode6.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = textNode6.wrap("text");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.nodeName();
        java.lang.String str11 = textNode9.baseUri();
        org.jsoup.nodes.Node node13 = textNode9.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        java.lang.String str18 = textNode2.getWholeText();
        int int19 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str7 = textNode5.absUrl("hi!");
        java.lang.String str8 = textNode5.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode5.wrap("#");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str15 = textNode2.attr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("i!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.prettyPrint(false);
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings8);
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.siblingNodes();
        java.lang.String str21 = textNode19.outerHtml();
        java.lang.String str22 = textNode19.getWholeText();
        int int23 = textNode19.siblingIndex();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        boolean boolean28 = textNode26.isBlank();
        java.lang.String str30 = textNode26.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode26.siblingNodes();
        boolean boolean32 = textNode19.equals((java.lang.Object) nodeList31);
        boolean boolean33 = textNode2.equals((java.lang.Object) boolean32);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = textNode2.wrap("hi!");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node6 = textNode5.parent();
        java.lang.String str7 = textNode5.toString();
        org.jsoup.nodes.Node node8 = textNode5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.lang.String str17 = textNode16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode16.siblingNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode16.attributes();
        boolean boolean20 = textNode5.equals((java.lang.Object) textNode16);
        org.jsoup.nodes.Node node23 = textNode16.attr("#", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node23.wrap("#");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        java.lang.String str11 = textNode9.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode9.wrap("i!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str9 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        org.jsoup.nodes.Node node11 = textNode6.parent();
        java.lang.String str12 = textNode6.getWholeText();
        textNode6.setBaseUri("");
        boolean boolean15 = textNode6.isBlank();
        org.jsoup.nodes.Attributes attributes16 = textNode6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        java.lang.String str10 = textNode8.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode12.wrap("text");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode6.previousSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        org.jsoup.nodes.Node node11 = textNode6.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("#text");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str7 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.lang.String str17 = textNode16.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings20.escapeMode();
        boolean boolean26 = textNode16.equals((java.lang.Object) escapeMode25);
        java.lang.String str27 = textNode16.text();
        org.jsoup.nodes.Node node28 = textNode16.nextSibling();
        java.lang.String str29 = textNode16.nodeName();
        java.lang.String str30 = textNode16.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode16.childNodes();
        boolean boolean32 = textNode2.equals((java.lang.Object) textNode16);
        boolean boolean33 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = textNode2.wrap("i!");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        java.lang.String str17 = textNode12.outerHtml();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode19.wrap("text");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("");
        int int7 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("hi!");
        boolean boolean15 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("hi!");
        boolean boolean14 = textNode2.equals((java.lang.Object) "hi!");
        int int15 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        java.lang.String str17 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        org.jsoup.nodes.Node node64 = textNode2.clone();
        int int65 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document66 = textNode2.ownerDocument();
        java.lang.String str68 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node69 = textNode2.parent();
        java.lang.String str70 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node72 = textNode2.wrap("#");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        boolean boolean10 = textNode6.hasAttr("hi!");
        boolean boolean11 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode6.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode6.wrap("text");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        java.lang.String str9 = textNode8.outerHtml();
        java.lang.String str10 = textNode8.baseUri();
        org.jsoup.nodes.Node node12 = textNode8.removeAttr("#text");
        java.lang.String str13 = textNode8.getWholeText();
        boolean boolean15 = textNode8.hasAttr("#text");
        java.lang.String str16 = textNode8.text();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode8.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode8.wrap("text");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        java.lang.String str12 = textNode10.attr("hi!");
        org.jsoup.nodes.Document document13 = textNode10.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode10.wrap("#text");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("text");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        java.lang.String str10 = node8.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node8.wrap("i!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        boolean boolean14 = textNode6.isBlank();
        org.jsoup.nodes.Node node15 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("#text");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean10 = textNode2.hasAttr("hi!");
        java.lang.String str11 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean10 = textNode9.isBlank();
        textNode9.setBaseUri("");
        int int13 = textNode9.siblingIndex();
        boolean boolean14 = textNode9.isBlank();
        org.jsoup.nodes.TextNode textNode16 = textNode9.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode9.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.childNodes();
        org.jsoup.nodes.Node node21 = textNode9.attr("#text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode9.wrap("#");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str9 = textNode8.text();
        java.lang.String str10 = textNode8.nodeName();
        java.lang.String str11 = textNode8.toString();
        java.lang.String str12 = textNode8.outerHtml();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        int int4 = textNode2.siblingIndex();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document13 = textNode12.ownerDocument();
        boolean boolean15 = textNode12.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = textNode12.removeAttr("hi!");
        textNode12.setBaseUri("#text");
        boolean boolean20 = textNode12.isBlank();
        java.lang.String str21 = textNode12.text();
        boolean boolean22 = textNode2.equals((java.lang.Object) str21);
        java.lang.String str23 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("text");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.siblingNodes();
        java.lang.String str12 = textNode10.outerHtml();
        java.lang.String str13 = textNode10.baseUri();
        java.lang.String str14 = textNode10.baseUri();
        org.jsoup.nodes.Node node15 = textNode10.nextSibling();
        java.lang.String str17 = textNode10.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode10.childNodesCopy();
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node20 = textNode10.clone();
        org.jsoup.nodes.Node node21 = textNode10.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode10.wrap("hi!");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode2.equals((java.lang.Object) nodeList6);
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        boolean boolean11 = textNode8.hasAttr("");
        org.jsoup.nodes.Node node12 = textNode8.previousSibling();
        org.jsoup.nodes.Document document13 = textNode8.ownerDocument();
        int int14 = textNode8.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("hi!");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodesCopy();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str16 = textNode2.attr("hi!");
        boolean boolean17 = textNode2.isBlank();
        int int18 = textNode2.siblingIndex();
        java.lang.String str19 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#text");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str6 = textNode2.attr("");
        textNode2.setBaseUri("hi!");
        java.lang.String str9 = textNode2.nodeName();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        java.lang.String str13 = textNode11.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode11.wrap("text");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean4 = textNode2.hasAttr("");
        boolean boolean6 = textNode2.equals((java.lang.Object) (byte) 1);
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        boolean boolean8 = textNode6.isBlank();
        org.jsoup.nodes.Attributes attributes9 = textNode6.attributes();
        java.lang.String str10 = textNode6.baseUri();
        int int11 = textNode6.childNodeSize();
        boolean boolean12 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings8.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.prettyPrint(false);
        boolean boolean16 = textNode2.equals((java.lang.Object) outputSettings8);
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode19.siblingNodes();
        java.lang.String str21 = textNode19.outerHtml();
        java.lang.String str22 = textNode19.getWholeText();
        int int23 = textNode19.siblingIndex();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        boolean boolean28 = textNode26.isBlank();
        java.lang.String str30 = textNode26.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode26.siblingNodes();
        boolean boolean32 = textNode19.equals((java.lang.Object) nodeList31);
        boolean boolean33 = textNode2.equals((java.lang.Object) boolean32);
        boolean boolean34 = textNode2.isBlank();
        int int35 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = textNode2.wrap("#text");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "#text");
        java.lang.String str13 = node12.outerHtml();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node12.wrap("#text");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("text", "hi!");
        int int10 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("#text");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        java.lang.String str16 = textNode2.baseUri();
        java.lang.String str17 = textNode2.getWholeText();
        int int18 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        int int4 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        boolean boolean3 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings4.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings4.indentAmount(0);
        boolean boolean9 = textNode2.equals((java.lang.Object) 0);
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.equals((java.lang.Object) 1);
        boolean boolean7 = textNode2.isBlank();
        int int8 = textNode2.childNodeSize();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodes();
        int int11 = textNode9.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodes();
        org.jsoup.nodes.Node node13 = textNode9.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode9.wrap("hi!");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("#text");
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        int int12 = outputSettings11.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings21.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset28 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings16.charset(charset28);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings33.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings40.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings40.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings40.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode46);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings48.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings50.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings50.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = outputSettings50.escapeMode();
        java.nio.charset.Charset charset57 = outputSettings50.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings47.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings30.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings16.charset(charset57);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings14.charset(charset57);
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = outputSettings61.escapeMode();
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings61);
        java.lang.String str65 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node67 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node69 = textNode2.wrap("i!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        org.jsoup.nodes.Node node11 = textNode6.parent();
        org.jsoup.nodes.Node node13 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node15 = textNode6.removeAttr("hi!");
        int int16 = textNode6.siblingIndex();
        int int17 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode6.attr("#", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("i!");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode2.equals((java.lang.Object) nodeList6);
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node13 = textNode10.parent();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node16 = textNode10.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str20 = textNode19.baseUri();
        org.jsoup.nodes.Node node21 = textNode19.previousSibling();
        boolean boolean23 = textNode19.hasAttr("");
        boolean boolean24 = node16.equals((java.lang.Object) textNode19);
        org.jsoup.nodes.Node node25 = textNode19.parent();
        org.jsoup.nodes.Node node26 = textNode19.clone();
        boolean boolean28 = textNode19.hasAttr("text");
        java.lang.String str29 = textNode19.nodeName();
        org.jsoup.nodes.Node node30 = textNode19.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = node30.wrap("text");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("i!");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings18.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings25.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings25.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings22.escapeMode(escapeMode31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings22.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.indentAmount(1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = outputSettings41.escapeMode();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings41.escapeMode();
        java.nio.charset.Charset charset48 = outputSettings41.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings36.charset(charset48);
        java.nio.charset.Charset charset50 = outputSettings49.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings22.charset(charset50);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings54.prettyPrint(false);
        int int57 = outputSettings56.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings56.indentAmount(100);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = outputSettings59.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings61.indentAmount(0);
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean65 = outputSettings64.prettyPrint();
        java.nio.charset.Charset charset66 = outputSettings64.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean68 = outputSettings67.prettyPrint();
        java.nio.charset.Charset charset69 = outputSettings67.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = outputSettings64.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = outputSettings61.charset(charset69);
        org.jsoup.nodes.Document.OutputSettings outputSettings72 = outputSettings22.charset(charset69);
        boolean boolean73 = node14.equals((java.lang.Object) outputSettings72);
        org.jsoup.nodes.Node node74 = node14.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node76 = node14.wrap("text");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("hi!");
        java.lang.String str9 = textNode8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode8.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        org.jsoup.nodes.Node node14 = textNode8.attr("#text", "hi!");
        org.jsoup.nodes.Node node16 = textNode8.removeAttr("hi!");
        int int17 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode8.parent();
        java.lang.String str20 = textNode8.attr("hi!");
        boolean boolean21 = textNode8.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode8.wrap("hi!");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        java.lang.String str15 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("i!");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode6.previousSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("#text");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("hi!");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        boolean boolean7 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.childNodeSize();
        java.lang.String str17 = node14.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node14.wrap("hi!");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.attr("#text");
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        int int14 = textNode6.siblingIndex();
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("#");
        int int17 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode6.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode6.wrap("text");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str11 = textNode9.getWholeText();
        java.lang.String str12 = textNode9.toString();
        boolean boolean13 = textNode2.equals((java.lang.Object) str12);
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.lang.String str17 = textNode2.getWholeText();
        org.jsoup.nodes.Document document18 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node13 = textNode2.attr("#", "hi!");
        java.lang.String str15 = textNode2.absUrl("#text");
        java.lang.String str16 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean5 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.getWholeText();
        boolean boolean9 = textNode2.hasAttr("");
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.baseUri();
        boolean boolean16 = textNode2.equals((java.lang.Object) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "#");
        int int3 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode8.clone();
        org.jsoup.nodes.Node node10 = textNode8.previousSibling();
        boolean boolean11 = textNode8.isBlank();
        java.lang.String str12 = textNode8.outerHtml();
        java.lang.String str13 = textNode8.getWholeText();
        java.lang.String str14 = textNode8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode8.wrap("hi!");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("#text");
        java.lang.String str17 = textNode12.outerHtml();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        boolean boolean20 = textNode12.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode12.wrap("text");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node6 = textNode5.parent();
        java.lang.String str7 = textNode5.toString();
        org.jsoup.nodes.Node node8 = textNode5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode5.siblingNodes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.lang.String str17 = textNode16.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode16.siblingNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode16.attributes();
        boolean boolean20 = textNode5.equals((java.lang.Object) textNode16);
        boolean boolean21 = textNode5.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode5.wrap("text");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str5 = textNode2.attr("");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.attr("text", "hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str12 = textNode10.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.siblingNodes();
        textNode10.setBaseUri("hi!");
        java.lang.String str16 = textNode10.toString();
        boolean boolean17 = textNode10.isBlank();
        boolean boolean18 = textNode2.equals((java.lang.Object) boolean17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("i!");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        java.lang.String str16 = textNode15.getWholeText();
        boolean boolean18 = textNode15.hasAttr("hi!");
        java.lang.String str19 = textNode15.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode15.wrap("#text");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        org.jsoup.nodes.TextNode textNode9 = textNode7.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("text");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        boolean boolean16 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("text");
        java.lang.String str20 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("text");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node7 = node6.clone();
        int int8 = node6.childNodeSize();
        org.jsoup.nodes.Node node9 = node6.nextSibling();
        org.jsoup.nodes.Node node10 = node6.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node6.wrap("i!");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "");
        boolean boolean10 = textNode2.hasAttr("");
        int int11 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        java.lang.String str6 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("#text");
        java.lang.String str7 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str11 = textNode10.text();
        java.lang.String str12 = textNode10.nodeName();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("");
        org.jsoup.nodes.Node node15 = textNode14.nextSibling();
        java.lang.String str16 = textNode14.nodeName();
        org.jsoup.nodes.TextNode textNode18 = textNode14.text("");
        org.jsoup.nodes.Attributes attributes19 = textNode14.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode14.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode14.siblingNodes();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("hi!");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str6 = textNode5.text();
        java.lang.String str7 = textNode5.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("");
        int int10 = textNode9.childNodeSize();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode9);
        int int12 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#");
        java.lang.String str12 = textNode11.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode11.wrap("i!");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.siblingNodes();
        java.lang.String str15 = textNode13.outerHtml();
        java.lang.String str16 = textNode13.baseUri();
        org.jsoup.nodes.Node node17 = textNode13.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        java.lang.String str8 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str12 = textNode11.outerHtml();
        boolean boolean13 = textNode6.equals((java.lang.Object) str12);
        int int14 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node16 = textNode6.removeAttr("#text");
        java.lang.String str17 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode20 = textNode6.text("hi!");
        org.jsoup.nodes.Document document21 = textNode6.ownerDocument();
        boolean boolean23 = textNode6.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode6.wrap("text");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.siblingNodes();
        java.lang.String str16 = textNode14.outerHtml();
        java.lang.String str17 = textNode14.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode14.siblingNodes();
        org.jsoup.nodes.TextNode textNode20 = textNode14.text("#text");
        java.lang.String str21 = textNode20.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode20.childNodes();
        boolean boolean23 = textNode11.equals((java.lang.Object) textNode20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode20.wrap("#");
    }
}

