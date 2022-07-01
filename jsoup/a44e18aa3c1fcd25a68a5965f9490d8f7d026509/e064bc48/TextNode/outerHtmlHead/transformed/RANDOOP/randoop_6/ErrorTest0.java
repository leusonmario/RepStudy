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
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textNode0.toString();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode0.wrap("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        boolean boolean3 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.text();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("text");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.toString();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("ext");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean7 = textNode2.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "t");
        java.lang.String str11 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        java.lang.String str6 = textNode2.getTEXT_KEY();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("ext");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("t");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.settext("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        org.jsoup.nodes.TextNode textNode10 = textNode0.text("ext");
        java.lang.String str11 = textNode10.gettext();
        org.jsoup.nodes.TextNode textNode13 = textNode10.text("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode10.wrap("ext");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str3 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.setBaseUri("hi!");
        java.lang.String str10 = textNode2.attr("");
        int int11 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("t");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("t");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("text", "text");
        int int9 = textNode8.siblingIndex();
        int int10 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        boolean boolean12 = textNode0.equals((java.lang.Object) textNode8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode14 = textNode0.splitText((int) (byte) 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str4 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("t", "");
        java.lang.String str7 = textNode2.getWholeText();
        textNode2.settext("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node15 = textNode2.attr("ext", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("t");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textNode0.text();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        java.lang.String str4 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.outerHtml();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        org.jsoup.nodes.Node node3 = textNode0.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.getTEXT_KEY();
        java.lang.String str11 = textNode2.attr("");
        java.lang.String str12 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node10 = textNode7.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("#text");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        textNode2.text = "#text";
        boolean boolean11 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        int int12 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("ext");
        java.lang.String str10 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        int int1 = textNode0.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textNode0.toString();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        boolean boolean10 = textNode8.hasAttr("");
        textNode8.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#text");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "t");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str4 = textNode2.absUrl("text");
        textNode2.settext("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        java.lang.String str6 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        java.lang.String str6 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.gettext();
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "text");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("t");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("t");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.settext("ext");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        java.lang.String str10 = textNode9.toString();
        org.jsoup.nodes.Node node12 = textNode9.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("text");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        textNode2.text = "#text";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint;
        boolean boolean10 = outputSettings8.forceAllElementAsBlock;
        outputSettings8.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings8.indentAmount(1);
        java.nio.charset.CharsetEncoder charsetEncoder15 = outputSettings14.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.prettyPrint(true);
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings14.getcharsetEncoder();
        boolean boolean19 = textNode2.equals((java.lang.Object) outputSettings14);
        org.jsoup.nodes.Node node20 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("i!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        int int1 = textNode0.siblingIndex();
        java.lang.String str2 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.text();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.getWholeText();
        textNode2.settext("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.text();
        org.jsoup.nodes.Node node9 = textNode7.clone();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("#text");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str3 = textNode2.text;
        int int4 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.baseUri();
        org.jsoup.nodes.Node node9 = textNode7.previousSibling();
        org.jsoup.nodes.Node node12 = textNode7.attr("text", "text");
        java.lang.String str14 = textNode7.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode7.wrap("text");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node11 = textNode2.attr("text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.toString();
        textNode6.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode6.wrap("t");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.text = "t";
        textNode2.ensureAttributes();
        textNode2.ensureAttributes();
        boolean boolean12 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("ext");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        int int1 = textNode0.siblingIndex();
        java.lang.String str2 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.toString();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.setBaseUri("hi!");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("t");
        java.lang.String str13 = textNode12.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode12.wrap("i!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        org.jsoup.nodes.Attributes attributes9 = textNode0.attributes();
        org.jsoup.nodes.Node node10 = textNode0.parent();
        org.jsoup.nodes.Node node11 = textNode0.clone();
        java.lang.String str12 = textNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode0.wrap("ext");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("text");
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("ext");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("i!");
        java.lang.String str5 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node15 = textNode2.attr("ext", "");
        java.lang.String str16 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("text");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "text");
        boolean boolean4 = textNode2.hasAttr("t");
        java.lang.String str5 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("text", "text");
        int int7 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node8 = textNode6.clone();
        boolean boolean9 = textNode2.equals((java.lang.Object) node8);
        org.jsoup.nodes.Node node10 = node8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node8.wrap("#text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node8 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode0.wrap("t");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("text");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        boolean boolean5 = textNode0.isBlank();
        textNode0.text = "t";
        org.jsoup.nodes.TextNode textNode9 = textNode0.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode9.wrap("text");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.childNodes();
        org.jsoup.nodes.Node node9 = textNode0.nextSibling();
        java.lang.String str10 = textNode0.text;
        boolean boolean12 = textNode0.hasAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode0.wrap("hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.gettext();
        textNode2.settext("#text");
        java.lang.String str9 = textNode2.text;
        textNode2.settext("t");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        textNode2.setBaseUri("text");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.Document document6 = textNode0.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("text", "text");
        int int10 = textNode9.siblingIndex();
        int int11 = textNode9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodes();
        org.jsoup.nodes.Node node13 = textNode9.parent();
        java.lang.String str14 = textNode9.toString();
        boolean boolean15 = textNode0.equals((java.lang.Object) str14);
        org.jsoup.nodes.TextNode textNode17 = textNode0.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode0.wrap("text");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        java.lang.String str9 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("i!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("h");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        java.lang.String str3 = textNode0.gettext();
        java.lang.String str4 = textNode0.text;
        boolean boolean5 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (short) 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        org.jsoup.nodes.Document document4 = textNode0.ownerDocument();
        java.lang.String str5 = textNode0.getWholeText();
        java.lang.String str6 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode8 = textNode0.splitText(0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        int int10 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("h");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        textNode2.settext("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("ext");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.text();
        textNode2.settext("hi!");
        java.lang.String str11 = textNode2.attr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode2.settext("hi!");
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("ext");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        java.lang.String str9 = textNode0.nodeName();
        org.jsoup.nodes.Node node10 = textNode0.clone();
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.nodes.Node node12 = node11.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node11.wrap("i!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        java.lang.String str10 = textNode9.toString();
        org.jsoup.nodes.Node node12 = textNode9.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("#");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        textNode2.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("t");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "ext");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode5.wrap("text");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode5.text = "#text";
        org.jsoup.nodes.Node node10 = textNode5.attr("h", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode5.wrap("ext");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        textNode2.settext("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str10 = textNode2.attr("ext");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode0.wrap("#");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("ext");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.Document document6 = textNode0.ownerDocument();
        java.lang.String str7 = textNode0.nodeName();
        org.jsoup.nodes.Node node8 = textNode0.nextSibling();
        textNode0.settext("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode0.wrap("i");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node8 = textNode0.parent();
        java.lang.String str9 = textNode0.toString();
        java.lang.String str11 = textNode0.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode0.wrap("ext");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        textNode2.text = "t";
        textNode2.ensureAttributes();
        boolean boolean11 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        java.lang.String str3 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.outerHtml();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str4 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.toString();
        java.lang.String str9 = textNode0.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        int int16 = outputSettings15.getindentAmount();
        outputSettings15.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        outputSettings19.charset = charset21;
        outputSettings19.indentAmount = (-1);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint;
        boolean boolean27 = outputSettings25.forceAllElementAsBlock;
        int int28 = outputSettings25.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint;
        boolean boolean33 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        outputSettings31.setcharset(charset37);
        outputSettings30.setcharset(charset37);
        outputSettings25.setcharset(charset37);
        outputSettings19.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.forceAllElementAsBlock(false);
        boolean boolean45 = textNode0.equals((java.lang.Object) outputSettings42);
        org.jsoup.nodes.Node node46 = textNode0.previousSibling();
        java.lang.String str47 = textNode0.getTEXT_KEY();
        java.lang.String str48 = textNode0.text;
        org.jsoup.nodes.Node node49 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node51 = textNode0.wrap("i");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.text;
        java.lang.String str4 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("ext");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str3 = textNode2.text;
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.text = "i!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("t");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str3 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.settext("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("ext");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode0.wrap("!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.text();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        boolean boolean9 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        java.nio.charset.Charset charset16 = outputSettings10.charset;
        outputSettings10.setprettyPrint(false);
        java.nio.charset.Charset charset19 = outputSettings10.getcharset();
        boolean boolean20 = textNode2.equals((java.lang.Object) charset19);
        org.jsoup.nodes.Node node21 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("t");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.gettext();
        textNode2.setBaseUri("t");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        java.lang.String str9 = textNode0.nodeName();
        org.jsoup.nodes.Node node10 = textNode0.clone();
        java.lang.String str11 = textNode0.gettext();
        org.jsoup.nodes.Node node12 = textNode0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode0.wrap("!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode8.toString();
        java.lang.String str10 = textNode8.text();
        java.lang.String str11 = textNode8.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("ext");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("text", "text");
        int int9 = textNode8.siblingIndex();
        int int10 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        boolean boolean12 = textNode0.equals((java.lang.Object) textNode8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode0.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = textNode0.text();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        java.lang.String str3 = textNode0.gettext();
        java.lang.String str4 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode6 = textNode0.splitText((int) (byte) 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.settext("ext");
        boolean boolean11 = textNode2.isBlank();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.Document document6 = textNode0.ownerDocument();
        java.lang.String str7 = textNode0.nodeName();
        org.jsoup.nodes.Node node8 = textNode0.nextSibling();
        java.lang.String str9 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("h");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node11 = textNode2.attr("text", "#text");
        java.lang.String str12 = textNode2.gettext();
        java.lang.String str13 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        textNode2.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("ext");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("t");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("text");
        textNode12.settext("h");
        org.jsoup.nodes.Document document15 = textNode12.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode12.wrap("i");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        textNode2.text = "#text";
        boolean boolean11 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.lang.String str13 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.isBlank();
        boolean boolean12 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("i");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        boolean boolean9 = textNode2.hasAttr("text");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        java.nio.charset.Charset charset16 = outputSettings10.charset;
        outputSettings10.setprettyPrint(false);
        java.nio.charset.Charset charset19 = outputSettings10.getcharset();
        boolean boolean20 = textNode2.equals((java.lang.Object) charset19);
        java.lang.String str22 = textNode2.attr("#text");
        boolean boolean23 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes24 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint;
        boolean boolean14 = outputSettings12.forceAllElementAsBlock;
        outputSettings12.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder17 = outputSettings12.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean19 = outputSettings18.prettyPrint;
        boolean boolean20 = outputSettings18.forceAllElementAsBlock;
        outputSettings18.setprettyPrint(false);
        outputSettings18.setindentAmount(0);
        outputSettings18.indentAmount = (byte) 1;
        java.nio.charset.Charset charset27 = outputSettings18.getcharset();
        outputSettings12.setcharset(charset27);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings12.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean31 = outputSettings30.prettyPrint;
        boolean boolean32 = outputSettings30.forceAllElementAsBlock;
        outputSettings30.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings30.indentAmount(1);
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings36.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings36.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean43 = outputSettings42.prettyPrint;
        boolean boolean44 = outputSettings42.forceAllElementAsBlock;
        boolean boolean45 = outputSettings42.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings42.prettyPrint(false);
        int int48 = outputSettings47.getindentAmount();
        outputSettings47.setindentAmount((int) 'a');
        java.nio.charset.CharsetEncoder charsetEncoder51 = outputSettings47.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean53 = outputSettings52.prettyPrint;
        boolean boolean54 = outputSettings52.forceAllElementAsBlock;
        boolean boolean55 = outputSettings52.getprettyPrint();
        boolean boolean56 = outputSettings52.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings52.indentAmount((int) '4');
        org.jsoup.nodes.Entities.EscapeMode escapeMode59 = outputSettings58.escapeMode();
        outputSettings47.setescapeMode(escapeMode59);
        outputSettings36.escapeMode = escapeMode59;
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings12.escapeMode(escapeMode59);
        boolean boolean63 = textNode2.equals((java.lang.Object) outputSettings62);
        java.lang.String str64 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node66 = textNode2.wrap("i!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode2.settext("hi!");
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.hasAttr("ext");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("ext");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("#text");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str4 = textNode2.absUrl("t");
        java.lang.String str5 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.lang.String str8 = textNode0.baseUri();
        java.lang.String str9 = textNode0.getTEXT_KEY();
        org.jsoup.nodes.Node node10 = textNode0.previousSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode0.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode0.wrap("i!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.lang.String str9 = textNode0.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("i!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "ext");
        java.lang.String str3 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("i");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        java.lang.String str3 = textNode2.toString();
        textNode2.settext("");
        java.lang.String str6 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = textNode0.text();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.baseUri();
        org.jsoup.nodes.Node node9 = textNode7.previousSibling();
        org.jsoup.nodes.Node node12 = textNode7.attr("text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str15 = textNode2.text();
        java.lang.String str16 = textNode2.getTEXT_KEY();
        java.lang.String str17 = textNode2.toString();
        boolean boolean18 = textNode2.isBlank();
        boolean boolean20 = textNode2.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        int int6 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("h");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "ext");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode5.wrap("hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        boolean boolean6 = textNode0.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode0.siblingNodes();
        java.lang.String str8 = textNode0.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode0.wrap("#");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("text");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode7.wrap("i!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("t");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        org.jsoup.nodes.Node node8 = textNode5.attr("hi!", "t");
        java.lang.String str10 = textNode5.attr("#text");
        java.lang.String str11 = textNode5.getTEXT_KEY();
        java.lang.String str13 = textNode5.absUrl("t");
        org.jsoup.nodes.Node node14 = textNode5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("#text");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        boolean boolean3 = textNode0.isBlank();
        org.jsoup.nodes.Node node4 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.toString();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode();
        textNode6.setBaseUri("hi!");
        java.lang.String str9 = textNode6.getTEXT_KEY();
        textNode6.text = "hi!";
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode13.attr("#text", "");
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("#");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.text = "hi!";
        java.lang.String str13 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.childNodes();
        org.jsoup.nodes.Node node9 = textNode0.nextSibling();
        java.lang.String str10 = textNode0.text;
        java.lang.String str12 = textNode0.attr("ext");
        java.lang.String str14 = textNode0.absUrl("i!");
        java.lang.String str15 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode0.wrap("!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        boolean boolean4 = textNode2.hasAttr("text");
        boolean boolean6 = textNode2.hasAttr("text");
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        boolean boolean6 = textNode0.isBlank();
        int int7 = textNode0.siblingIndex();
        boolean boolean8 = textNode0.isBlank();
        java.lang.String str9 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = textNode0.text();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        textNode2.setBaseUri("text");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.text();
        textNode2.settext("text");
        java.lang.String str12 = textNode2.outerHtml();
        textNode2.settext("#");
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("h");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        org.jsoup.nodes.TextNode textNode5 = textNode0.text("");
        java.lang.String str6 = textNode5.gettext();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        org.jsoup.nodes.Node node8 = textNode5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("#text");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        textNode2.setBaseUri("text");
        java.lang.String str12 = textNode2.gettext();
        boolean boolean14 = textNode2.hasAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.setBaseUri("ext");
        java.lang.String str6 = textNode0.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = textNode0.text();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "ext");
        textNode2.ensureAttributes();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        textNode2.setBaseUri("ext");
        java.lang.String str9 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.toString();
        textNode6.ensureAttributes();
        org.jsoup.nodes.Node node11 = textNode6.attr("#text", "ext");
        java.lang.String str13 = textNode6.absUrl("ext");
        org.jsoup.nodes.Node node15 = textNode6.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode6.wrap("t");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.setBaseUri("#text");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("ext");
        java.lang.String str10 = textNode2.toString();
        java.lang.String str12 = textNode2.attr("text");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        textNode2.settext("t");
        java.lang.String str13 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("t", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        boolean boolean5 = textNode0.isBlank();
        textNode0.text = "t";
        java.lang.String str8 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode0.wrap("#");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        textNode2.setBaseUri("text");
        java.lang.String str8 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("ext");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        org.jsoup.nodes.Node node6 = textNode0.parent();
        java.lang.String str7 = textNode0.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = textNode0.text();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        java.lang.String str8 = textNode0.getWholeText();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("text", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint;
        boolean boolean14 = textNode11.equals((java.lang.Object) outputSettings12);
        int int15 = outputSettings12.getindentAmount();
        int int16 = outputSettings12.getindentAmount();
        boolean boolean17 = textNode0.equals((java.lang.Object) int16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode0.wrap("h");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode0.ownerDocument();
        java.lang.String str11 = textNode0.attr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode0.wrap("t");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        textNode2.settext("t");
        java.lang.String str6 = textNode2.absUrl("h");
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        boolean boolean6 = textNode0.isBlank();
        org.jsoup.nodes.Node node7 = textNode0.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode9 = textNode0.splitText((int) '#');
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.ensureAttributes();
        boolean boolean7 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.attr("text");
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.gettext();
        textNode2.settext("text");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Node node13 = textNode2.attr("text", "hi!");
        java.lang.String str14 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node17 = textNode2.attr("t", "i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.wrap("#");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node15 = textNode2.attr("ext", "");
        java.lang.String str16 = textNode2.getTEXT_KEY();
        textNode2.setBaseUri("t");
        java.lang.String str19 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("ext");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        java.lang.String str6 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        boolean boolean5 = textNode0.isBlank();
        textNode0.text = "t";
        textNode0.settext("text");
        java.lang.String str10 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode0.wrap("#");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = textNode2.toString();
        java.lang.String str12 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Node node15 = textNode2.attr("#", "!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.baseUri();
        org.jsoup.nodes.Node node9 = textNode7.previousSibling();
        textNode7.ensureAttributes();
        boolean boolean11 = textNode7.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("#");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        java.lang.String str8 = textNode7.nodeName();
        java.lang.String str9 = textNode7.text;
        textNode7.text = "h";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("h");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("text");
        java.lang.String str10 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.getWholeText();
        java.lang.String str12 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint;
        boolean boolean11 = outputSettings9.forceAllElementAsBlock;
        boolean boolean12 = outputSettings9.getprettyPrint();
        boolean boolean13 = outputSettings9.forceAllElementAsBlock();
        boolean boolean14 = outputSettings9.forceAllElementAsBlock;
        boolean boolean15 = textNode0.equals((java.lang.Object) outputSettings9);
        java.lang.String str16 = textNode0.text;
        org.jsoup.nodes.Node node17 = textNode0.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode0.siblingNodes();
        org.jsoup.nodes.Node node21 = textNode0.attr("t", "ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode0.wrap("h");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean10 = outputSettings9.prettyPrint;
        boolean boolean11 = outputSettings9.forceAllElementAsBlock;
        boolean boolean12 = outputSettings9.getprettyPrint();
        boolean boolean13 = outputSettings9.forceAllElementAsBlock();
        boolean boolean14 = outputSettings9.forceAllElementAsBlock;
        boolean boolean15 = textNode0.equals((java.lang.Object) outputSettings9);
        textNode0.ensureAttributes();
        org.jsoup.nodes.Document document17 = textNode0.ownerDocument();
        org.jsoup.nodes.Node node20 = textNode0.attr("hi!", "#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("#");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("#text");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str7 = textNode6.toString();
        textNode6.ensureAttributes();
        java.lang.String str9 = textNode6.text();
        java.lang.String str10 = textNode6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        org.jsoup.nodes.TextNode textNode10 = textNode0.text("ext");
        boolean boolean11 = textNode0.isBlank();
        java.lang.String str12 = textNode0.gettext();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("text", "text");
        int int16 = textNode15.siblingIndex();
        int int17 = textNode15.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode15.clone();
        java.lang.String str19 = textNode15.text;
        java.lang.String str20 = textNode15.nodeName();
        org.jsoup.nodes.TextNode textNode22 = textNode15.splitText(0);
        java.lang.String str23 = textNode22.toString();
        org.jsoup.nodes.Node node25 = textNode22.removeAttr("i!");
        boolean boolean26 = textNode0.equals((java.lang.Object) textNode22);
        textNode0.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode0.wrap("!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        org.jsoup.nodes.TextNode textNode10 = textNode0.text("ext");
        boolean boolean11 = textNode0.isBlank();
        java.lang.String str12 = textNode0.gettext();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("text", "text");
        int int16 = textNode15.siblingIndex();
        int int17 = textNode15.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode15.clone();
        java.lang.String str19 = textNode15.text;
        java.lang.String str20 = textNode15.nodeName();
        org.jsoup.nodes.TextNode textNode22 = textNode15.splitText(0);
        java.lang.String str23 = textNode22.toString();
        org.jsoup.nodes.Node node25 = textNode22.removeAttr("i!");
        boolean boolean26 = textNode0.equals((java.lang.Object) textNode22);
        java.lang.String str27 = textNode0.outerHtml();
        java.lang.String str28 = textNode0.nodeName();
        org.jsoup.nodes.Node node30 = textNode0.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = node30.wrap("hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("text");
        int int14 = textNode13.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode13.wrap("#");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.text();
        boolean boolean9 = textNode2.isBlank();
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        boolean boolean7 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("t");
        java.lang.String str10 = textNode2.toString();
        java.lang.String str11 = textNode2.getTEXT_KEY();
        textNode2.settext("");
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str15 = textNode2.text();
        textNode2.text = "i";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "t");
        java.lang.String str3 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("ext");
        boolean boolean8 = textNode2.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.baseUri();
        org.jsoup.nodes.Node node11 = textNode0.attr("h", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint;
        boolean boolean15 = outputSettings13.forceAllElementAsBlock;
        boolean boolean16 = outputSettings13.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings13.prettyPrint(false);
        int int19 = outputSettings18.getindentAmount();
        outputSettings18.setindentAmount((int) 'a');
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings18.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint;
        boolean boolean25 = outputSettings23.forceAllElementAsBlock;
        boolean boolean26 = outputSettings23.getprettyPrint();
        boolean boolean27 = outputSettings23.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.indentAmount((int) '4');
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        outputSettings18.setescapeMode(escapeMode30);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint;
        boolean boolean34 = outputSettings32.forceAllElementAsBlock;
        boolean boolean35 = outputSettings32.getprettyPrint();
        boolean boolean36 = outputSettings32.forceAllElementAsBlock();
        outputSettings32.forceAllElementAsBlock = false;
        java.nio.charset.CharsetEncoder charsetEncoder39 = outputSettings32.charsetEncoder;
        java.nio.charset.Charset charset40 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings18.charset(charset40);
        boolean boolean42 = node11.equals((java.lang.Object) charset40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node44 = node11.wrap("h");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "text");
        boolean boolean4 = textNode2.hasAttr("t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        java.lang.String str4 = textNode2.absUrl("t");
        java.lang.String str5 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.TextNode textNode7 = textNode0.splitText((int) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode0.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode0.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode0.wrap("i");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.text();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str7 = textNode5.absUrl("#text");
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode5.wrap("h");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.settext("text");
        org.jsoup.nodes.Node node6 = textNode0.nextSibling();
        java.lang.String str7 = textNode0.gettext();
        int int8 = textNode0.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode0.wrap("i");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "t");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("ext");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        textNode0.settext("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode0.wrap("i!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str10 = textNode2.absUrl("t");
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        textNode2.settext("");
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 1);
        textNode2.text = "#text";
        java.lang.String str13 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        textNode13.ensureAttributes();
        java.lang.String str16 = textNode13.attr("ext");
        org.jsoup.nodes.Node node17 = textNode13.clone();
        boolean boolean18 = textNode13.isBlank();
        org.jsoup.nodes.Node node20 = textNode13.removeAttr("hi!");
        java.lang.String str21 = textNode13.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode13.wrap("i");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        boolean boolean5 = textNode2.hasAttr("text");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode8.gettext();
        java.lang.String str11 = textNode8.absUrl("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        textNode2.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        java.lang.String str7 = textNode2.text;
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        boolean boolean11 = textNode2.hasAttr("t");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        textNode2.setBaseUri("ext");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        textNode2.text = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "t");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = node7.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("ext");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("t");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.absUrl("text");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("ext");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        textNode2.text = "h";
        java.lang.String str13 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.setBaseUri("hi!");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("t");
        java.lang.String str13 = textNode12.text();
        java.lang.String str14 = textNode12.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode12.wrap("hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        textNode2.ensureAttributes();
        boolean boolean6 = textNode2.hasAttr("ext");
        textNode2.text = "t";
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode2.attr("text", "i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("#");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.baseUri();
        textNode2.settext("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode12.wrap("#");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode2.settext("hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "t");
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("text");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "t");
        java.lang.String str3 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        textNode2.text = "#text";
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("#text");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.gettext();
        textNode2.settext("hi!");
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.text;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.prettyPrint;
        boolean boolean16 = outputSettings14.forceAllElementAsBlock;
        outputSettings14.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        outputSettings14.setcharset(charset20);
        outputSettings14.setprettyPrint(true);
        java.nio.charset.Charset charset24 = outputSettings14.getcharset();
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings14.charsetEncoder;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings14.escapeMode();
        boolean boolean27 = outputSettings14.getprettyPrint();
        boolean boolean28 = outputSettings14.forceAllElementAsBlock();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings14.getescapeMode();
        boolean boolean30 = textNode2.equals((java.lang.Object) escapeMode29);
        java.lang.String str31 = textNode2.toString();
        textNode2.text = "#";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = textNode2.wrap("i");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        textNode11.ensureAttributes();
        textNode11.text = "t";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode11.wrap("i!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.text();
        org.jsoup.nodes.Node node9 = textNode7.clone();
        org.jsoup.nodes.Node node11 = textNode7.removeAttr("ext");
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.settext("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("ext");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.text = "hi!";
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("t");
        java.lang.String str15 = textNode2.baseUri();
        textNode2.text = "i!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("t");
        java.lang.String str6 = textNode5.baseUri();
        org.jsoup.nodes.Document document7 = textNode5.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode5.wrap("text");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        textNode13.ensureAttributes();
        java.lang.String str16 = textNode13.attr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode13.wrap("ext");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        java.lang.String str1 = textNode0.nodeName();
        int int2 = textNode0.siblingIndex();
        java.lang.String str3 = textNode0.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode5 = textNode0.splitText((int) (short) 100);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.settext("text");
        java.lang.String str6 = textNode0.getWholeText();
        java.lang.String str8 = textNode0.absUrl("text");
        boolean boolean9 = textNode0.isBlank();
        java.lang.String str10 = textNode0.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode0.wrap("i");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.settext("");
        textNode2.setBaseUri("hi!");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("ext");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("t");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode();
        textNode11.setBaseUri("hi!");
        java.lang.String str14 = textNode11.text;
        java.lang.String str15 = textNode11.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.siblingNodes();
        boolean boolean17 = textNode2.equals((java.lang.Object) nodeList16);
        org.jsoup.nodes.Node node18 = textNode2.clone();
        textNode2.settext("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("#text");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        boolean boolean5 = textNode0.isBlank();
        org.jsoup.nodes.Node node6 = textNode0.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = textNode0.toString();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "t");
        textNode2.text = "t";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode();
        textNode6.setBaseUri("hi!");
        java.lang.String str9 = textNode6.getTEXT_KEY();
        textNode6.text = "hi!";
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode13.attr("#text", "");
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        java.lang.String str19 = textNode2.absUrl("ext");
        java.lang.String str20 = textNode2.text;
        java.lang.String str22 = textNode2.attr("");
        java.lang.String str23 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        boolean boolean7 = textNode5.hasAttr("hi!");
        java.lang.String str8 = textNode5.baseUri();
        java.lang.String str9 = textNode5.baseUri();
        boolean boolean10 = textNode5.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode5.wrap("i!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.gettext();
        textNode2.setBaseUri("t");
        java.lang.String str11 = textNode2.attr("ext");
        java.lang.String str13 = textNode2.attr("hi!");
        java.lang.String str14 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("t");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        org.jsoup.nodes.TextNode textNode5 = textNode0.text("");
        java.lang.String str6 = textNode5.gettext();
        textNode5.ensureAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode5.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode5.wrap("t");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        org.jsoup.nodes.Document document6 = textNode0.ownerDocument();
        java.lang.String str7 = textNode0.nodeName();
        java.lang.String str8 = textNode0.gettext();
        org.jsoup.nodes.Node node9 = textNode0.nextSibling();
        java.lang.String str10 = textNode0.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode0.wrap("t");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode6.nextSibling();
        java.lang.String str9 = textNode6.gettext();
        org.jsoup.nodes.Node node12 = textNode6.attr("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        java.lang.String str14 = textNode6.text;
        org.jsoup.nodes.Node node17 = textNode6.attr("!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode6.wrap("hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.toString();
        java.lang.String str9 = textNode0.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        int int16 = outputSettings15.getindentAmount();
        outputSettings15.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        outputSettings19.charset = charset21;
        outputSettings19.indentAmount = (-1);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint;
        boolean boolean27 = outputSettings25.forceAllElementAsBlock;
        int int28 = outputSettings25.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint;
        boolean boolean33 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        outputSettings31.setcharset(charset37);
        outputSettings30.setcharset(charset37);
        outputSettings25.setcharset(charset37);
        outputSettings19.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.forceAllElementAsBlock(false);
        boolean boolean45 = textNode0.equals((java.lang.Object) outputSettings42);
        org.jsoup.nodes.Node node46 = textNode0.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = textNode0.wrap("h");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        org.jsoup.nodes.Node node9 = textNode0.removeAttr("hi!");
        node9.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("!");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "text");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("ext");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        outputSettings4.forceAllElementAsBlock = true;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings4.prettyPrint(true);
        boolean boolean9 = outputSettings8.prettyPrint();
        boolean boolean10 = outputSettings8.getforceAllElementAsBlock();
        boolean boolean11 = textNode2.equals((java.lang.Object) outputSettings8);
        java.lang.String str13 = textNode2.attr("i!");
        java.lang.String str14 = textNode2.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        textNode11.ensureAttributes();
        java.lang.String str13 = textNode11.baseUri();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("");
        java.lang.String str16 = textNode15.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode15.wrap("#");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.lang.String str3 = textNode2.gettext();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i");
        java.lang.String str9 = textNode2.absUrl("!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("ext");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        org.jsoup.nodes.TextNode textNode5 = textNode0.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode0.wrap("text");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("i!");
        java.lang.String str5 = textNode4.gettext();
        org.jsoup.nodes.Node node6 = textNode4.clone();
        java.lang.String str7 = textNode4.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode4.wrap("text");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        boolean boolean3 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode5 = textNode0.splitText((int) (byte) 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str4 = textNode2.absUrl("t");
        textNode2.setBaseUri("");
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "t");
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("t");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(1);
        textNode13.ensureAttributes();
        java.lang.String str16 = textNode13.attr("ext");
        org.jsoup.nodes.Node node17 = textNode13.clone();
        org.jsoup.nodes.Node node18 = textNode13.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode13.wrap("t");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str9 = textNode2.attr("hi!");
        textNode2.settext("h");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.getWholeText();
        textNode2.settext("text");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("text");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("ext", "");
        boolean boolean4 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        textNode6.ensureAttributes();
        java.lang.String str8 = textNode6.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode6.wrap("!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        textNode2.ensureAttributes();
        boolean boolean6 = textNode2.hasAttr("ext");
        textNode2.text = "t";
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.attr("hi!", "i");
        org.jsoup.nodes.Node node13 = node12.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("t");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        textNode2.settext("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("ext", "text");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean4 = outputSettings3.prettyPrint;
        boolean boolean5 = outputSettings3.forceAllElementAsBlock;
        outputSettings3.setprettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings3.getcharsetEncoder();
        boolean boolean9 = outputSettings3.getprettyPrint();
        boolean boolean10 = textNode2.equals((java.lang.Object) outputSettings3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.toString();
        java.lang.String str9 = textNode0.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        int int16 = outputSettings15.getindentAmount();
        outputSettings15.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        outputSettings19.charset = charset21;
        outputSettings19.indentAmount = (-1);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint;
        boolean boolean27 = outputSettings25.forceAllElementAsBlock;
        int int28 = outputSettings25.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint;
        boolean boolean33 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        outputSettings31.setcharset(charset37);
        outputSettings30.setcharset(charset37);
        outputSettings25.setcharset(charset37);
        outputSettings19.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.forceAllElementAsBlock(false);
        boolean boolean45 = textNode0.equals((java.lang.Object) outputSettings42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node47 = textNode0.wrap("t");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("t", "t");
        textNode2.ensureAttributes();
        java.lang.String str4 = textNode2.getTEXT_KEY();
        java.lang.String str5 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode2.ensureAttributes();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("i");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.gettext();
        textNode2.settext("text");
        java.lang.String str9 = textNode2.getTEXT_KEY();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("hi!");
        java.lang.String str12 = textNode2.text();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "ext");
        textNode2.settext("ext");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("h");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        java.lang.String str6 = textNode2.getTEXT_KEY();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("ext");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("text", "text");
        int int9 = textNode8.siblingIndex();
        int int10 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        boolean boolean12 = textNode0.equals((java.lang.Object) textNode8);
        java.lang.String str13 = textNode8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode8.siblingNodes();
        java.lang.String str15 = textNode8.toString();
        java.lang.String str17 = textNode8.absUrl("#text");
        textNode8.settext("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode8.wrap("i");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        org.jsoup.nodes.Document document4 = textNode0.ownerDocument();
        java.lang.String str5 = textNode0.getWholeText();
        org.jsoup.nodes.Node node6 = textNode0.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = textNode0.toString();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str4 = textNode2.absUrl("t");
        java.lang.String str5 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("t");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        textNode2.setBaseUri("text");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("text");
        java.lang.String str8 = textNode7.text();
        org.jsoup.nodes.Node node9 = textNode7.clone();
        java.lang.String str10 = textNode7.nodeName();
        java.lang.String str11 = textNode7.nodeName();
        org.jsoup.nodes.Node node12 = textNode7.parent();
        boolean boolean14 = textNode7.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode7.wrap("ext");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        textNode2.text = "";
        java.lang.String str7 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        int int9 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str9 = textNode2.attr("hi!");
        textNode2.settext("h");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.getWholeText();
        textNode2.settext("text");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node18.wrap("#text");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("ext");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("#text");
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str14 = textNode2.absUrl("i!");
        java.lang.String str16 = textNode2.absUrl("#text");
        java.lang.String str17 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode6.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode6.wrap("ext");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("text");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.text;
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode9 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode11 = textNode9.splitText((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode11.wrap("h");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        org.jsoup.nodes.Node node8 = textNode0.clone();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode();
        textNode9.setBaseUri("hi!");
        java.lang.String str12 = textNode9.getTEXT_KEY();
        textNode9.text = "hi!";
        boolean boolean16 = textNode9.hasAttr("text");
        boolean boolean17 = node8.equals((java.lang.Object) "text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node8.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node8.wrap("ext");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode0.childNodes();
        org.jsoup.nodes.Node node9 = textNode0.nextSibling();
        java.lang.String str10 = textNode0.text;
        boolean boolean12 = textNode0.hasAttr("h");
        java.lang.String str13 = textNode0.text;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode0.wrap("t");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("t", "");
        java.lang.String str7 = textNode2.getWholeText();
        textNode2.settext("h");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.text;
        java.lang.String str12 = textNode2.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.toString();
        java.lang.String str9 = textNode0.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        int int16 = outputSettings15.getindentAmount();
        outputSettings15.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        outputSettings19.charset = charset21;
        outputSettings19.indentAmount = (-1);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint;
        boolean boolean27 = outputSettings25.forceAllElementAsBlock;
        int int28 = outputSettings25.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint;
        boolean boolean33 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        outputSettings31.setcharset(charset37);
        outputSettings30.setcharset(charset37);
        outputSettings25.setcharset(charset37);
        outputSettings19.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.forceAllElementAsBlock(false);
        boolean boolean45 = textNode0.equals((java.lang.Object) outputSettings42);
        int int46 = textNode0.siblingIndex();
        java.lang.String str47 = textNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = textNode0.wrap("hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode();
        textNode6.setBaseUri("hi!");
        java.lang.String str9 = textNode6.getTEXT_KEY();
        textNode6.text = "hi!";
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode13.attr("#text", "");
        boolean boolean17 = textNode2.equals((java.lang.Object) node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node16.wrap("hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        textNode2.setBaseUri("text");
        textNode2.ensureAttributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("t");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "ext");
        java.lang.String str3 = textNode2.getWholeText();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        java.lang.String str4 = textNode0.gettext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = textNode0.text();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        java.lang.String str4 = textNode2.absUrl("t");
        textNode2.text = "text";
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.getTEXT_KEY();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("t");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.absUrl("text");
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str14 = textNode2.absUrl("text");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("t");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        textNode0.text = "hi!";
        boolean boolean7 = textNode0.hasAttr("");
        java.lang.String str8 = textNode0.toString();
        java.lang.String str9 = textNode0.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint;
        boolean boolean12 = outputSettings10.forceAllElementAsBlock;
        boolean boolean13 = outputSettings10.getprettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        int int16 = outputSettings15.getindentAmount();
        outputSettings15.setindentAmount((int) 'a');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset21 = outputSettings20.charset();
        outputSettings19.charset = charset21;
        outputSettings19.indentAmount = (-1);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean26 = outputSettings25.prettyPrint;
        boolean boolean27 = outputSettings25.forceAllElementAsBlock;
        int int28 = outputSettings25.getindentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings25.getcharsetEncoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint;
        boolean boolean33 = outputSettings31.forceAllElementAsBlock;
        outputSettings31.indentAmount = '#';
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        outputSettings31.setcharset(charset37);
        outputSettings30.setcharset(charset37);
        outputSettings25.setcharset(charset37);
        outputSettings19.setcharset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings15.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings42.forceAllElementAsBlock(false);
        boolean boolean45 = textNode0.equals((java.lang.Object) outputSettings42);
        org.jsoup.nodes.Node node46 = textNode0.previousSibling();
        java.lang.String str47 = textNode0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node49 = textNode0.wrap("text");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.text;
        java.lang.String str4 = textNode0.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode0.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = textNode0.toString();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = textNode0.text();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(1);
        textNode2.ensureAttributes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        textNode2.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("t");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        org.jsoup.nodes.Document document1 = textNode0.ownerDocument();
        boolean boolean2 = textNode0.isBlank();
        boolean boolean3 = textNode0.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.TextNode textNode5 = textNode0.splitText((int) '4');
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.TextNode textNode0 = new org.jsoup.nodes.TextNode();
        textNode0.setBaseUri("hi!");
        java.lang.String str3 = textNode0.getTEXT_KEY();
        java.lang.String str4 = textNode0.baseUri();
        java.lang.String str5 = textNode0.text;
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("text", "text");
        int int9 = textNode8.siblingIndex();
        int int10 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node11 = textNode8.clone();
        boolean boolean12 = textNode0.equals((java.lang.Object) textNode8);
        java.lang.String str13 = textNode8.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode8.siblingNodes();
        java.lang.String str15 = textNode8.toString();
        java.lang.String str17 = textNode8.absUrl("#text");
        org.jsoup.nodes.TextNode textNode19 = textNode8.splitText(0);
        org.jsoup.nodes.Node node20 = textNode8.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode8.wrap("#text");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "text");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("t", "");
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        textNode2.settext("hi!");
        java.lang.String str14 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        java.lang.String str3 = textNode2.text;
        org.jsoup.nodes.Node node4 = textNode2.parent();
        textNode2.ensureAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("text", "text");
        int int3 = textNode2.siblingIndex();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "");
        java.lang.String str8 = textNode2.gettext();
        org.jsoup.nodes.Node node11 = textNode2.attr("text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("i");
    }
}

