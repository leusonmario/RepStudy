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
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode4.wrap("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.lang.String str13 = textNode6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("#text");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.lang.String str13 = textNode6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#text");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("i!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        org.jsoup.nodes.Node node7 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str8 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.outerHtml();
        int int15 = textNode2.siblingIndex();
        java.lang.String str16 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str7 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str6 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("#text");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode4.childNodes();
        org.jsoup.nodes.Node node10 = textNode4.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode5.wrap("i!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node6.wrap("i!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        boolean boolean10 = textNode2.isBlank();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("#text");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        java.lang.String str9 = textNode6.getWholeText();
        java.lang.String str10 = textNode6.outerHtml();
        org.jsoup.nodes.Node node11 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("#text");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        java.lang.String str8 = node7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        boolean boolean11 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        org.jsoup.nodes.Node node32 = textNode6.attr("hi!", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = node32.wrap("#text");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean16 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = textNode13.removeAttr("hi!");
        boolean boolean19 = textNode2.equals((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        boolean boolean21 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str3 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("i!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean7 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean11 = textNode2.hasAttr("#text");
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#text");
        node9.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("#text");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("i!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.nodeName();
        boolean boolean6 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        java.lang.String str10 = textNode4.text();
        org.jsoup.nodes.Node node11 = textNode4.clone();
        org.jsoup.nodes.Node node12 = textNode4.parent();
        java.lang.String str14 = textNode4.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode4.wrap("#text");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode4.childNodes();
        org.jsoup.nodes.Node node10 = textNode4.attr("i!", "hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode4.attributes();
        org.jsoup.nodes.Attributes attributes12 = textNode4.attributes();
        java.lang.String str13 = textNode4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode4.wrap("i!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str13 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("i!");
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        boolean boolean12 = textNode2.hasAttr("i!");
        java.lang.String str13 = textNode2.toString();
        java.lang.String str14 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "i!");
        int int10 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str3 = textNode2.baseUri();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "i!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.attr("hi!");
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean12 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode10.attributes();
        java.lang.String str14 = textNode10.toString();
        boolean boolean16 = textNode10.equals((java.lang.Object) 97);
        boolean boolean17 = textNode2.equals((java.lang.Object) boolean16);
        org.jsoup.nodes.Node node18 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.toString();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode6);
        java.lang.String str12 = textNode6.text();
        java.lang.String str14 = textNode6.absUrl("i!");
        textNode6.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        java.lang.String str11 = textNode2.text();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        org.jsoup.nodes.Node node16 = textNode6.attr("i!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("i!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes17 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.parent();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("#text");
        textNode12.setBaseUri("#text");
        textNode12.setBaseUri("hi!");
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode12);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        java.lang.String str21 = textNode2.text();
        org.jsoup.nodes.Node node22 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#text");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        node6.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("#text");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.attr("i!", "");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node15 = textNode12.attr("i!", "");
        boolean boolean16 = node9.equals((java.lang.Object) node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node9.wrap("hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        int int7 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean8 = textNode7.isBlank();
        org.jsoup.nodes.Node node11 = textNode7.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode7.text("#text");
        org.jsoup.nodes.Node node15 = textNode13.removeAttr("#text");
        java.lang.String str17 = textNode13.absUrl("#text");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode20 = textNode13.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode20.wrap("h");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("h");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.text();
        java.lang.String str14 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        int int8 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("i!");
        java.lang.String str17 = textNode2.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("h");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str12 = textNode10.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode10.wrap("#text");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.lang.String str10 = node9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("h");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.attr("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        int int18 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.escapeMode(escapeMode23);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings11.escapeMode(escapeMode23);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings11.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings28.prettyPrint(false);
        int int31 = outputSettings30.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings30.escapeMode();
        boolean boolean33 = textNode2.equals((java.lang.Object) escapeMode32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = textNode2.wrap("#text");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        boolean boolean6 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.toString();
        java.lang.String str12 = textNode2.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode8.wrap("i!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode6.wrap("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        java.lang.String str7 = textNode6.toString();
        boolean boolean8 = textNode6.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode6.wrap("#text");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str10 = textNode9.text();
        org.jsoup.nodes.Node node11 = textNode9.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("");
        boolean boolean14 = textNode4.equals((java.lang.Object) textNode13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode13.wrap("h");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.toString();
        boolean boolean9 = textNode2.equals((java.lang.Object) str8);
        org.jsoup.nodes.Node node12 = textNode2.attr("#text", "");
        java.lang.String str13 = node12.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("h");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        boolean boolean14 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("#text");
        java.lang.String str18 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("i!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.Node node12 = textNode10.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode10.wrap("hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        java.lang.String str16 = textNode15.baseUri();
        java.lang.String str18 = textNode15.attr("");
        int int19 = textNode15.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode15.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode15.wrap("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        boolean boolean19 = textNode2.isBlank();
        java.lang.String str21 = textNode2.attr("");
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("");
        boolean boolean25 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("#text");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("");
        java.lang.String str17 = textNode15.attr("#text");
        org.jsoup.nodes.Node node18 = textNode15.clone();
        boolean boolean19 = textNode2.equals((java.lang.Object) node18);
        java.lang.String str20 = textNode2.getWholeText();
        boolean boolean21 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("#text");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        java.lang.String str14 = textNode13.toString();
        boolean boolean16 = textNode13.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode13.wrap("text");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("#text");
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.Document document12 = textNode7.ownerDocument();
        boolean boolean13 = textNode7.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode7.wrap("h");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("i!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        textNode13.setBaseUri("hi!");
        java.lang.String str16 = textNode13.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode13.wrap("#text");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode5);
        org.jsoup.nodes.Node node11 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        java.lang.String str9 = textNode6.getWholeText();
        java.lang.String str10 = textNode6.outerHtml();
        java.lang.String str11 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("h");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document18 = textNode17.ownerDocument();
        org.jsoup.nodes.Node node21 = textNode17.attr("#text", "hi!");
        java.lang.String str22 = textNode17.nodeName();
        java.lang.String str24 = textNode17.absUrl("#text");
        textNode17.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) ' ');
        boolean boolean33 = outputSettings32.prettyPrint();
        boolean boolean34 = textNode17.equals((java.lang.Object) outputSettings32);
        java.nio.charset.Charset charset35 = outputSettings32.charset();
        boolean boolean36 = textNode2.equals((java.lang.Object) outputSettings32);
        java.lang.String str37 = textNode2.baseUri();
        org.jsoup.nodes.Node node38 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes39 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        java.lang.String str42 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node44 = textNode2.wrap("i!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("#text");
        java.lang.String str10 = textNode7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.siblingNodes();
        java.lang.String str12 = textNode7.nodeName();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode7);
        boolean boolean15 = textNode7.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode7.wrap("h");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str13 = textNode12.text();
        org.jsoup.nodes.Node node14 = textNode12.nextSibling();
        org.jsoup.nodes.TextNode textNode16 = textNode12.text("");
        java.lang.String str17 = textNode12.getWholeText();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode12.wrap("hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node10 = textNode6.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("i!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.text();
        java.lang.String str11 = textNode6.nodeName();
        boolean boolean12 = textNode6.isBlank();
        org.jsoup.nodes.Node node15 = textNode6.attr("h", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode6.wrap("i!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.jsoup.nodes.Node node15 = textNode2.attr("h", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str7 = textNode2.absUrl("#text");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node8 = node7.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("i!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "h");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("#text");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        int int13 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("h");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("text");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str8 = textNode6.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("");
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode6);
        boolean boolean12 = textNode6.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode6.wrap("hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.lang.String str13 = textNode6.outerHtml();
        org.jsoup.nodes.Node node16 = textNode6.attr("h", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node16.wrap("i!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean10 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        org.jsoup.nodes.Node node32 = textNode6.attr("i!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = node32.wrap("hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("h");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode10.wrap("text");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = node4.wrap("#text");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("hi!");
        java.lang.String str11 = textNode6.attr("#text");
        java.lang.String str12 = textNode6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode6.wrap("h");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.text();
        java.lang.String str11 = textNode6.nodeName();
        boolean boolean12 = textNode6.isBlank();
        org.jsoup.nodes.Node node14 = textNode6.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode6.wrap("text");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        int int8 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.getWholeText();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("h");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.lang.String str15 = textNode13.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode13.wrap("#text");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("i!");
        java.lang.String str11 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str9 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        textNode2.setBaseUri("i!");
        boolean boolean17 = textNode2.hasAttr("i!");
        boolean boolean18 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("text");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("i!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.siblingIndex();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        java.lang.String str15 = textNode2.outerHtml();
        java.lang.String str16 = textNode2.getWholeText();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("h");
        java.lang.String str19 = textNode2.baseUri();
        org.jsoup.nodes.Node node22 = textNode2.attr("h", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        boolean boolean18 = outputSettings17.prettyPrint();
        boolean boolean19 = textNode2.equals((java.lang.Object) outputSettings17);
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("#text");
        org.jsoup.nodes.Node node24 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node27 = textNode2.attr("text", "i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode2.wrap("h");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str9 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.clone();
        java.lang.String str10 = node6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node6.wrap("text");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.getWholeText();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.nodeName();
        org.jsoup.nodes.Node node11 = textNode6.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("#text");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "hi!");
        java.lang.String str15 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        node4.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node4.wrap("i!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str19 = textNode18.baseUri();
        boolean boolean21 = textNode18.hasAttr("#text");
        java.lang.String str23 = textNode18.attr("");
        java.lang.String str24 = textNode18.nodeName();
        org.jsoup.nodes.Node node25 = textNode18.previousSibling();
        org.jsoup.nodes.Node node27 = textNode18.removeAttr("i!");
        boolean boolean28 = textNode13.equals((java.lang.Object) "i!");
        org.jsoup.nodes.Node node29 = textNode13.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode13.wrap("h");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        org.jsoup.nodes.TextNode textNode11 = textNode4.text("#text");
        org.jsoup.nodes.Node node12 = textNode11.previousSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode11.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode11.wrap("hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str9 = textNode8.getWholeText();
        java.lang.String str10 = textNode8.baseUri();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode8.attributes();
        java.lang.String str14 = textNode8.nodeName();
        boolean boolean16 = textNode8.hasAttr("");
        boolean boolean17 = textNode5.equals((java.lang.Object) "");
        java.lang.String str18 = textNode5.nodeName();
        java.lang.String str20 = textNode5.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode5.wrap("text");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        org.jsoup.nodes.Node node10 = textNode9.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node10.wrap("hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        boolean boolean19 = textNode2.isBlank();
        java.lang.String str21 = textNode2.attr("");
        org.jsoup.nodes.Node node22 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("#text");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean11 = textNode2.hasAttr("#text");
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        java.lang.String str16 = textNode15.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode15.wrap("i!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#text");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.baseUri();
        org.jsoup.nodes.Node node13 = textNode6.attr("#text", "i!");
        java.lang.String str14 = textNode6.nodeName();
        java.lang.String str15 = textNode6.outerHtml();
        textNode6.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode6.wrap("i!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node16 = textNode6.previousSibling();
        java.lang.String str18 = textNode6.absUrl("i!");
        org.jsoup.nodes.TextNode textNode20 = textNode6.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("#text");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        org.jsoup.nodes.Node node16 = textNode6.attr("i!", "");
        int int17 = textNode6.siblingIndex();
        int int18 = textNode6.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode6.siblingNodes();
        java.lang.String str20 = textNode6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document18 = textNode17.ownerDocument();
        org.jsoup.nodes.Node node21 = textNode17.attr("#text", "hi!");
        java.lang.String str22 = textNode17.nodeName();
        java.lang.String str24 = textNode17.absUrl("#text");
        textNode17.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) ' ');
        boolean boolean33 = outputSettings32.prettyPrint();
        boolean boolean34 = textNode17.equals((java.lang.Object) outputSettings32);
        java.nio.charset.Charset charset35 = outputSettings32.charset();
        boolean boolean36 = textNode2.equals((java.lang.Object) outputSettings32);
        java.lang.String str37 = textNode2.baseUri();
        org.jsoup.nodes.Node node38 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes39 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = textNode2.wrap("h");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        java.lang.String str30 = textNode6.text();
        boolean boolean32 = textNode6.hasAttr("hi!");
        org.jsoup.nodes.Node node34 = textNode6.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = node34.wrap("text");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean8 = textNode7.isBlank();
        org.jsoup.nodes.Node node11 = textNode7.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode7.text("#text");
        org.jsoup.nodes.TextNode textNode15 = textNode7.text("#text");
        org.jsoup.nodes.Node node16 = textNode7.clone();
        boolean boolean17 = textNode2.equals((java.lang.Object) textNode7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode7.wrap("hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str15 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        java.lang.String str17 = textNode2.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("text");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.attr("h", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("h");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str13 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node16 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("h");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str10 = textNode9.baseUri();
        boolean boolean12 = textNode9.hasAttr("#text");
        java.lang.String str14 = textNode9.attr("");
        org.jsoup.nodes.Node node15 = textNode9.parent();
        textNode9.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.siblingNodes();
        org.jsoup.nodes.Node node21 = textNode9.attr("i!", "hi!");
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        boolean boolean17 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.siblingNodes();
        java.lang.String str19 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.childNodes();
        org.jsoup.nodes.Node node22 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("h");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        java.lang.String str13 = textNode6.attr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (short) 1);
        org.jsoup.nodes.Node node16 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("i!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        org.jsoup.nodes.Node node32 = textNode6.attr("hi!", "i!");
        org.jsoup.nodes.TextNode textNode34 = textNode6.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = textNode6.wrap("hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode5);
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.baseUri();
        org.jsoup.nodes.TextNode textNode17 = textNode13.text("hi!");
        org.jsoup.nodes.Node node18 = textNode17.clone();
        org.jsoup.nodes.Node node20 = textNode17.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode17.siblingNodes();
        java.lang.String str23 = textNode17.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings28.escapeMode();
        int int31 = outputSettings28.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings28.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean35 = outputSettings34.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings33.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings24.escapeMode(escapeMode36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings24.escapeMode();
        boolean boolean40 = textNode17.equals((java.lang.Object) escapeMode39);
        boolean boolean41 = textNode2.equals((java.lang.Object) textNode17);
        java.lang.String str42 = textNode17.toString();
        java.lang.String str43 = textNode17.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node45 = textNode17.wrap("hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("text");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("#text");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean12 = textNode10.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode10.attributes();
        java.lang.String str14 = textNode10.toString();
        boolean boolean16 = textNode10.equals((java.lang.Object) 97);
        boolean boolean17 = textNode2.equals((java.lang.Object) boolean16);
        org.jsoup.nodes.Node node18 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.String str20 = textNode2.nodeName();
        org.jsoup.nodes.Node node23 = textNode2.attr("i!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node23.wrap("#text");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("#text");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str8 = textNode7.toString();
        boolean boolean9 = textNode2.equals((java.lang.Object) str8);
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean13 = textNode12.isBlank();
        org.jsoup.nodes.Node node16 = textNode12.attr("hi!", "hi!");
        boolean boolean18 = textNode12.equals((java.lang.Object) true);
        textNode12.setBaseUri("");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str24 = textNode23.getWholeText();
        java.lang.String str25 = textNode23.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode23.siblingNodes();
        int int27 = textNode23.siblingIndex();
        boolean boolean28 = textNode12.equals((java.lang.Object) textNode23);
        boolean boolean29 = textNode12.isBlank();
        boolean boolean30 = textNode2.equals((java.lang.Object) boolean29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = textNode2.wrap("hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean6 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#text");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        java.lang.String str6 = textNode4.outerHtml();
        boolean boolean7 = textNode4.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode4.text("");
        textNode9.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode9.wrap("#text");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.nodeName();
        java.lang.String str16 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("text");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        org.jsoup.nodes.Node node13 = textNode8.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode8.wrap("i!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        boolean boolean11 = textNode9.hasAttr("i!");
        org.jsoup.nodes.Node node14 = textNode9.attr("h", "");
        java.lang.String str15 = textNode9.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode9.wrap("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.nodeName();
        textNode2.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("i!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.absUrl("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str8 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode8.getWholeText();
        boolean boolean10 = textNode8.isBlank();
        org.jsoup.nodes.TextNode textNode12 = textNode8.text("#text");
        java.lang.String str14 = textNode12.attr("#text");
        java.lang.String str15 = textNode12.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode12.wrap("hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        org.jsoup.nodes.Node node13 = textNode6.attr("#text", "hi!");
        boolean boolean15 = textNode6.hasAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode6.wrap("i!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.wrap("i!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode5);
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.nodeName();
        int int6 = textNode2.siblingIndex();
        boolean boolean7 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        java.lang.String str16 = textNode15.baseUri();
        java.lang.String str18 = textNode15.attr("");
        int int19 = textNode15.siblingIndex();
        org.jsoup.nodes.Node node20 = textNode15.clone();
        java.lang.String str21 = textNode15.toString();
        org.jsoup.nodes.Node node22 = textNode15.clone();
        textNode15.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode15.wrap("i!");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str5 = textNode2.outerHtml();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.baseUri();
        boolean boolean9 = textNode2.hasAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "text");
        java.lang.String str13 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean18 = textNode17.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        boolean boolean21 = textNode17.equals((java.lang.Object) boolean20);
        java.lang.String str22 = textNode17.outerHtml();
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode27 = textNode25.text("");
        org.jsoup.nodes.TextNode textNode29 = textNode27.text("#text");
        textNode27.setBaseUri("#text");
        textNode27.setBaseUri("hi!");
        boolean boolean34 = textNode17.equals((java.lang.Object) textNode27);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode27.siblingNodes();
        boolean boolean36 = textNode2.equals((java.lang.Object) nodeList35);
        java.lang.String str37 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = textNode2.wrap("hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean8 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        java.lang.String str6 = node5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node5.wrap("#text");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.getWholeText();
        boolean boolean11 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        boolean boolean18 = outputSettings17.prettyPrint();
        boolean boolean19 = textNode2.equals((java.lang.Object) outputSettings17);
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
        org.jsoup.nodes.Node node24 = textNode2.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("#text");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("");
        org.jsoup.nodes.Node node10 = textNode7.previousSibling();
        org.jsoup.nodes.Node node11 = textNode7.parent();
        org.jsoup.nodes.Attributes attributes12 = textNode7.attributes();
        org.jsoup.nodes.Node node13 = textNode7.clone();
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode7);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node15.wrap("text");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        java.lang.String str6 = textNode4.outerHtml();
        boolean boolean7 = textNode4.isBlank();
        java.lang.String str8 = textNode4.nodeName();
        java.lang.String str9 = textNode4.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode4.wrap("hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode10.getWholeText();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Node node15 = textNode10.attr("h", "#text");
        org.jsoup.nodes.Node node17 = textNode10.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.wrap("hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("#text");
        java.lang.String str10 = textNode7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode7.siblingNodes();
        java.lang.String str12 = textNode7.nodeName();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str18 = textNode17.getWholeText();
        java.lang.String str19 = textNode17.baseUri();
        org.jsoup.nodes.TextNode textNode21 = textNode17.text("hi!");
        org.jsoup.nodes.Node node22 = textNode21.clone();
        org.jsoup.nodes.Node node24 = textNode21.removeAttr("hi!");
        java.lang.String str25 = textNode21.toString();
        java.lang.String str27 = textNode21.attr("#text");
        boolean boolean28 = textNode2.equals((java.lang.Object) textNode21);
        java.lang.String str29 = textNode21.text();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode21.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode21.wrap("#");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        boolean boolean11 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#text");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode4.wrap("h");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str8 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node16 = textNode15.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode15.childNodes();
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode15.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode15.wrap("#text");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.text();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("text");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        boolean boolean15 = textNode11.equals((java.lang.Object) boolean14);
        textNode11.setBaseUri("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode11);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("text");
        org.jsoup.nodes.TextNode textNode25 = textNode2.splitText(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("#");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        int int11 = outputSettings8.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings8.prettyPrint(false);
        boolean boolean14 = textNode6.equals((java.lang.Object) false);
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("#");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode6.wrap("#text");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        boolean boolean12 = textNode2.hasAttr("i!");
        java.lang.String str14 = textNode2.absUrl("#text");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        org.jsoup.nodes.Node node6 = textNode4.parent();
        java.lang.String str7 = textNode4.nodeName();
        java.lang.String str8 = textNode4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode4.wrap("#");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        java.lang.String str10 = textNode6.attr("");
        textNode6.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        boolean boolean15 = textNode6.hasAttr("");
        java.lang.String str16 = textNode6.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("#text");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode10.wrap("hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str15 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        org.jsoup.nodes.Node node6 = textNode4.parent();
        java.lang.String str7 = textNode4.nodeName();
        java.lang.String str8 = textNode4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode4.wrap("#");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = node8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#text");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("h");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        org.jsoup.nodes.Node node6 = node5.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node5.wrap("text");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        java.lang.String str14 = textNode13.toString();
        boolean boolean16 = textNode13.hasAttr("#text");
        textNode13.setBaseUri("h");
        org.jsoup.nodes.Node node20 = textNode13.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node20.wrap("#text");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str6 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("text");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#text");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("text");
        boolean boolean8 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.nextSibling();
        org.jsoup.nodes.TextNode textNode15 = textNode10.text("#text");
        org.jsoup.nodes.TextNode textNode17 = textNode10.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode17.wrap("#text");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.attr("hi!", "hi!");
        int int15 = textNode2.siblingIndex();
        java.lang.String str17 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode7 = textNode5.text("");
        java.lang.String str8 = textNode5.outerHtml();
        org.jsoup.nodes.Document document9 = textNode5.ownerDocument();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode5);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode5.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode5.wrap("#text");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.getWholeText();
        java.lang.String str17 = textNode15.baseUri();
        org.jsoup.nodes.TextNode textNode19 = textNode15.text("hi!");
        org.jsoup.nodes.Node node20 = textNode19.clone();
        org.jsoup.nodes.Node node22 = textNode19.removeAttr("hi!");
        org.jsoup.nodes.Node node23 = textNode19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings24.escapeMode();
        boolean boolean27 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings24.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean33 = outputSettings32.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean37 = outputSettings36.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = outputSettings36.escapeMode();
        int int39 = outputSettings36.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings36.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean43 = outputSettings42.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings41.escapeMode(escapeMode44);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings32.escapeMode(escapeMode44);
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings32.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings32.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset52 = outputSettings51.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings29.charset(charset52);
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings53.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings55.forceAllElementAsBlock(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = outputSettings57.escapeMode();
        boolean boolean59 = textNode19.equals((java.lang.Object) outputSettings57);
        boolean boolean60 = textNode2.equals((java.lang.Object) textNode19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node62 = textNode2.wrap("h");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode4.text();
        boolean boolean7 = textNode4.hasAttr("i!");
        org.jsoup.nodes.Node node8 = textNode4.previousSibling();
        java.lang.String str10 = textNode4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode4.childNodes();
        org.jsoup.nodes.Node node13 = textNode4.removeAttr("#text");
        org.jsoup.nodes.Node node16 = textNode4.attr("text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode4.wrap("hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str9 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        int int16 = node14.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node14.wrap("i!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.baseUri();
        java.lang.String str12 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode5.isBlank();
        java.lang.String str8 = textNode5.toString();
        org.jsoup.nodes.Node node9 = textNode5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode5.wrap("h");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode15.childNodes();
        org.jsoup.nodes.Node node19 = textNode15.removeAttr("hi!");
        boolean boolean20 = textNode10.equals((java.lang.Object) textNode15);
        java.lang.String str21 = textNode15.baseUri();
        org.jsoup.nodes.TextNode textNode23 = textNode15.text("i!");
        java.lang.String str24 = textNode23.baseUri();
        java.lang.String str25 = textNode23.toString();
        org.jsoup.nodes.TextNode textNode27 = textNode23.text("");
        org.jsoup.nodes.TextNode textNode29 = textNode27.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode27.wrap("h");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        boolean boolean12 = textNode2.hasAttr("");
        java.lang.String str14 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        boolean boolean12 = textNode4.hasAttr("#text");
        org.jsoup.nodes.Attributes attributes13 = textNode4.attributes();
        java.lang.String str14 = textNode4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode4.wrap("#text");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node13.wrap("i!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        boolean boolean9 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodes();
        java.lang.String str13 = textNode10.baseUri();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode10.wrap("text");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        int int12 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(1);
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = textNode8.attributes();
        org.jsoup.nodes.Attributes attributes11 = textNode8.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("text");
        java.lang.String str15 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodes();
        java.lang.String str13 = textNode10.baseUri();
        org.jsoup.nodes.Document document14 = textNode10.ownerDocument();
        java.lang.String str15 = textNode10.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode10.wrap("hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str16 = textNode2.baseUri();
        java.lang.String str18 = textNode2.attr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("i!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        int int7 = textNode2.siblingIndex();
        java.lang.String str9 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("#text");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("h");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        java.lang.String str10 = textNode4.text();
        org.jsoup.nodes.Node node11 = textNode4.clone();
        org.jsoup.nodes.Node node12 = textNode4.parent();
        boolean boolean14 = textNode4.hasAttr("i!");
        java.lang.String str15 = textNode4.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode4.wrap("#");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        textNode2.setBaseUri("i!");
        boolean boolean8 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        boolean boolean13 = textNode2.isBlank();
        textNode2.setBaseUri("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#text");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode8.nextSibling();
        textNode8.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode8.wrap("#text");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean14 = textNode13.isBlank();
        org.jsoup.nodes.Node node17 = textNode13.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("#text");
        org.jsoup.nodes.Node node21 = textNode19.removeAttr("#text");
        java.lang.String str22 = textNode19.nodeName();
        boolean boolean23 = textNode19.isBlank();
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode19);
        java.lang.String str25 = textNode19.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode19.wrap("text");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.toString();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.nodeName();
        org.jsoup.nodes.TextNode textNode12 = textNode6.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode6.wrap("h");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.attr("hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("h");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node7 = node6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("i!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode19.wrap("#");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        java.lang.String str9 = textNode8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = textNode8.attributes();
        java.lang.String str11 = textNode8.toString();
        boolean boolean13 = textNode8.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode8.wrap("i!");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean11 = textNode2.hasAttr("#text");
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        textNode15.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode15.wrap("h");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "#text");
        org.jsoup.nodes.Attributes attributes3 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str6 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("h");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("#");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("text");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode8.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode8.wrap("hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        java.lang.String str9 = node8.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("#");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = node7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("i!");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node16 = textNode15.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = textNode15.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode15.wrap("hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node11 = textNode2.attr("i!", "");
        boolean boolean12 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode7.wrap("hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        boolean boolean14 = textNode2.isBlank();
        java.lang.String str16 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        int int18 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("text");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node14 = textNode2.clone();
        java.lang.String str15 = node14.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node14.wrap("h");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.outerHtml();
        boolean boolean8 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        java.lang.String str3 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("text");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.lang.String str17 = textNode2.text();
        boolean boolean19 = textNode2.hasAttr("text");
        java.lang.String str21 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("h");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.lang.String str11 = textNode8.nodeName();
        boolean boolean12 = textNode8.isBlank();
        org.jsoup.nodes.Node node13 = textNode8.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode8.wrap("i!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean9 = textNode8.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings10.escapeMode();
        int int13 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.prettyPrint(false);
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        boolean boolean17 = textNode8.equals((java.lang.Object) outputSettings15);
        boolean boolean18 = textNode2.equals((java.lang.Object) boolean17);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("hi!");
        java.lang.String str24 = textNode2.attr("i!");
        java.lang.String str25 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("i!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        int int14 = textNode13.siblingIndex();
        java.lang.String str15 = textNode13.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode13.wrap("#");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        boolean boolean16 = textNode6.isBlank();
        org.jsoup.nodes.Node node19 = textNode6.attr("#text", "#text");
        org.jsoup.nodes.Document document20 = node19.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node19.wrap("i!");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.toString();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("h");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.attr("hi!", "");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("i!");
        java.lang.String str16 = textNode15.baseUri();
        boolean boolean18 = textNode15.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode15.wrap("#text");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node5 = textNode2.removeAttr("i!");
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document18 = textNode17.ownerDocument();
        org.jsoup.nodes.Node node21 = textNode17.attr("#text", "hi!");
        java.lang.String str22 = textNode17.nodeName();
        java.lang.String str24 = textNode17.absUrl("#text");
        textNode17.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.indentAmount((int) ' ');
        boolean boolean33 = outputSettings32.prettyPrint();
        boolean boolean34 = textNode17.equals((java.lang.Object) outputSettings32);
        java.nio.charset.Charset charset35 = outputSettings32.charset();
        boolean boolean36 = textNode2.equals((java.lang.Object) outputSettings32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = textNode2.wrap("h");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node14.wrap("i!");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("");
        java.lang.String str6 = textNode2.getWholeText();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str7 = node6.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node6.wrap("text");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode12 = textNode6.splitText(0);
        org.jsoup.nodes.Document document13 = textNode6.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("i!");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.baseUri();
        boolean boolean12 = textNode2.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        textNode13.setBaseUri("#text");
        java.lang.String str21 = textNode13.outerHtml();
        java.lang.String str22 = textNode13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode13.childNodes();
        java.lang.String str24 = textNode13.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode13.wrap("text");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.attr("h");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#text");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.jsoup.nodes.Node node9 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node6.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node6.wrap("#");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.String str9 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "i!");
        int int10 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node9 = textNode2.parent();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        boolean boolean12 = textNode2.isBlank();
        boolean boolean14 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode10.getWholeText();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        boolean boolean14 = textNode10.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode10.wrap("i!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodes();
        java.lang.String str12 = textNode10.getWholeText();
        boolean boolean13 = textNode2.equals((java.lang.Object) textNode10);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode10.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode10.wrap("hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean16 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = textNode13.removeAttr("hi!");
        boolean boolean19 = textNode2.equals((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode2.siblingNodes();
        boolean boolean21 = textNode2.isBlank();
        java.lang.String str22 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("h");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.text();
        textNode2.setBaseUri("i!");
        java.lang.String str14 = textNode2.outerHtml();
        boolean boolean16 = textNode2.hasAttr("hi!");
        java.lang.String str17 = textNode2.nodeName();
        java.lang.String str18 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("text");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("");
        java.lang.String str9 = textNode2.getWholeText();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        boolean boolean15 = textNode6.equals((java.lang.Object) 10.0d);
        int int16 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node17 = textNode6.previousSibling();
        java.lang.String str18 = textNode6.outerHtml();
        java.lang.String str19 = textNode6.toString();
        java.lang.String str20 = textNode6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("h");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.Node node14 = textNode10.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes15 = textNode10.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode10.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode10.wrap("#");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.baseUri();
        org.jsoup.nodes.Node node13 = textNode6.attr("#text", "i!");
        org.jsoup.nodes.Document document14 = textNode6.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode6.removeAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("h");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("hi!");
        java.lang.String str9 = textNode7.attr("#text");
        java.lang.String str10 = textNode7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode7.wrap("hi!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        java.lang.String str4 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = textNode2.wrap("h");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.outerHtml();
        boolean boolean8 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Node node13 = textNode2.attr("i!", "");
        java.lang.String str15 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        node9.setBaseUri("hi!");
        node9.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node9.wrap("#");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        boolean boolean11 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        org.jsoup.nodes.Node node11 = textNode4.removeAttr("hi!");
        java.lang.String str12 = textNode4.baseUri();
        org.jsoup.nodes.TextNode textNode14 = textNode4.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode14.wrap("text");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        java.lang.String str15 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        java.lang.String str18 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.String str20 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode2.wrap("hi!");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.childNodes();
        org.jsoup.nodes.Node node12 = textNode6.parent();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.toString();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        org.jsoup.nodes.TextNode textNode20 = textNode15.text("");
        org.jsoup.nodes.Document document21 = textNode20.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode20.siblingNodes();
        java.lang.String str23 = textNode20.text();
        boolean boolean24 = textNode6.equals((java.lang.Object) textNode20);
        java.lang.String str25 = textNode6.outerHtml();
        java.lang.String str27 = textNode6.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode6.wrap("#text");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.nodeName();
        java.lang.String str12 = textNode9.absUrl("i!");
        org.jsoup.nodes.Node node15 = textNode9.attr("i!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        int int14 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        boolean boolean16 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("#text");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode5.isBlank();
        java.lang.String str8 = textNode5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode5.wrap("hi!");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str6 = textNode4.attr("#text");
        org.jsoup.nodes.Node node7 = textNode4.clone();
        org.jsoup.nodes.Document document8 = textNode4.ownerDocument();
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("");
        java.lang.String str11 = textNode10.toString();
        org.jsoup.nodes.Node node13 = textNode10.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("hi!");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        boolean boolean10 = textNode6.isBlank();
        org.jsoup.nodes.Node node13 = textNode6.attr("hi!", "");
        boolean boolean15 = textNode6.equals((java.lang.Object) 10.0d);
        int int16 = textNode6.siblingIndex();
        org.jsoup.nodes.Node node17 = textNode6.previousSibling();
        java.lang.String str18 = textNode6.outerHtml();
        java.lang.String str19 = textNode6.toString();
        java.lang.String str20 = textNode6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("i!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        java.lang.String str30 = textNode6.text();
        boolean boolean32 = textNode6.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes33 = textNode6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode6.siblingNodes();
        org.jsoup.nodes.Node node37 = textNode6.attr("#text", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = textNode6.wrap("text");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        java.lang.String str6 = textNode4.outerHtml();
        boolean boolean7 = textNode4.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode4.text("");
        java.lang.String str10 = textNode4.outerHtml();
        org.jsoup.nodes.Node node12 = textNode4.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("i!");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        boolean boolean3 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("hi!");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        boolean boolean15 = textNode11.equals((java.lang.Object) boolean14);
        textNode11.setBaseUri("");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode11);
        java.lang.String str19 = textNode11.baseUri();
        org.jsoup.nodes.Node node21 = textNode11.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode11.childNodes();
        org.jsoup.nodes.Node node23 = textNode11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode11.wrap("hi!");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.attr("#text");
        boolean boolean12 = textNode2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node16 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.getWholeText();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings11.escapeMode();
        boolean boolean14 = outputSettings11.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings15.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings11.prettyPrint(false);
        boolean boolean21 = outputSettings20.forceAllElementAsBlock();
        boolean boolean22 = textNode6.equals((java.lang.Object) outputSettings20);
        java.lang.String str23 = textNode6.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        int int25 = outputSettings24.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings24.forceAllElementAsBlock(true);
        boolean boolean28 = outputSettings24.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings24.indentAmount((int) (byte) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings30.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean34 = outputSettings33.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean38 = outputSettings37.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings37.escapeMode();
        int int40 = outputSettings37.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings37.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean44 = outputSettings43.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings42.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings33.escapeMode(escapeMode45);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings33.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings33.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings33.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset53 = outputSettings52.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = outputSettings52.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = new org.jsoup.nodes.Document.OutputSettings();
        int int56 = outputSettings55.indentAmount();
        java.nio.charset.Charset charset57 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings52.charset(charset57);
        java.nio.charset.Charset charset59 = outputSettings58.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings30.charset(charset59);
        boolean boolean61 = textNode6.equals((java.lang.Object) outputSettings60);
        java.lang.String str62 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode64 = textNode6.splitText((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node66 = textNode6.wrap("text");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        org.jsoup.nodes.Node node11 = textNode4.removeAttr("hi!");
        java.lang.String str12 = textNode4.baseUri();
        java.lang.String str14 = textNode4.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode4.wrap("hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("i!");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        java.lang.String str13 = textNode2.text();
        java.lang.String str14 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node6.wrap("text");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        java.lang.String str10 = textNode4.text();
        java.lang.String str11 = textNode4.toString();
        java.lang.String str12 = textNode4.getWholeText();
        java.lang.String str13 = textNode4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode4.wrap("text");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "text");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node5.wrap("#");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        int int13 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("i!");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        boolean boolean5 = textNode2.isBlank();
        int int6 = textNode2.siblingIndex();
        int int7 = textNode2.siblingIndex();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node16 = textNode6.previousSibling();
        java.lang.String str18 = textNode6.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode6.wrap("i!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        boolean boolean12 = textNode10.hasAttr("");
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str16 = textNode15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode15.childNodes();
        org.jsoup.nodes.Node node19 = textNode15.removeAttr("hi!");
        boolean boolean20 = textNode10.equals((java.lang.Object) textNode15);
        boolean boolean22 = textNode10.hasAttr("i!");
        java.lang.String str24 = textNode10.attr("i!");
        java.lang.String str25 = textNode10.baseUri();
        org.jsoup.nodes.Node node28 = textNode10.attr("#text", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = textNode10.wrap("h");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        java.lang.String str10 = textNode4.text();
        org.jsoup.nodes.Node node11 = textNode4.clone();
        org.jsoup.nodes.Node node12 = textNode4.parent();
        java.lang.String str14 = textNode4.attr("#text");
        org.jsoup.nodes.Document document15 = textNode4.ownerDocument();
        org.jsoup.nodes.Node node16 = textNode4.nextSibling();
        org.jsoup.nodes.Node node18 = textNode4.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode4.wrap("h");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "");
        java.lang.String str3 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("text");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        java.lang.String str14 = textNode2.getWholeText();
        java.lang.String str15 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("text");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        java.lang.String str13 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        java.lang.String str7 = textNode4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode4.siblingNodes();
        java.lang.String str9 = textNode4.nodeName();
        java.lang.String str10 = textNode4.text();
        java.lang.String str11 = textNode4.toString();
        org.jsoup.nodes.Node node12 = textNode4.parent();
        org.jsoup.nodes.Node node13 = textNode4.clone();
        boolean boolean14 = textNode4.isBlank();
        boolean boolean16 = textNode4.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode4.wrap("h");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node13.wrap("#text");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.attr("i!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("i!");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode8.wrap("#");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        java.lang.String str7 = textNode6.nodeName();
        boolean boolean9 = textNode6.hasAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("i!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        textNode13.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode23);
        java.lang.String str25 = textNode23.outerHtml();
        java.lang.String str26 = textNode23.getWholeText();
        org.jsoup.nodes.Node node27 = textNode23.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = textNode23.wrap("text");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("#text");
        textNode12.setBaseUri("#text");
        textNode12.setBaseUri("hi!");
        boolean boolean19 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str20 = textNode2.text();
        org.jsoup.nodes.Attributes attributes21 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("text");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean8 = textNode2.isBlank();
        boolean boolean9 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("text");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean18 = outputSettings17.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings17.escapeMode();
        int int20 = outputSettings17.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings17.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean24 = outputSettings23.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings22.escapeMode(escapeMode25);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings13.escapeMode(escapeMode25);
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings13.escapeMode();
        boolean boolean29 = textNode6.equals((java.lang.Object) escapeMode28);
        org.jsoup.nodes.Node node32 = textNode6.attr("i!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = node32.wrap("h");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str12 = textNode2.text();
        java.lang.String str14 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        org.jsoup.nodes.Node node19 = textNode2.attr("i!", "");
        org.jsoup.nodes.Document document20 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("text");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str13 = textNode2.attr("hi!");
        java.lang.String str15 = textNode2.absUrl("hi!");
        java.lang.String str16 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("text");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.text();
        java.lang.String str8 = textNode2.attr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node18 = textNode2.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("h");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str9 = textNode2.attr("i!");
        textNode2.setBaseUri("hi!");
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("");
        java.lang.String str12 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        java.lang.String str11 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean15 = textNode14.isBlank();
        org.jsoup.nodes.Node node18 = textNode14.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode20 = textNode14.text("#text");
        org.jsoup.nodes.Node node21 = textNode14.parent();
        boolean boolean22 = textNode14.isBlank();
        org.jsoup.nodes.Node node25 = textNode14.attr("#text", "i!");
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode14);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode2.siblingNodes();
        java.lang.String str29 = textNode2.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node31 = textNode2.wrap("hi!");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) ' ');
        boolean boolean18 = outputSettings17.prettyPrint();
        boolean boolean19 = textNode2.equals((java.lang.Object) outputSettings17);
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
        java.lang.String str23 = textNode2.getWholeText();
        java.lang.String str25 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = textNode2.wrap("h");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode15.wrap("#");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        java.lang.String str13 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.attr("hi!");
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode2.attr("#text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("i!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        org.jsoup.nodes.Node node8 = node7.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("#text");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str8 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Node node15 = textNode11.attr("hi!", "hi!");
        boolean boolean17 = textNode11.equals((java.lang.Object) true);
        textNode11.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode11.siblingNodes();
        org.jsoup.nodes.Node node21 = textNode11.nextSibling();
        java.lang.String str22 = textNode11.text();
        java.lang.String str23 = textNode11.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode11.siblingNodes();
        org.jsoup.nodes.Document document25 = textNode11.ownerDocument();
        boolean boolean26 = textNode11.isBlank();
        java.lang.String str27 = textNode11.outerHtml();
        org.jsoup.nodes.Node node28 = textNode11.previousSibling();
        java.lang.String str29 = textNode11.getWholeText();
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode11.wrap("#");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.toString();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("h");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.text();
        java.lang.String str7 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode6.wrap("i!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.wrap("#text");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean10 = textNode9.isBlank();
        org.jsoup.nodes.Node node11 = textNode9.previousSibling();
        java.lang.String str12 = textNode9.getWholeText();
        java.lang.String str13 = textNode9.baseUri();
        java.lang.String str14 = textNode9.baseUri();
        java.lang.String str15 = textNode9.toString();
        boolean boolean16 = textNode2.equals((java.lang.Object) textNode9);
        java.lang.String str17 = textNode9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode9.wrap("hi!");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("#");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        java.lang.String str4 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Node node7 = textNode6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("#");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("h");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode10.getWholeText();
        boolean boolean12 = textNode10.isBlank();
        org.jsoup.nodes.TextNode textNode14 = textNode10.text("hi!");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean18 = textNode17.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        boolean boolean21 = textNode17.equals((java.lang.Object) boolean20);
        java.lang.String str22 = textNode17.outerHtml();
        textNode17.setBaseUri("#text");
        textNode17.setBaseUri("i!");
        org.jsoup.nodes.Node node29 = textNode17.attr("#text", "#text");
        boolean boolean30 = textNode14.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.Node node31 = textNode17.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = textNode17.wrap("text");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.absUrl("hi!");
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        boolean boolean13 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 0);
        java.lang.String str13 = textNode12.toString();
        org.jsoup.nodes.TextNode textNode15 = textNode12.text("text");
        boolean boolean17 = textNode12.hasAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode12.wrap("hi!");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        int int10 = outputSettings9.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.forceAllElementAsBlock(true);
        boolean boolean13 = outputSettings9.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings14.escapeMode();
        int int17 = outputSettings14.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings14.prettyPrint(false);
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings9.charset(charset20);
        boolean boolean22 = textNode2.equals((java.lang.Object) outputSettings9);
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node27 = textNode2.attr("i!", "i!");
        boolean boolean29 = textNode2.hasAttr("hi!");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node34 = textNode2.attr("text", "text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = textNode2.wrap("hi!");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        boolean boolean8 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("#text");
        java.lang.String str11 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        java.lang.String str11 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.attr("#text", "hi!");
        int int8 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("#text");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        int int10 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node6 = textNode2.attr("#text", "hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        boolean boolean10 = textNode2.hasAttr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.outerHtml();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("hi!");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.absUrl("i!");
        boolean boolean13 = textNode2.hasAttr("h");
        java.lang.String str14 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("#text");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node9 = textNode2.attr("#text", "h");
        boolean boolean11 = node9.equals((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("text");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings12.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings16.escapeMode();
        int int19 = outputSettings16.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings16.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.escapeMode(escapeMode24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings12.escapeMode(escapeMode24);
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings12.clone();
        boolean boolean29 = outputSettings28.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings28.forceAllElementAsBlock(false);
        java.nio.charset.Charset charset32 = outputSettings28.charset();
        boolean boolean33 = textNode2.equals((java.lang.Object) outputSettings28);
        java.lang.String str35 = textNode2.absUrl("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = textNode2.wrap("hi!");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = textNode2.wrap("i!");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        java.lang.String str9 = textNode6.nodeName();
        org.jsoup.nodes.Node node10 = textNode6.clone();
        org.jsoup.nodes.Node node12 = textNode6.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node12.wrap("i!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.absUrl("i!");
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        java.lang.String str10 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        int int5 = textNode2.siblingIndex();
        boolean boolean7 = textNode2.equals((java.lang.Object) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("hi!");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        textNode12.setBaseUri("");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        org.jsoup.nodes.TextNode textNode17 = textNode12.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode17.wrap("i!");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        java.lang.String str13 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.wrap("i!");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str12 = textNode11.nodeName();
        java.lang.String str13 = textNode11.toString();
        boolean boolean14 = textNode11.isBlank();
        org.jsoup.nodes.Node node15 = textNode11.parent();
        org.jsoup.nodes.Node node17 = textNode11.removeAttr("hi!");
        org.jsoup.nodes.Document document18 = textNode11.ownerDocument();
        org.jsoup.nodes.Document document19 = textNode11.ownerDocument();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode11);
        org.jsoup.nodes.Node node21 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode2.wrap("#");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.text();
        boolean boolean7 = textNode2.isBlank();
        java.lang.String str8 = textNode2.baseUri();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        boolean boolean14 = textNode2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str13 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#text");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str11 = textNode2.outerHtml();
        boolean boolean13 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        java.lang.String str16 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode2.splitText(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode18.wrap("#text");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.text();
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("h");
        org.jsoup.nodes.Node node16 = textNode15.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode15.wrap("#");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean10 = textNode9.isBlank();
        org.jsoup.nodes.Node node13 = textNode9.attr("hi!", "hi!");
        boolean boolean15 = textNode9.equals((java.lang.Object) true);
        textNode9.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode9.siblingNodes();
        boolean boolean19 = textNode9.isBlank();
        org.jsoup.nodes.Node node20 = textNode9.clone();
        int int21 = textNode9.siblingIndex();
        boolean boolean22 = textNode2.equals((java.lang.Object) int21);
        org.jsoup.nodes.Node node25 = textNode2.attr("#text", "");
        org.jsoup.nodes.Node node26 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = node26.wrap("#");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.wrap("#text");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        textNode13.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode23);
        org.jsoup.nodes.Node node25 = textNode23.previousSibling();
        org.jsoup.nodes.TextNode textNode27 = textNode23.text("hi!");
        java.lang.String str29 = textNode27.absUrl("i!");
        java.lang.String str30 = textNode27.text();
        java.lang.String str31 = textNode27.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = textNode27.wrap("hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean12 = outputSettings11.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings11.prettyPrint(true);
        java.nio.charset.Charset charset15 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings11.forceAllElementAsBlock(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.indentAmount((int) ' ');
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings19.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings19.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings19.indentAmount((int) 'a');
        org.jsoup.nodes.TextNode textNode28 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode31 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str32 = textNode31.baseUri();
        boolean boolean34 = textNode31.hasAttr("#text");
        java.lang.String str35 = textNode31.text();
        boolean boolean36 = textNode28.equals((java.lang.Object) str35);
        org.jsoup.nodes.Document document37 = textNode28.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean39 = outputSettings38.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean43 = outputSettings42.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings42.escapeMode();
        int int45 = outputSettings42.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings42.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean49 = outputSettings48.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings47.escapeMode(escapeMode50);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings38.escapeMode(escapeMode50);
        boolean boolean53 = textNode28.equals((java.lang.Object) outputSettings38);
        java.nio.charset.Charset charset54 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings25.charset(charset54);
        boolean boolean56 = textNode4.equals((java.lang.Object) outputSettings25);
        org.jsoup.nodes.Attributes attributes57 = textNode4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node59 = textNode4.wrap("hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode8.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode8.siblingNodes();
        java.lang.String str12 = textNode8.outerHtml();
        boolean boolean14 = textNode8.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes15 = textNode8.attributes();
        int int16 = textNode8.siblingIndex();
        org.jsoup.nodes.Node node18 = textNode8.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode8.wrap("h");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.baseUri();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "hi!");
        java.lang.String str12 = textNode2.getWholeText();
        boolean boolean13 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("#");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        java.lang.String str4 = textNode2.text();
        java.lang.String str6 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("hi!");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str6 = textNode2.toString();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        boolean boolean8 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.toString();
        boolean boolean10 = textNode6.hasAttr("hi!");
        boolean boolean11 = textNode6.isBlank();
        org.jsoup.nodes.Node node12 = textNode6.previousSibling();
        org.jsoup.nodes.TextNode textNode14 = textNode6.text("#");
        java.lang.String str16 = textNode6.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("i!");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("#text");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str9 = textNode2.outerHtml();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        java.lang.String str13 = textNode2.nodeName();
        int int14 = textNode2.siblingIndex();
        java.lang.String str16 = textNode2.absUrl("i!");
        java.lang.String str17 = textNode2.text();
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode21 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode21.wrap("hi!");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.Node node9 = textNode7.removeAttr("hi!");
        java.lang.String str10 = textNode7.getWholeText();
        org.jsoup.nodes.Node node11 = textNode7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("#text");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        int int7 = textNode2.siblingIndex();
        boolean boolean9 = textNode2.hasAttr("");
        java.lang.String str10 = textNode2.text();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean14 = textNode13.isBlank();
        org.jsoup.nodes.Node node17 = textNode13.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode13.text("#text");
        org.jsoup.nodes.Node node21 = textNode19.removeAttr("#text");
        java.lang.String str22 = textNode19.nodeName();
        boolean boolean23 = textNode19.isBlank();
        boolean boolean24 = textNode2.equals((java.lang.Object) textNode19);
        java.lang.String str25 = textNode19.baseUri();
        org.jsoup.nodes.Node node26 = textNode19.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode19.wrap("h");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("");
        java.lang.String str8 = textNode6.attr("h");
        org.jsoup.nodes.Node node9 = textNode6.clone();
        textNode6.setBaseUri("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode6.wrap("i!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str8 = textNode2.attr("hi!");
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.baseUri();
        textNode2.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("#text");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        boolean boolean8 = textNode2.equals((java.lang.Object) true);
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str14 = textNode13.getWholeText();
        java.lang.String str15 = textNode13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode13.siblingNodes();
        int int17 = textNode13.siblingIndex();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str19 = textNode2.outerHtml();
        java.lang.String str20 = textNode2.getWholeText();
        java.lang.String str22 = textNode2.absUrl("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("#");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "i!");
        boolean boolean10 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("text");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#text");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str5 = textNode2.attr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        boolean boolean8 = textNode2.hasAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("h");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.lang.String str10 = textNode2.text();
        int int11 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode18 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = textNode2.wrap("h");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        boolean boolean13 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.parent();
        java.lang.String str16 = textNode2.attr("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("text");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("");
        java.lang.String str10 = textNode9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode9.wrap("hi!");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("text");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("hi!");
        java.lang.String str11 = textNode6.attr("#text");
        java.lang.String str12 = textNode6.toString();
        org.jsoup.nodes.Node node13 = textNode6.previousSibling();
        java.lang.String str14 = textNode6.nodeName();
        java.lang.String str15 = textNode6.baseUri();
        java.lang.String str17 = textNode6.attr("i!");
        org.jsoup.nodes.Node node20 = textNode6.attr("h", "h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        java.lang.String str12 = textNode6.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode6.childNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node16 = textNode15.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode15.childNodes();
        textNode15.setBaseUri("hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode15.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = textNode15.wrap("#");
    }
}

