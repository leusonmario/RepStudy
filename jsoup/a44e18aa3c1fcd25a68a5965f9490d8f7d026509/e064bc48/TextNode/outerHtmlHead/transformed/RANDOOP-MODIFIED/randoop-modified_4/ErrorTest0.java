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
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.text();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        textNode2.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        boolean boolean19 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("text");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        textNode2.ensureAttributes();
        java.lang.String str21 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode11.wrap("#");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        textNode2.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("#");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.clone();
        boolean boolean18 = outputSettings17.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder19 = outputSettings17.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.clone();
        boolean boolean21 = textNode2.equals((java.lang.Object) outputSettings20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("text");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("hi!");
        java.lang.String str12 = textNode2.outerHtml();
        java.lang.String str14 = textNode2.attr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        java.lang.String str20 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        java.lang.String str22 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        org.jsoup.nodes.Node node11 = textNode10.clone();
        java.lang.String str12 = textNode10.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode10.wrap("#text");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        textNode13.ensureAttributes();
        org.jsoup.nodes.Node node15 = textNode13.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode13.wrap("#");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.baseUri();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.absUrl("hi!");
        textNode2.text = "#text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        textNode0.text = "text";
        textNode0.text = "hi!";
        boolean boolean8 = textNode0.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode0.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node5.wrap("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        boolean boolean3 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.toString();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.toString();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        boolean boolean3 = textNode0.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint;
        boolean boolean6 = textNode0.equals((java.lang.Object) boolean5);
        org.jsoup.nodes.Node node7 = textNode0.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode9 = textNode0.splitText(10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str5 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.gettext();
        java.lang.String str5 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        int int3 = textNode0.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("text");
        textNode5.settext("");
        org.jsoup.nodes.Node node8 = textNode5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode5.wrap("#text");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "#");
        java.lang.String str7 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getWholeText();
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        boolean boolean10 = textNode2.hasAttr("text");
        textNode2.settext("text");
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        java.lang.String str15 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node13 = textNode2.attr("text", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("#text");
        textNode2.settext("#text");
        java.lang.String str18 = textNode2.nodeName();
        java.lang.String str19 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        boolean boolean21 = textNode2.hasAttr("hi!");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("text");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        textNode2.settext("#");
        java.lang.String str12 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode0.childNodes();
        java.lang.String str4 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode0.wrap("#");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        textNode2.text = "hi!";
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        int int20 = textNode2.siblingIndex();
        java.lang.String str21 = textNode2.text;
        java.lang.String str22 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("h");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        org.jsoup.nodes.Document document2 = textNode0.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("text");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        textNode2.text = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("");
        textNode2.settext("");
        java.lang.String str12 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        java.lang.String str15 = textNode2.text;
        java.lang.String str16 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("h");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode2.nextSibling();
        boolean boolean13 = textNode2.hasAttr("");
        java.lang.String str14 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        java.lang.String str4 = textNode0.nodeName();
        org.jsoup.nodes.Node node5 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str14 = textNode12.attr("text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        boolean boolean3 = textNode0.isBlank();
        java.lang.String str4 = textNode0.gettext();
        org.jsoup.nodes.Node node5 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = textNode0.toString();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        boolean boolean13 = textNode2.hasAttr("hi!");
        java.lang.String str14 = textNode2.outerHtml();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        textNode2.text = "#";
        java.lang.String str18 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        textNode2.settext("");
        java.lang.String str11 = textNode2.outerHtml();
        textNode2.text = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        textNode2.setBaseUri("text");
        java.lang.String str21 = textNode2.toString();
        int int22 = textNode2.siblingIndex();
        int int23 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("#text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean10 = textNode2.hasAttr("text");
        textNode2.text = "#";
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        java.lang.String str3 = textNode0.getWholeText();
        textNode0.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = textNode0.outerHtml();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        textNode0.settext("#text");
        java.lang.String str6 = textNode0.absUrl("hi!");
        java.lang.String str7 = textNode0.getTEXT_KEY();
        org.jsoup.nodes.Node node8 = textNode0.nextSibling();
        java.lang.String str9 = textNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("h");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("text", "");
        org.jsoup.nodes.Node node5 = textNode2.attr("text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("#");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str14 = textNode12.attr("text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node17.wrap("text");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("h");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.text = "#";
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        int int10 = textNode2.siblingIndex();
        int int11 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "text");
        int int14 = textNode2.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode;
        outputSettings17.setindentAmount((int) '4');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode;
        java.nio.charset.Charset charset25 = outputSettings23.charset();
        outputSettings17.setcharset(charset25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode;
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings29.escapeMode;
        boolean boolean33 = outputSettings29.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings29.escapeMode(escapeMode37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings17.escapeMode(escapeMode37);
        boolean boolean40 = outputSettings17.forceAllElementAsBlock;
        boolean boolean41 = textNode2.equals((java.lang.Object) boolean40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = textNode2.wrap("#text");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = outputSettings5.escapeMode;
        java.nio.charset.Charset charset7 = outputSettings5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.clone();
        outputSettings5.forceAllElementAsBlock = true;
        outputSettings5.forceAllElementAsBlock = false;
        boolean boolean13 = outputSettings5.prettyPrint;
        boolean boolean14 = textNode0.equals((java.lang.Object) outputSettings5);
        int int15 = textNode0.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = textNode0.outerHtml();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode16.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode16.wrap("#");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        textNode2.text = "#text";
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("i!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        java.lang.String str18 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("text");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        java.lang.String str20 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node5 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("i!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.baseUri();
        org.jsoup.nodes.Node node3 = textNode0.clone();
        java.lang.String str4 = textNode0.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode0.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = textNode0.text();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        java.lang.String str4 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.outerHtml();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        boolean boolean14 = textNode2.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.lang.String str15 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        boolean boolean15 = textNode13.hasAttr("");
        boolean boolean16 = textNode13.isBlank();
        java.lang.String str17 = textNode13.gettext();
        textNode13.text = "#text";
        org.jsoup.nodes.TextNode textNode21 = textNode13.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode13.wrap("#text");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        boolean boolean13 = textNode2.hasAttr("hi!");
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("#");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode15.wrap("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.text;
        java.lang.String str7 = textNode2.absUrl("#text");
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        textNode2.ensureAttributes();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("text", "#text");
        java.lang.String str19 = textNode18.text();
        org.jsoup.nodes.Node node21 = textNode18.removeAttr("#text");
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode18);
        org.jsoup.nodes.Node node25 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("#text");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str9 = textNode2.attr("#text");
        java.lang.String str10 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        boolean boolean13 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node16 = textNode2.attr("text", "");
        boolean boolean18 = textNode2.equals((java.lang.Object) (byte) 10);
        textNode2.ensureAttributes();
        boolean boolean20 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        java.lang.String str20 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        boolean boolean22 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#text");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.baseUri();
        org.jsoup.nodes.Node node3 = textNode0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.baseUri();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        java.lang.String str17 = textNode2.getWholeText();
        java.lang.String str18 = textNode2.text();
        java.lang.String str19 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#text");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        textNode2.setBaseUri("text");
        java.lang.String str21 = textNode2.outerHtml();
        java.lang.String str22 = textNode2.nodeName();
        textNode2.settext("#");
        org.jsoup.nodes.Node node26 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode2.wrap("#");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        org.jsoup.nodes.Node node17 = textNode2.attr("#", "");
        java.lang.String str18 = textNode2.text;
        java.lang.String str19 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("i!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        java.lang.String str14 = textNode2.gettext();
        java.lang.String str15 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str8 = textNode2.absUrl("#");
        java.lang.String str10 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        textNode2.settext("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.getTEXT_KEY();
        int int20 = textNode2.siblingIndex();
        java.lang.String str22 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("text");
        textNode2.settext("");
        java.lang.String str27 = textNode2.toString();
        java.lang.String str28 = textNode2.toString();
        java.lang.String str29 = textNode2.getWholeText();
        boolean boolean30 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode2.wrap("i!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode12.parent();
        java.lang.String str15 = textNode12.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode12.wrap("hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        boolean boolean21 = textNode2.hasAttr("hi!");
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node23 = textNode2.nextSibling();
        java.lang.String str24 = textNode2.text;
        java.lang.String str25 = textNode2.baseUri();
        int int26 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode2.wrap("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.outerHtml();
        int int10 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.gettext();
        boolean boolean12 = textNode2.isBlank();
        boolean boolean13 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode;
        java.nio.charset.Charset charset18 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.clone();
        boolean boolean20 = outputSettings19.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings19.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.clone();
        int int23 = outputSettings22.indentAmount();
        boolean boolean24 = outputSettings22.prettyPrint();
        boolean boolean25 = textNode13.equals((java.lang.Object) boolean24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode13.wrap("h");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.gettext();
        java.lang.String str6 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("i!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode7.wrap("i!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.lang.String str13 = textNode2.toString();
        boolean boolean15 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        boolean boolean15 = textNode13.hasAttr("");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode;
        java.nio.charset.Charset charset20 = outputSettings18.charset();
        outputSettings18.setindentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings18.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings18.indentAmount((int) (byte) 10);
        outputSettings25.setprettyPrint(false);
        boolean boolean28 = textNode13.equals((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode13.wrap("#");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.baseUri();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        java.lang.String str15 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("#text");
        java.lang.String str19 = textNode2.attr("");
        boolean boolean21 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("h");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.gettext();
        java.lang.String str8 = textNode2.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        boolean boolean21 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("#text");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        org.jsoup.nodes.Node node3 = textNode0.nextSibling();
        textNode0.text = "text";
        textNode0.text = "hi!";
        boolean boolean8 = textNode0.isBlank();
        org.jsoup.nodes.Node node9 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("i!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        int int3 = textNode2.siblingIndex();
        textNode2.text = "#";
        textNode2.ensureAttributes();
        textNode2.settext("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (byte) 0);
        textNode2.ensureAttributes();
        java.lang.String str8 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.text;
        java.lang.String str20 = textNode2.nodeName();
        java.lang.String str22 = textNode2.absUrl("#text");
        java.lang.String str23 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node25 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = node25.wrap("i!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings11.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode;
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.clone();
        outputSettings16.indentAmount = 0;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode;
        java.nio.charset.Charset charset23 = outputSettings21.charset;
        outputSettings16.setcharset(charset23);
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings16.encoder();
        boolean boolean26 = textNode2.equals((java.lang.Object) outputSettings16);
        boolean boolean28 = textNode2.hasAttr("text");
        java.lang.String str29 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode2.wrap("text");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        boolean boolean21 = textNode2.hasAttr("hi!");
        textNode2.ensureAttributes();
        boolean boolean24 = textNode2.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node26 = textNode2.clone();
        org.jsoup.nodes.Node node27 = textNode2.nextSibling();
        boolean boolean29 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode2.wrap("text");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("h");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.absUrl("#text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str9 = textNode8.text;
        java.lang.String str10 = textNode8.outerHtml();
        boolean boolean12 = textNode8.hasAttr("text");
        boolean boolean13 = textNode2.equals((java.lang.Object) "text");
        java.lang.String str14 = textNode2.text;
        java.lang.String str15 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.getTEXT_KEY();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str13 = textNode2.outerHtml();
        boolean boolean15 = textNode2.hasAttr("text");
        java.lang.String str16 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.text();
        textNode2.settext("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        int int10 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("#");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.baseUri();
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "text");
        java.lang.String str18 = textNode2.getTEXT_KEY();
        java.lang.String str19 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("h");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        textNode2.text = "#text";
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.getTEXT_KEY();
        textNode2.setBaseUri("#");
        java.lang.String str19 = textNode2.getWholeText();
        java.lang.String str20 = textNode2.outerHtml();
        java.lang.String str22 = textNode2.attr("#");
        java.lang.String str24 = textNode2.absUrl("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("i!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("ext");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str14 = textNode12.attr("text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str16 = textNode12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode12.wrap("h");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode0.childNodes();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode0.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode8 = textNode0.splitText((int) (byte) 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        textNode2.text = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.getWholeText();
        textNode2.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        boolean boolean5 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.settext("hi!");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.getTEXT_KEY();
        java.lang.String str13 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str13 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.attr("#text");
        boolean boolean11 = textNode2.hasAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode;
        java.nio.charset.Charset charset17 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset17);
        boolean boolean19 = outputSettings11.getprettyPrint();
        boolean boolean20 = outputSettings11.getprettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings11.getcharsetEncoder();
        boolean boolean22 = textNode2.equals((java.lang.Object) charsetEncoder21);
        java.lang.String str24 = textNode2.attr("hi!");
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode2.wrap("i!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str13 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        org.jsoup.nodes.Node node15 = textNode2.clone();
        org.jsoup.nodes.Node node16 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("ext");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.baseUri();
        org.jsoup.nodes.Node node15 = textNode2.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("");
        java.lang.String str17 = textNode14.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode14.wrap("h");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode0.childNodes();
        java.lang.String str4 = textNode0.text;
        java.lang.String str5 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode0.wrap("h");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        java.lang.String str10 = textNode9.gettext();
        boolean boolean12 = textNode9.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode9.wrap("#text");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        org.jsoup.nodes.Document document2 = textNode0.ownerDocument();
        org.jsoup.nodes.Document document3 = textNode0.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        textNode2.settext("#");
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("ext");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        textNode2.text = "#";
        org.jsoup.nodes.Node node14 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("ext");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.text;
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.gettext();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node6.wrap("#text");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#", "");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#");
        java.lang.String str7 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.TextNode textNode2 = textNode0.text("hi!");
        boolean boolean4 = textNode2.hasAttr("#");
        java.lang.String str5 = textNode2.getTEXT_KEY();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node16 = textNode2.attr("text", "");
        org.jsoup.nodes.Node node17 = textNode2.nextSibling();
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("text");
        org.jsoup.nodes.Node node20 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.text;
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("#");
        java.lang.String str13 = textNode2.gettext();
        textNode2.ensureAttributes();
        java.lang.String str15 = textNode2.getTEXT_KEY();
        java.lang.String str17 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("ext");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        boolean boolean15 = textNode13.hasAttr("");
        boolean boolean16 = textNode13.isBlank();
        java.lang.String str17 = textNode13.gettext();
        textNode13.text = "#text";
        java.lang.String str21 = textNode13.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode13.wrap("#");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str13 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.siblingNodes();
        java.lang.String str18 = textNode16.gettext();
        org.jsoup.nodes.Node node19 = textNode16.previousSibling();
        boolean boolean21 = textNode16.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode16.wrap("i!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        textNode2.settext("#text");
        boolean boolean18 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode0.childNodes();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.baseUri();
        java.lang.String str6 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = textNode0.outerHtml();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("text");
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node11 = textNode2.attr("#", "#text");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.ensureAttributes();
        textNode2.text = "#text";
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.lang.String str10 = textNode9.outerHtml();
        textNode9.text = "text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode9.wrap("t");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.lang.String str9 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        java.lang.String str3 = textNode2.baseUri();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.nodeName();
        textNode2.text = "#";
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        textNode2.text = "#text";
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.lang.String str17 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "#text");
        java.lang.String str3 = textNode2.text();
        java.lang.String str5 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node19 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode25 = textNode2.text("ext");
        org.jsoup.nodes.TextNode textNode27 = textNode25.splitText((int) (byte) 0);
        java.lang.String str28 = textNode25.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode25.wrap("hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        java.lang.String str4 = textNode2.attr("text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node6.wrap("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str14 = textNode12.attr("text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str17 = textNode2.absUrl("#");
        boolean boolean18 = textNode2.isBlank();
        java.lang.String str19 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("i!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("ext");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        boolean boolean4 = textNode2.hasAttr("#text");
        textNode2.text = "#text";
        boolean boolean8 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("ext");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.gettext();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str14 = textNode12.attr("text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode12);
        int int16 = textNode12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.siblingNodes();
        java.lang.String str19 = textNode12.attr("#");
        boolean boolean20 = textNode12.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode12.wrap("h");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.outerHtml();
        textNode2.settext("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("text");
        java.lang.String str13 = textNode12.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode12.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode12.wrap("hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "#text");
        java.lang.String str15 = textNode2.absUrl("#");
        textNode2.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        boolean boolean10 = textNode2.hasAttr("text");
        textNode2.settext("text");
        textNode2.text = "#text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        java.lang.String str19 = textNode2.text;
        java.lang.String str20 = textNode2.nodeName();
        java.lang.String str22 = textNode2.attr("");
        org.jsoup.nodes.Node node23 = textNode2.parent();
        org.jsoup.nodes.Node node24 = textNode2.nextSibling();
        boolean boolean26 = textNode2.hasAttr("hi!");
        textNode2.settext("");
        org.jsoup.nodes.TextNode textNode30 = textNode2.text("h");
        org.jsoup.nodes.Node node32 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = textNode2.wrap("ext");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        java.lang.String str11 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        java.lang.String str10 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        org.jsoup.nodes.Node node14 = textNode13.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode13.wrap("hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        textNode2.ensureAttributes();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        boolean boolean10 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("ext");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode0.wrap("t");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        textNode2.text = "#text";
        java.lang.String str13 = textNode2.text();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.toString();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str17 = textNode16.text;
        java.lang.String str18 = textNode16.outerHtml();
        java.lang.String str19 = textNode16.getTEXT_KEY();
        java.lang.String str20 = textNode16.text;
        java.lang.String str21 = textNode16.gettext();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str25 = textNode24.text;
        java.lang.String str26 = textNode24.outerHtml();
        java.lang.String str27 = textNode24.getTEXT_KEY();
        java.lang.String str28 = textNode24.nodeName();
        boolean boolean30 = textNode24.equals((java.lang.Object) (short) 1);
        textNode24.setBaseUri("#text");
        boolean boolean33 = textNode24.isBlank();
        textNode24.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList36 = textNode24.childNodes();
        textNode24.settext("text");
        boolean boolean39 = textNode16.equals((java.lang.Object) "text");
        boolean boolean40 = textNode13.equals((java.lang.Object) "text");
        java.lang.String str41 = textNode13.nodeName();
        boolean boolean42 = textNode13.isBlank();
        org.jsoup.nodes.Node node43 = textNode13.previousSibling();
        org.jsoup.nodes.Node node45 = textNode13.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node47 = textNode13.wrap("i!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.settext("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#");
        org.jsoup.nodes.Node node14 = textNode2.attr("#", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        java.lang.String str7 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        textNode2.text = "text";
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#");
        java.lang.String str11 = textNode10.getWholeText();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings12.indentAmount((int) 'a');
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode;
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.clone();
        outputSettings14.forceAllElementAsBlock = true;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = outputSettings14.escapeMode;
        int int21 = outputSettings14.getindentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset24 = outputSettings14.charset();
        boolean boolean25 = outputSettings14.prettyPrint;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings14.escapeMode;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings14.indentAmount((int) (short) 0);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings28.clone();
        boolean boolean30 = textNode10.equals((java.lang.Object) outputSettings29);
        java.lang.String str31 = textNode10.text();
        org.jsoup.nodes.Node node34 = textNode10.attr("hi!", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = node34.wrap("i!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.getTEXT_KEY();
        boolean boolean3 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text;
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("");
        textNode2.text = "#text";
        java.lang.String str13 = textNode2.text();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode14.getWholeText();
        org.jsoup.nodes.Node node18 = textNode14.attr("hi!", "hi!");
        java.lang.String str19 = textNode14.baseUri();
        java.lang.String str20 = textNode14.getWholeText();
        textNode14.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode14.wrap("h");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Node node1 = textNode0.clone();
        java.lang.String str2 = textNode0.baseUri();
        org.jsoup.nodes.Node node3 = textNode0.clone();
        java.lang.String str4 = textNode0.getTEXT_KEY();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode0.childNodes();
        org.jsoup.nodes.Node node6 = textNode0.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = textNode0.toString();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        boolean boolean10 = textNode2.hasAttr("text");
        textNode2.settext("");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("ext");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.getTEXT_KEY();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.isBlank();
        textNode2.text = "#text";
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        textNode2.settext("text");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("#text");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.text;
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        boolean boolean8 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "#text");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode5.wrap("t");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("text");
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }
}

