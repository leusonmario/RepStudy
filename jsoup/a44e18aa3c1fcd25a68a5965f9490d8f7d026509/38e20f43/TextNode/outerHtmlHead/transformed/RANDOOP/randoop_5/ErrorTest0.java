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
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = node3.wrap("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode10.wrap("hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.text();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = node3.wrap("#text");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("text");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean4 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings6.encoder();
        boolean boolean10 = textNode2.equals((java.lang.Object) outputSettings6);
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = node12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("h");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode9.wrap("h");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        java.lang.String str17 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.String str12 = textNode7.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode7.wrap("h");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.String str12 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str5 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str10 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str9 = textNode2.gettext();
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        int int4 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode7.wrap("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        java.lang.String str11 = textNode7.nodeName();
        textNode7.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode7.wrap("h");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str6 = textNode5.getWholeText();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str9 = textNode5.attr("text");
        java.lang.String str10 = textNode5.nodeName();
        java.lang.String str11 = textNode5.baseUri();
        boolean boolean12 = textNode2.equals((java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        org.jsoup.nodes.Node node13 = textNode11.parent();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("i!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode15.wrap("h");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        int int8 = node7.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.siblingNodes();
        int int10 = node7.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("#text");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        outputSettings6.setindentAmount(1);
        boolean boolean11 = outputSettings6.getprettyPrint();
        outputSettings6.setindentAmount((int) '4');
        java.nio.charset.Charset charset14 = outputSettings6.getcharset();
        boolean boolean15 = node5.equals((java.lang.Object) charset14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node5.wrap("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("");
        boolean boolean8 = textNode2.hasAttr("#text");
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.jsoup.nodes.Node node17 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document15 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode17.wrap("h");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("h");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.gettext();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("");
        boolean boolean8 = textNode2.hasAttr("#text");
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        boolean boolean13 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.String str12 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node16 = textNode15.clone();
        org.jsoup.nodes.Node node17 = textNode15.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("h");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings6.encoder();
        boolean boolean10 = textNode2.equals((java.lang.Object) outputSettings6);
        java.lang.String str11 = textNode2.baseUri();
        boolean boolean13 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        textNode2.settext("hi!");
        boolean boolean14 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "text");
        java.lang.String str3 = textNode2.toString();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("h");
        boolean boolean11 = textNode2.hasAttr("text");
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        java.lang.String str15 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("h");
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode14.wrap("#text");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.isBlank();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        textNode2.settext("text");
        textNode2.setBaseUri("");
        int int9 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node3.wrap("#text");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.gettext();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode12.wrap("i!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        boolean boolean13 = textNode2.isBlank();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode21.wrap("h");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        int int17 = textNode10.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode10.wrap("i!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        java.lang.String str6 = textNode2.getTEXT_KEY();
        java.lang.String str7 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "h");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("#text");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.Document document10 = textNode7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode7.wrap("#text");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        boolean boolean5 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str7 = textNode5.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodes();
        java.lang.String str9 = textNode5.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode5.wrap("#text");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.gettext();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean11 = textNode2.isBlank();
        textNode2.setBaseUri("text");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.text();
        int int13 = textNode7.childNodeSize();
        boolean boolean15 = textNode7.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode7.wrap("i!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.attr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(0);
        java.lang.String str8 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.childNodeSize();
        textNode2.settext("text");
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textNode0.text();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("i!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.text();
        boolean boolean15 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text;
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("i!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("text", "#text");
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        int int8 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("#text");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        textNode7.settext("");
        java.lang.String str17 = textNode7.getWholeText();
        org.jsoup.nodes.TextNode textNode19 = textNode7.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode19.wrap("h");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.gettext();
        java.lang.String str14 = textNode7.attr("#text");
        java.lang.String str15 = textNode7.getWholeText();
        org.jsoup.nodes.Node node18 = textNode7.attr("hi!", "#text");
        java.lang.String str19 = textNode7.baseUri();
        java.lang.String str20 = textNode7.getTEXT_KEY();
        textNode7.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode7.wrap("hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        textNode6.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("i!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str10 = textNode2.absUrl("text");
        java.lang.String str12 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.gettext();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        int int11 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        textNode2.text = "#text";
        textNode2.setBaseUri("i!");
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("i!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        int int8 = textNode2.siblingIndex();
        textNode2.text = "";
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node14 = textNode13.clone();
        org.jsoup.nodes.Node node15 = textNode13.clone();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str17 = textNode13.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode13.wrap("#text");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node19 = textNode2.attr("h", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("text");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        java.lang.String str7 = textNode6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("text");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("text");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        org.jsoup.nodes.Node node13 = textNode11.parent();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("i!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        org.jsoup.nodes.Attributes attributes19 = textNode17.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode17.wrap("#text");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        java.lang.String str6 = textNode2.attr("");
        textNode2.settext("h");
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        textNode11.text = "";
        java.lang.String str14 = textNode11.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode11.wrap("i!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.setBaseUri("");
        boolean boolean8 = textNode2.hasAttr("#text");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("text");
        textNode2.ensureAttributes();
        java.lang.String str14 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("ext");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("t");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("t");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("text");
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str15 = textNode14.baseUri();
        java.lang.String str16 = textNode14.outerHtml();
        boolean boolean18 = textNode14.hasAttr("");
        org.jsoup.nodes.Node node19 = textNode14.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode14.text("text");
        org.jsoup.nodes.Node node24 = textNode14.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode26 = textNode14.text("");
        org.jsoup.nodes.TextNode textNode28 = textNode26.text("h");
        int int29 = textNode28.siblingIndex();
        java.lang.String str30 = textNode28.outerHtml();
        java.lang.String str31 = textNode28.baseUri();
        org.jsoup.nodes.TextNode textNode33 = textNode28.text("#text");
        boolean boolean34 = textNode28.isBlank();
        boolean boolean35 = textNode11.equals((java.lang.Object) boolean34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = textNode11.wrap("#text");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("t");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("h");
        int int5 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean8 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("text");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.attr("#text");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("h");
        java.lang.String str18 = textNode2.nodeName();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("#text");
        java.lang.String str21 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("text");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str4 = textNode2.attr("text");
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("text");
        textNode2.text = "t";
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("ext");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        java.lang.String str15 = textNode2.nodeName();
        java.lang.String str17 = textNode2.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("t");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        int int8 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.text;
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        textNode2.settext("hi!");
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "text");
        java.lang.String str3 = textNode2.toString();
        boolean boolean4 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        int int6 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        java.lang.String str17 = textNode2.text;
        java.lang.String str18 = textNode2.getTEXT_KEY();
        java.lang.String str19 = textNode2.baseUri();
        org.jsoup.nodes.Node node20 = textNode2.clone();
        java.lang.String str22 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node24 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("#text");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        java.lang.String str11 = textNode7.getWholeText();
        java.lang.String str12 = textNode7.nodeName();
        java.lang.String str13 = textNode7.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode7.wrap("text");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        textNode2.ensureAttributes();
        java.lang.String str18 = textNode2.baseUri();
        org.jsoup.nodes.Node node21 = textNode2.attr("text", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node21.wrap("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.text;
        java.lang.String str13 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode7.text("text");
        java.lang.String str15 = textNode7.gettext();
        java.lang.String str16 = textNode7.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode7.wrap("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        boolean boolean24 = textNode10.hasAttr("#text");
        java.lang.String str25 = textNode10.gettext();
        org.jsoup.nodes.Node node27 = textNode10.removeAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode10.wrap("t");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("t");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("text");
        java.lang.String str7 = textNode6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("#text");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.settext("");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        textNode2.text = "text";
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.String str11 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        int int23 = textNode22.siblingIndex();
        org.jsoup.nodes.TextNode textNode25 = textNode22.splitText((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode25.wrap("i!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        textNode9.ensureAttributes();
        textNode9.ensureAttributes();
        java.lang.String str12 = textNode9.text();
        java.lang.String str13 = textNode9.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode9.wrap("#text");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("h");
        java.lang.String str17 = textNode14.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode14.wrap("ext");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str4 = textNode2.attr("text");
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str14 = textNode2.text;
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("t");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str6 = textNode5.getWholeText();
        java.lang.String str7 = textNode5.baseUri();
        java.lang.String str9 = textNode5.attr("text");
        java.lang.String str10 = textNode5.nodeName();
        java.lang.String str11 = textNode5.baseUri();
        boolean boolean12 = textNode2.equals((java.lang.Object) str11);
        boolean boolean13 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("t");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("text", "ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("i!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str7 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str15 = textNode2.absUrl("hi!");
        textNode2.settext("hi!");
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("t");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        textNode2.settext("text");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node20 = textNode19.clone();
        org.jsoup.nodes.Node node21 = textNode19.clone();
        java.lang.String str23 = textNode19.absUrl("text");
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("t");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.outerHtml();
        boolean boolean14 = textNode2.hasAttr("text");
        boolean boolean16 = textNode2.hasAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        textNode2.text = "h";
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        textNode2.settext("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("t");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.siblingNodes();
        java.lang.String str11 = textNode9.outerHtml();
        java.lang.String str12 = textNode9.baseUri();
        boolean boolean14 = textNode9.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode9.wrap("ext");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        int int8 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.text;
        int int14 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        textNode2.settext("text");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node20 = textNode19.clone();
        org.jsoup.nodes.Node node21 = textNode19.clone();
        java.lang.String str23 = textNode19.absUrl("text");
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("h");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "i!");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        textNode2.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str9 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("t");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.gettext();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("t");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.gettext();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode12.wrap("text");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodesCopy();
        boolean boolean14 = textNode7.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode7.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode7.wrap("#text");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.siblingNodes();
        org.jsoup.nodes.Node node9 = node6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node6.wrap("ext");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str8 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        java.lang.String str13 = textNode11.nodeName();
        int int14 = textNode11.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode11.parent();
        textNode11.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode11.wrap("ext");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        textNode2.settext("hi!");
        boolean boolean14 = textNode2.hasAttr("#text");
        java.lang.String str15 = textNode2.text;
        java.lang.String str16 = textNode2.outerHtml();
        java.lang.String str17 = textNode2.getWholeText();
        java.lang.String str18 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("ext");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node8 = textNode2.attr("text", "");
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.childNodeSize();
        java.lang.String str11 = textNode2.gettext();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.Node node11 = textNode7.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("text");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList2 = textNode0.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        textNode2.ensureAttributes();
        textNode2.text = "i!";
        boolean boolean8 = textNode2.isBlank();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean11 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.text();
        int int13 = textNode7.childNodeSize();
        boolean boolean15 = textNode7.hasAttr("#text");
        java.lang.String str16 = textNode7.nodeName();
        textNode7.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode7.wrap("ext");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "t");
        org.jsoup.nodes.Node node5 = textNode2.attr("h", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("ext");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        java.lang.String str13 = textNode11.nodeName();
        int int14 = textNode11.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode11.parent();
        textNode11.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode11.wrap("text");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        java.lang.String str20 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.getTEXT_KEY();
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode11.childNodes();
        org.jsoup.nodes.Node node14 = textNode11.parent();
        textNode11.text = "";
        java.lang.String str17 = textNode11.toString();
        org.jsoup.nodes.Node node18 = textNode11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node18.wrap("ext");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.nodeName();
        int int10 = textNode2.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "text");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.text();
        textNode2.ensureAttributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.baseUri();
        textNode2.settext("text");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        java.lang.String str12 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node16 = textNode15.clone();
        org.jsoup.nodes.Node node17 = textNode15.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) node17);
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.String str20 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("text");
        java.lang.String str13 = textNode2.text;
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str6 = textNode2.attr("text");
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("h");
        java.lang.String str11 = textNode2.gettext();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode11.wrap("ext");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        java.lang.String str11 = textNode7.nodeName();
        textNode7.setBaseUri("h");
        java.lang.String str15 = textNode7.attr("i!");
        org.jsoup.nodes.Node node17 = textNode7.removeAttr("text");
        java.lang.String str18 = node17.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node17.wrap("#text");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        java.lang.String str17 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("ext");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.ensureAttributes();
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        textNode2.settext("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str3 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("h");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        textNode2.ensureAttributes();
        java.lang.String str11 = textNode2.toString();
        java.lang.String str12 = textNode2.getWholeText();
        textNode2.setBaseUri("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str8 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("ext");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        org.jsoup.nodes.Document document19 = textNode11.ownerDocument();
        org.jsoup.nodes.TextNode textNode21 = textNode11.text("i!");
        java.lang.String str22 = textNode21.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode21.wrap("ext");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("text");
        org.jsoup.nodes.Attributes attributes12 = textNode11.attributes();
        int int13 = textNode11.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode11.wrap("hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        int int8 = node7.siblingIndex();
        int int9 = node7.childNodeSize();
        int int10 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.wrap("h");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str4 = textNode2.attr("text");
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("t");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        boolean boolean15 = textNode2.isBlank();
        java.lang.String str16 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.lang.String str15 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.wrap("i!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str15 = textNode2.absUrl("hi!");
        textNode2.settext("hi!");
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node20 = textNode2.clone();
        java.lang.String str21 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("ext");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.lang.String str9 = textNode2.toString();
        textNode2.setBaseUri("hi!");
        java.lang.String str12 = textNode2.toString();
        textNode2.ensureAttributes();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str5 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        textNode2.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("text");
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.childNodeSize();
        boolean boolean6 = textNode2.isBlank();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.toString();
        textNode14.text = "i!";
        java.lang.String str18 = textNode14.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode14.wrap("text");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        textNode2.text = "text";
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        java.lang.String str15 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.lang.String str17 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getTEXT_KEY();
        boolean boolean10 = textNode2.hasAttr("i!");
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        int int14 = outputSettings13.indentAmount();
        int int15 = outputSettings13.indentAmount;
        int int16 = outputSettings13.indentAmount;
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean20 = textNode19.isBlank();
        org.jsoup.nodes.Node node22 = textNode19.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        int int24 = outputSettings23.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.clone();
        outputSettings23.setindentAmount(1);
        boolean boolean28 = outputSettings23.getprettyPrint();
        outputSettings23.setindentAmount((int) '4');
        java.nio.charset.Charset charset31 = outputSettings23.getcharset();
        boolean boolean32 = node22.equals((java.lang.Object) charset31);
        outputSettings13.setcharset(charset31);
        outputSettings13.setprettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings13.indentAmount((int) (byte) 1);
        java.nio.charset.CharsetEncoder charsetEncoder38 = outputSettings13.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = new org.jsoup.nodes.Document.OutputSettings();
        int int40 = outputSettings39.indentAmount();
        int int41 = outputSettings39.indentAmount;
        int int42 = outputSettings39.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = new org.jsoup.nodes.Document.OutputSettings();
        int int46 = outputSettings45.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings45.clone();
        java.nio.charset.CharsetEncoder charsetEncoder48 = outputSettings45.encoder();
        outputSettings39.setcharsetEncoder(charsetEncoder48);
        boolean boolean50 = outputSettings39.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = new org.jsoup.nodes.Document.OutputSettings();
        int int52 = outputSettings51.indentAmount();
        int int53 = outputSettings51.indentAmount;
        int int54 = outputSettings51.indentAmount;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = outputSettings51.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = new org.jsoup.nodes.Document.OutputSettings();
        int int58 = outputSettings57.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = outputSettings57.clone();
        java.nio.charset.CharsetEncoder charsetEncoder60 = outputSettings57.encoder();
        outputSettings51.setcharsetEncoder(charsetEncoder60);
        boolean boolean62 = outputSettings51.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode63 = outputSettings51.escapeMode();
        outputSettings39.setescapeMode(escapeMode63);
        java.nio.charset.CharsetEncoder charsetEncoder65 = outputSettings39.charsetEncoder;
        outputSettings13.setcharsetEncoder(charsetEncoder65);
        int int67 = outputSettings13.getindentAmount();
        boolean boolean68 = node12.equals((java.lang.Object) outputSettings13);
        java.lang.String str69 = node12.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node71 = node12.wrap("text");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("t");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("");
        java.lang.String str6 = textNode5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode5.wrap("ext");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode5.wrap("#text");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.outerHtml();
        boolean boolean14 = textNode2.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.nodeName();
        java.lang.String str2 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getTEXT_KEY();
        boolean boolean10 = textNode2.hasAttr("i!");
        java.lang.String str11 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode14.wrap("hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        java.lang.String str23 = textNode11.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode11.wrap("#");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("h");
        java.lang.String str6 = textNode2.attr("h");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("ext");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str10 = textNode2.absUrl("text");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("i!");
        org.jsoup.nodes.Node node16 = textNode14.removeAttr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode14.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode14.wrap("#text");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        java.lang.String str15 = textNode2.nodeName();
        java.lang.String str17 = textNode2.attr("h");
        java.lang.String str18 = textNode2.nodeName();
        java.lang.String str19 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("t");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        textNode2.text = "ext";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("ext");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        boolean boolean24 = textNode10.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode10.childNodes();
        textNode10.text = "hi!";
        org.jsoup.nodes.Attributes attributes28 = textNode10.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode10.wrap("text");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        textNode9.ensureAttributes();
        textNode9.ensureAttributes();
        textNode9.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("i!");
        org.jsoup.nodes.Node node17 = textNode16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode16.wrap("h");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str12 = textNode2.absUrl("h");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("h");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode16 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str4 = textNode2.gettext();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("t");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("t", "t");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("t");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("text");
        textNode2.text = "t";
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        java.lang.String str7 = textNode2.attr("text");
        java.lang.String str8 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        boolean boolean7 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.toString();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "i!");
        java.lang.String str4 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        textNode2.settext("hi!");
        java.lang.String str15 = textNode2.attr("h");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("i!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        textNode2.settext("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean12 = textNode2.hasAttr("#text");
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("h");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("#text");
        textNode2.settext("");
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.text();
        textNode2.settext("#text");
        boolean boolean8 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        int int12 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.text;
        org.jsoup.nodes.TextNode textNode15 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Node node16 = textNode15.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode15.wrap("#text");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str10 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("ext");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "t");
        java.lang.String str4 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.text();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("i!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(1);
        java.lang.String str12 = textNode11.nodeName();
        org.jsoup.nodes.Node node13 = textNode11.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode11.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode11.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode11.wrap("text");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.ensureAttributes();
        int int9 = textNode2.childNodeSize();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        org.jsoup.nodes.Node node14 = textNode13.clone();
        java.lang.String str15 = textNode13.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode13.wrap("text");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        boolean boolean8 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.text;
        java.lang.String str11 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("t");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("ext");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = new org.jsoup.nodes.Document.OutputSettings();
        int int7 = outputSettings6.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.clone();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings6.encoder();
        boolean boolean10 = textNode2.equals((java.lang.Object) outputSettings6);
        java.lang.String str11 = textNode2.baseUri();
        boolean boolean13 = textNode2.hasAttr("text");
        java.lang.String str14 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodes();
        org.jsoup.nodes.TextNode textNode14 = textNode7.text("text");
        org.jsoup.nodes.Node node15 = textNode7.nextSibling();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str19 = textNode18.baseUri();
        java.lang.String str20 = textNode18.text;
        int int21 = textNode18.siblingIndex();
        textNode18.settext("hi!");
        int int24 = textNode18.childNodeSize();
        int int25 = textNode18.siblingIndex();
        boolean boolean26 = textNode7.equals((java.lang.Object) textNode18);
        textNode7.ensureAttributes();
        org.jsoup.nodes.TextNode textNode29 = textNode7.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode7.wrap("#");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        textNode2.ensureAttributes();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        int int10 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        boolean boolean7 = textNode2.hasAttr("h");
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node12 = textNode2.attr("ext", "");
        java.lang.String str13 = node12.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("text");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean13 = textNode2.isBlank();
        int int14 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str17 = textNode2.absUrl("hi!");
        java.lang.String str18 = textNode2.toString();
        textNode2.text = "t";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("ext");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        int int5 = textNode2.siblingIndex();
        textNode2.settext("hi!");
        boolean boolean9 = textNode2.equals((java.lang.Object) 1.0f);
        java.lang.String str10 = textNode2.nodeName();
        textNode2.settext("hi!");
        boolean boolean14 = textNode2.hasAttr("#text");
        java.lang.String str15 = textNode2.text;
        org.jsoup.nodes.Node node16 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("i!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        textNode9.ensureAttributes();
        org.jsoup.nodes.Node node12 = textNode9.removeAttr("h");
        org.jsoup.nodes.Attributes attributes13 = textNode9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        java.lang.String str15 = textNode9.getTEXT_KEY();
        boolean boolean16 = textNode9.isBlank();
        java.lang.String str17 = textNode9.text;
        org.jsoup.nodes.Attributes attributes18 = textNode9.attributes();
        int int19 = textNode9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode9.wrap("h");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str11 = textNode2.text();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        org.jsoup.nodes.Node node16 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("t");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        boolean boolean14 = textNode13.isBlank();
        java.lang.String str15 = textNode13.getWholeText();
        org.jsoup.nodes.Node node16 = textNode13.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode13.wrap("#text");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "hi!");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        textNode7.settext("");
        java.lang.String str17 = textNode7.getWholeText();
        textNode7.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode7.wrap("i");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        boolean boolean11 = textNode2.hasAttr("hi!");
        java.lang.String str12 = textNode2.nodeName();
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        boolean boolean16 = textNode2.hasAttr("t");
        java.lang.String str17 = textNode2.gettext();
        textNode2.text = "ext";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("i!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        boolean boolean10 = textNode2.hasAttr("t");
        java.lang.String str12 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("t");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        java.lang.String str23 = textNode22.toString();
        org.jsoup.nodes.Node node26 = textNode22.attr("h", "h");
        int int27 = textNode22.childNodeSize();
        textNode22.text = "h";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode22.wrap("ext");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "h");
        int int3 = textNode2.childNodeSize();
        textNode2.settext("text");
        int int6 = textNode2.siblingIndex();
        textNode2.settext("text");
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("h");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("h");
        java.lang.String str17 = textNode14.gettext();
        java.lang.String str19 = textNode14.attr("");
        org.jsoup.nodes.Node node21 = textNode14.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node21.wrap("#text");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.settext("");
        java.lang.String str9 = textNode2.attr("text");
        textNode2.ensureAttributes();
        textNode2.settext("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("t");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.attr("text");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str9 = textNode2.attr("hi!");
        java.lang.String str10 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("ext");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode7.parent();
        boolean boolean9 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean10 = textNode7.isBlank();
        boolean boolean11 = textNode7.isBlank();
        java.lang.String str12 = textNode7.text();
        textNode7.settext("");
        java.lang.String str15 = textNode7.text();
        textNode7.ensureAttributes();
        java.lang.String str17 = textNode7.gettext();
        textNode7.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode7.wrap("text");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        textNode10.settext("text");
        textNode10.text = "i!";
        boolean boolean26 = textNode10.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode10.wrap("h");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        org.jsoup.nodes.Node node17 = textNode2.parent();
        java.lang.String str19 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node22 = textNode2.attr("text", "t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("t");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.text;
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.gettext();
        textNode2.text = "h";
        java.lang.String str10 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "h");
        org.jsoup.nodes.Node node3 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#");
    }
}

