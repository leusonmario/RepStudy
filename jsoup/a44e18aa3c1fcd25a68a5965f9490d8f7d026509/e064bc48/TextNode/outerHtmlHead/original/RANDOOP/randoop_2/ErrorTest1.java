import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        java.lang.String str26 = textNode13.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode13.wrap("hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("h");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode4.clone();
        java.lang.String str7 = textNode4.absUrl("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode4.wrap("hi!");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        java.lang.String str22 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode2.wrap("text");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.jsoup.nodes.Node node16 = textNode2.wrap("hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        boolean boolean12 = textNode2.hasAttr("");
        java.lang.String str14 = textNode2.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("text");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        org.jsoup.nodes.Node node16 = node14.wrap("hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.jsoup.nodes.Node node21 = textNode10.nextSibling();
        java.lang.String str22 = textNode10.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = textNode10.wrap("hi!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        java.lang.String str21 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.siblingNodes();
        java.lang.String str23 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode2.wrap("i!");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        org.jsoup.nodes.Node node19 = textNode6.attr("i!", "");
        boolean boolean20 = textNode6.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = textNode6.wrap("text");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("hi!");
        java.lang.String str12 = textNode10.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.childNodes();
        org.jsoup.nodes.Node node14 = textNode10.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("h");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        java.lang.String str19 = textNode13.getWholeText();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str23 = textNode22.nodeName();
        org.jsoup.nodes.Node node24 = textNode22.nextSibling();
        org.jsoup.nodes.Attributes attributes25 = textNode22.attributes();
        java.lang.String str26 = textNode22.nodeName();
        boolean boolean27 = textNode13.equals((java.lang.Object) str26);
        textNode13.setBaseUri("hi!");
        org.jsoup.nodes.Node node31 = textNode13.removeAttr("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = node31.wrap("#");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        java.lang.String str9 = textNode2.absUrl("#text");
        java.lang.String str10 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("#");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        java.lang.String str15 = textNode2.toString();
        java.lang.String str17 = textNode2.attr("h");
        java.lang.String str18 = textNode2.toString();
        java.lang.String str19 = textNode2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("#text");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("i!");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "i!");
        java.lang.String str4 = textNode2.attr("");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("i!");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str7 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        boolean boolean10 = textNode9.isBlank();
        org.jsoup.nodes.Node node13 = textNode9.attr("h", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode9.wrap("text");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str6 = textNode4.attr("#text");
        org.jsoup.nodes.Node node7 = textNode4.clone();
        java.lang.String str8 = textNode4.nodeName();
        java.lang.String str9 = textNode4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode4.wrap("text");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.baseUri();
        boolean boolean7 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node8.wrap("h");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("i!");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("i!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(1);
        java.lang.String str13 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("h");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("#");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str14 = textNode13.baseUri();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node17 = textNode2.removeAttr("i!");
        java.lang.String str19 = textNode2.attr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode2.wrap("hi!");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.outerHtml();
        java.lang.String str5 = textNode2.toString();
        boolean boolean6 = textNode2.isBlank();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("text");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.absUrl("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode2.wrap("hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode6.siblingNodes();
        org.jsoup.nodes.TextNode textNode13 = textNode6.splitText((int) (short) 0);
        java.lang.String str14 = textNode6.toString();
        org.jsoup.nodes.TextNode textNode16 = textNode6.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode16.wrap("hi!");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("h");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        java.lang.String str30 = textNode27.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode27.wrap("hi!");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.getWholeText();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("i!");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("hi!");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean5 = outputSettings4.prettyPrint();
        boolean boolean6 = textNode2.equals((java.lang.Object) boolean5);
        java.lang.String str7 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str13 = textNode2.nodeName();
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("#");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.nextSibling();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("#text");
        textNode6.setBaseUri("");
        java.lang.String str13 = textNode6.absUrl("hi!");
        java.lang.String str15 = textNode6.absUrl("hi!");
        java.lang.String str16 = textNode6.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("h");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        org.jsoup.nodes.Node node17 = textNode15.clone();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str21 = textNode20.baseUri();
        org.jsoup.nodes.Attributes attributes22 = textNode20.attributes();
        boolean boolean23 = node17.equals((java.lang.Object) textNode20);
        java.lang.String str24 = textNode20.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = textNode20.wrap("i!");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        boolean boolean7 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode10.childNodes();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode10.siblingNodes();
        org.jsoup.nodes.Node node16 = textNode10.removeAttr("h");
        org.jsoup.nodes.Attributes attributes17 = textNode10.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode10.wrap("hi!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        textNode2.setBaseUri("#text");
        org.jsoup.nodes.Node node10 = textNode2.clone();
        java.lang.String str11 = textNode2.text();
        textNode2.setBaseUri("i!");
        java.lang.String str14 = textNode2.outerHtml();
        java.lang.String str16 = textNode2.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode2.wrap("i!");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.attr("hi!");
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean9 = outputSettings8.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = outputSettings8.escapeMode();
        boolean boolean11 = outputSettings8.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings8.prettyPrint(false);
        boolean boolean18 = outputSettings17.forceAllElementAsBlock();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings17.prettyPrint(true);
        boolean boolean21 = textNode2.equals((java.lang.Object) outputSettings20);
        org.jsoup.nodes.TextNode textNode23 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode2.wrap("#text");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("hi!");
        java.lang.String str7 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode2.wrap("i!");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.siblingNodes();
        org.jsoup.nodes.Node node22 = textNode12.removeAttr("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node22.wrap("h");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str7 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node16 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        java.lang.String str18 = textNode2.outerHtml();
        java.lang.String str19 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str23 = textNode22.baseUri();
        boolean boolean25 = textNode22.hasAttr("#text");
        java.lang.String str27 = textNode22.attr("");
        java.lang.String str28 = textNode22.nodeName();
        java.lang.String str29 = textNode22.outerHtml();
        org.jsoup.nodes.Node node30 = textNode22.nextSibling();
        org.jsoup.nodes.TextNode textNode32 = textNode22.text("hi!");
        java.lang.String str33 = textNode22.nodeName();
        org.jsoup.nodes.TextNode textNode36 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean37 = textNode36.isBlank();
        org.jsoup.nodes.Node node38 = textNode36.previousSibling();
        java.lang.String str40 = textNode36.absUrl("#text");
        org.jsoup.nodes.Node node43 = textNode36.attr("hi!", "i!");
        java.lang.String str44 = textNode36.nodeName();
        boolean boolean45 = textNode22.equals((java.lang.Object) textNode36);
        boolean boolean46 = textNode2.equals((java.lang.Object) textNode22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = textNode2.wrap("hi!");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("hi!");
        org.jsoup.nodes.Node node11 = textNode7.removeAttr("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = textNode7.wrap("i!");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode5 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str6 = textNode5.baseUri();
        boolean boolean8 = textNode5.hasAttr("#text");
        java.lang.String str9 = textNode5.text();
        boolean boolean10 = textNode2.equals((java.lang.Object) str9);
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        boolean boolean14 = textNode2.hasAttr("text");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("#");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str14 = textNode12.absUrl("i!");
        org.jsoup.nodes.Node node15 = textNode12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode12.wrap("hi!");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.absUrl("#text");
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.outerHtml();
        boolean boolean9 = textNode2.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        int int9 = textNode2.siblingIndex();
        java.lang.String str10 = textNode2.text();
        java.lang.String str12 = textNode2.attr("");
        textNode2.setBaseUri("hi!");
        java.lang.String str15 = textNode2.text();
        boolean boolean16 = textNode2.isBlank();
        org.jsoup.nodes.Node node19 = textNode2.attr("#", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("i!");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node7 = textNode2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode2.wrap("text");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = textNode2.attr("i!", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("text");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
        java.lang.String str23 = textNode22.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = textNode22.wrap("h");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean12 = textNode11.isBlank();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        boolean boolean15 = textNode11.equals((java.lang.Object) boolean14);
        java.lang.String str16 = textNode11.outerHtml();
        int int17 = textNode11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode11.childNodes();
        org.jsoup.nodes.Node node19 = textNode11.previousSibling();
        org.jsoup.nodes.Node node20 = textNode11.parent();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str24 = textNode23.getWholeText();
        java.lang.String str25 = textNode23.baseUri();
        org.jsoup.nodes.TextNode textNode27 = textNode23.text("hi!");
        org.jsoup.nodes.Node node28 = textNode27.clone();
        org.jsoup.nodes.Node node30 = textNode27.removeAttr("hi!");
        java.lang.String str31 = textNode27.toString();
        org.jsoup.nodes.Node node34 = textNode27.attr("#text", "hi!");
        java.lang.String str35 = textNode27.baseUri();
        org.jsoup.nodes.TextNode textNode37 = textNode27.text("h");
        boolean boolean38 = textNode11.equals((java.lang.Object) textNode37);
        java.lang.String str39 = textNode11.toString();
        boolean boolean40 = textNode2.equals((java.lang.Object) str39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node42 = textNode2.wrap("#");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        boolean boolean6 = textNode4.hasAttr("");
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "#text");
        java.lang.String str10 = textNode9.text();
        org.jsoup.nodes.Node node11 = textNode9.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("");
        boolean boolean14 = textNode4.equals((java.lang.Object) textNode13);
        java.lang.String str16 = textNode4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode4.siblingNodes();
        java.lang.String str19 = textNode4.absUrl("h");
        org.jsoup.nodes.Node node20 = textNode4.clone();
        org.jsoup.nodes.Node node21 = node20.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node21.wrap("hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode5.childNodes();
        boolean boolean7 = textNode5.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode5.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode5.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode5.wrap("h");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.nodeName();
        textNode2.setBaseUri("h");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode8.wrap("hi!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = textNode2.wrap("h");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText(0);
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.getWholeText();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        int int12 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = textNode2.wrap("i!");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("#text");
        java.lang.String str7 = textNode2.attr("");
        boolean boolean9 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Node node11 = textNode2.parent();
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode2.wrap("text");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.lang.String str4 = textNode2.absUrl("hi!");
        java.lang.String str6 = textNode2.absUrl("hi!");
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.toString();
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.splitText(1);
        org.jsoup.nodes.Node node13 = textNode12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode12.wrap("i!");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str11 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        java.lang.String str14 = textNode13.toString();
        java.lang.String str15 = textNode13.getWholeText();
        org.jsoup.nodes.Attributes attributes16 = textNode13.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode13.wrap("i!");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        org.jsoup.nodes.Attributes attributes7 = textNode6.attributes();
        java.lang.String str8 = textNode6.toString();
        boolean boolean9 = textNode6.isBlank();
        org.jsoup.nodes.Document document10 = textNode6.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode6.wrap("text");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("h");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("#text");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.toString();
        int int4 = textNode2.siblingIndex();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode2.wrap("i!");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str5 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("hi!");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode11.wrap("#");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode13.wrap("h");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("#text");
        textNode4.setBaseUri("#text");
        java.lang.String str9 = textNode4.toString();
        boolean boolean11 = textNode4.hasAttr("h");
        org.jsoup.nodes.Node node12 = textNode4.nextSibling();
        org.jsoup.nodes.Node node15 = textNode4.attr("text", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("hi!");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node6 = textNode2.attr("hi!", "hi!");
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.nodes.Node node12 = textNode2.attr("i!", "#text");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings13.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings13.indentAmount((int) (byte) 1);
        java.nio.charset.Charset charset33 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.TextNode textNode38 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str39 = textNode38.getWholeText();
        java.lang.String str40 = textNode38.baseUri();
        org.jsoup.nodes.TextNode textNode42 = textNode38.text("hi!");
        org.jsoup.nodes.Node node43 = textNode42.clone();
        org.jsoup.nodes.Node node45 = textNode42.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode42.siblingNodes();
        java.lang.String str48 = textNode42.absUrl("#text");
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean50 = outputSettings49.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings49.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean54 = outputSettings53.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode55 = outputSettings53.escapeMode();
        int int56 = outputSettings53.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings53.prettyPrint(false);
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean60 = outputSettings59.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode61 = outputSettings59.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings58.escapeMode(escapeMode61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings49.escapeMode(escapeMode61);
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings49.escapeMode();
        boolean boolean65 = textNode42.equals((java.lang.Object) escapeMode64);
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings32.escapeMode(escapeMode64);
        boolean boolean67 = textNode2.equals((java.lang.Object) outputSettings66);
        java.lang.String str68 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node70 = textNode2.wrap("#");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.lang.String str10 = textNode6.baseUri();
        org.jsoup.nodes.Node node11 = textNode6.nextSibling();
        org.jsoup.nodes.Node node12 = textNode6.clone();
        java.lang.String str14 = textNode6.attr("#");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode6.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode6.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = textNode6.wrap("text");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        int int17 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = textNode2.wrap("i!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode19.wrap("#");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str9 = textNode2.getWholeText();
        boolean boolean11 = textNode2.hasAttr("text");
        textNode2.setBaseUri("i!");
        int int14 = textNode2.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("i!");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.Document document3 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode5.nodeName();
        boolean boolean7 = textNode5.isBlank();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = textNode5.wrap("hi!");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        org.jsoup.nodes.Node node31 = textNode17.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = node31.wrap("#text");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes7 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        org.jsoup.nodes.Node node14 = textNode2.attr("i!", "i!");
        java.lang.String str15 = textNode2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode2.wrap("h");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        java.lang.String str9 = textNode6.nodeName();
        org.jsoup.nodes.Node node10 = textNode6.clone();
        org.jsoup.nodes.Node node12 = textNode6.removeAttr("hi!");
        int int13 = textNode6.siblingIndex();
        textNode6.setBaseUri("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode6.wrap("h");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.getWholeText();
        org.jsoup.nodes.Node node6 = textNode4.parent();
        java.lang.String str7 = textNode4.nodeName();
        textNode4.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode4.wrap("#");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        boolean boolean6 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("hi!");
        textNode2.setBaseUri("");
        java.lang.String str11 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode15.wrap("text");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean7 = textNode2.hasAttr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        java.lang.String str11 = textNode2.nodeName();
        java.lang.String str13 = textNode2.attr("hi!");
        org.jsoup.nodes.Node node14 = textNode2.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = textNode2.wrap("#");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.jsoup.nodes.Node node30 = textNode6.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = textNode6.wrap("#");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        org.jsoup.nodes.Node node9 = textNode6.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode6.siblingNodes();
        boolean boolean12 = textNode6.hasAttr("h");
        org.jsoup.nodes.Attributes attributes13 = textNode6.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = textNode6.wrap("h");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
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
        textNode10.setBaseUri("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = textNode10.wrap("#text");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.childNodes();
        org.jsoup.nodes.Node node26 = textNode2.attr("text", "#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = textNode2.wrap("i!");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("i!");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        org.jsoup.nodes.TextNode textNode18 = textNode16.splitText((int) (byte) 0);
        java.lang.String str19 = textNode16.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = textNode16.wrap("text");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        org.jsoup.nodes.Node node7 = textNode6.clone();
        java.lang.String str8 = textNode6.baseUri();
        org.jsoup.nodes.TextNode textNode10 = textNode6.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = textNode10.wrap("#text");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        java.lang.String str12 = textNode2.attr("i!");
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str20 = textNode19.baseUri();
        boolean boolean22 = textNode19.hasAttr("#text");
        java.lang.String str24 = textNode19.attr("");
        textNode19.setBaseUri("#text");
        org.jsoup.nodes.Node node27 = textNode19.clone();
        java.lang.String str28 = textNode19.text();
        textNode19.setBaseUri("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode19.childNodes();
        boolean boolean32 = textNode2.equals((java.lang.Object) nodeList31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node34 = textNode2.wrap("#text");
    }
}

